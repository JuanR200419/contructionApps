package com.example.blogging.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.Repository.RoleRepository;
import com.example.blogging.dto.RoleDto;
import com.example.blogging.entity.Role;

import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public boolean deleteRole(Long id) {
        roleRepository.deleteById(id);
        return true;
    }

    public Role searchRole(Long id) {
        return roleRepository.findById(id).orElse(null);
    }

    public Role createRole(RoleDto roleDto) {
        Role roleInfo = new Role();
        roleInfo.setName_role(roleDto.getName_role());
        roleInfo.setUser(roleDto.getUser());
        return roleRepository.save(roleInfo);
    }

    public boolean updateRole(Long id, RoleDto roleDto) {
        Optional<Role> optionalRole = roleRepository.findById(id);
        if (optionalRole.isPresent()) {
            Role roleToUpdate = optionalRole.get();
            roleToUpdate.setName_role(roleDto.getName_role());
            roleToUpdate.setUser(roleDto.getUser());
            roleRepository.save(roleToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
