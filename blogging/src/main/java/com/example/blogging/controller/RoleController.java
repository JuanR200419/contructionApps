package com.example.blogging.controller;

import com.example.blogging.services.RoleService;
import com.example.blogging.dto.RoleDto;
import com.example.blogging.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/roles")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> findAll() {
        return roleService.findAll();
    }

    public Optional<Role> findById(Long id) {
        return roleService.findById(id);
    }

    public Role createRole(RoleDto roleDto) {
        return roleService.createRole(roleDto);
    }

    public boolean updateRole(Long id, RoleDto roleDto) {
        return roleService.updateRole(id, roleDto);
    }

    public boolean deleteRole(Long id) {
        return roleService.deleteRole(id);
    }
}
