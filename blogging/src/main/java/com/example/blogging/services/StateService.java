package com.example.blogging.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.StateRepository;
import com.example.blogging.dto.StateDto;
import com.example.blogging.entity.State;

import java.util.List;
import java.util.Optional;

@Service
public class StateService {

    @Autowired
    private StateRepository stateRepository;

    public List<State> findAll() {
        return stateRepository.findAll();
    }

    public Optional<State> findById(Long id) {
        return stateRepository.findById(id);
    }

    public boolean deleteState(Long id) {
        stateRepository.deleteById(id);
        return true;
    }

    public State searchState(Long id) {
        return stateRepository.findById(id).orElse(null);
    }

    public State createState(StateDto stateDto) {
        State stateInfo = new State();
        stateInfo.setName_state(stateDto.getName_state());
        stateInfo.setPost(stateDto.getPost());

        return stateRepository.save(stateInfo);
    }

    public boolean updateState(Long id, StateDto stateDto) {
        Optional<State> optionalState = stateRepository.findById(id);

        if (optionalState.isPresent()) {
            State stateToUpdate = optionalState.get();
            stateToUpdate.setName_state(stateDto.getName_state());
            stateToUpdate.setPost(stateDto.getPost());

            stateRepository.save(stateToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
