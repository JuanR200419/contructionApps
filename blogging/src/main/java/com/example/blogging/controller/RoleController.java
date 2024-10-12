package com.example.blogging.controller;

import com.example.blogging.services.RoleService;
import com.example.blogging.dto.RoleDto;
import com.example.blogging.entity.Role;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public Role findById(@PathVariable Long id) {
        return roleService.findById(id).orElse(null);
    }

    @PostMapping
    public Role createRole( @Valid @RequestBody RoleDto roleDto) {
        return roleService.createRole(roleDto);
    }

    @PutMapping("/{id}")
    public boolean updateRole(@Valid  @PathVariable Long id, @RequestBody RoleDto roleDto) {
        return roleService.updateRole(id, roleDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteRole(@PathVariable Long id) {
        return roleService.deleteRole(id);
    }
}
