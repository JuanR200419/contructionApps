package com.example.blogging.controller;

import com.example.blogging.services.TagService;
import com.example.blogging.dto.TagDto;
import com.example.blogging.entity.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public Optional<Tag> findById(Long id) {
        return tagService.findById(id);
    }

    public boolean deleteTag(Long id) {
        return tagService.deleteTag(id);
    }

    public Tag createTag(TagDto tagDto) {
        return tagService.createTag(tagDto);
    }

    public boolean updateTag(Long id, TagDto tagDto) {
        return tagService.updateTag(id, tagDto);
    }
}
