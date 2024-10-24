package com.example.blogging.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.blogging.repository.TagRepository;
import com.example.blogging.dto.TagDto;
import com.example.blogging.entity.Tag;

import java.util.List;
import java.util.Optional;

@Service
public class TagService {

    @Autowired
    private TagRepository tagRepository;

    public List<Tag> findAll() {
        return tagRepository.findAll();
    }

    public Optional<Tag> findById(Long id) {
        return tagRepository.findById(id);
    }

    public boolean deleteTag(Long id) {
        tagRepository.deleteById(id);
        return true;
    }

    public Tag searchTag(Long id) {
        return tagRepository.findById(id).orElse(null);
    }

    public Tag createTag(TagDto tagDto) {
        Tag tagInfo = new Tag();
        tagInfo.setName_tag(tagDto.getName_tag());

        return tagRepository.save(tagInfo);
    }

    public boolean updateTag(Long id, TagDto tagDto) {
        Optional<Tag> optionalTag = tagRepository.findById(id);

        if (optionalTag.isPresent()) {
            Tag tagToUpdate = optionalTag.get();
            tagToUpdate.setName_tag(tagDto.getName_tag());

            tagRepository.save(tagToUpdate);
            return true;
        } else {
            return false;
        }
    }
}
