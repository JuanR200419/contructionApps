package com.example.blogging.controller;

import com.example.blogging.services.TagService;
import com.example.blogging.dto.TagDto;
import com.example.blogging.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/tags")
public class TagController {

    @Autowired
    private TagService tagService;

    @GetMapping
    public List<Tag> findAllTags() {
        return tagService.findAll();
    }

    @GetMapping("/{id}")
    public Tag findById(@PathVariable Long id) {
        return tagService.findById(id).orElse(null);
    }

    @PostMapping
    public Tag createTag(@RequestBody TagDto tagDto) {
        return tagService.createTag(tagDto);
    }

    @PutMapping("/{id}")
    public boolean updateTag(@PathVariable Long id, @RequestBody TagDto tagDto) {
        return tagService.updateTag(id, tagDto);
    }

    @DeleteMapping("/{id}")
    public boolean deleteTag(@PathVariable Long id) {
        return tagService.deleteTag(id);
    }
}
