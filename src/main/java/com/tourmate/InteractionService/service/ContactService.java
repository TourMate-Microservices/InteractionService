package com.tourmate.InteractionService.service;

import com.tourmate.InteractionService.dto.ContactDto;

import java.util.List;

public interface ContactService {
    List<ContactDto> getAll();
    ContactDto getById(Integer id);
    ContactDto create(ContactDto contactDto);
    ContactDto update(Integer id, ContactDto contactDto);
    void delete(Integer id);
}
