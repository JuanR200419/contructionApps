package com.example.blogging.controller;

import com.example.blogging.services.StateService;
import com.example.blogging.dto.StateDto;
import com.example.blogging.entity.State;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/states")
public class StateController {

    @Autowired
    private StateService stateService;

    @GetMapping
    public List<State> findAllStates() {
        return stateService.findAll();
    }

    @GetMapping("/{id}")
    public State findById(@PathVariable Long id) {
        return stateService.findById(id).orElse(null);
    }

    @PostMapping
    public State createState( @Valid  @RequestBody StateDto stateDto) {
        return stateService.createState(stateDto);
    }

    @PutMapping("/{id}")
    public boolean updateState( @Valid @PathVariable Long id, @RequestBody StateDto stateDto) {
        return stateService.updateState(id, stateDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteState(@PathVariable Long id) {
        return stateService.deleteState(id);
    }
}
