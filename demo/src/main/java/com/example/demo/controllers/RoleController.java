package com.example.demo.controllers;

import com.example.demo.models.role.Role;
import com.example.demo.response.ResponseObject;
import com.example.demo.services.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("${api.prefix}/roles")
public class RoleController {
    private final RoleService roleService;

    @GetMapping("")
    public ResponseEntity<ResponseObject> getAllRoles(){
        List<Role> roles = roleService.getAllRoles();
        return ResponseEntity.ok().body(
                ResponseObject.builder()
                        .status(HttpStatus.OK)
                        .message("lấy danh sách quyền hệ thống thành công")
                        .data(roles)
                        .build()
        );
    }
}