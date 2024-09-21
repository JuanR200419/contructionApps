package com.example.blogging.controller;

import com.example.blogging.services.StateService;
import com.example.blogging.dto.StateDto;
import com.example.blogging.entity.State;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public Optional<State> findById(Long id) {
        return stateService.findById(id);
    }

    public boolean deleteState(Long id) {
        return stateService.deleteState(id);
    }

    public State createState(StateDto stateDto) {
        return stateService.createState(stateDto);
    }

    public boolean updateState(Long id, StateDto stateDto) {
        return stateService.updateState(id, stateDto);
    }
}
