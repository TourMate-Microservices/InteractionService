package com.tourmate.InteractionService.controller;

import com.tourmate.InteractionService.dto.ContactDto;
import com.tourmate.InteractionService.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/contacts")
@RequiredArgsConstructor
public class ContactController {
    private final ContactService contactService;

    @GetMapping
    public List<ContactDto> getAll() {
        return contactService.getAll();
    }

    @GetMapping("/{id}")
    public ContactDto getById(@PathVariable Integer id) {
        return contactService.getById(id);
    }

    @PostMapping
    public ContactDto create(@RequestBody ContactDto contactDto) {
        return contactService.create(contactDto);
    }

    @PutMapping("/{id}")
    public ContactDto update(@PathVariable Integer id,@RequestBody ContactDto contactDto) {
        return contactService.update(id, contactDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        contactService.delete(id);
    }
}
