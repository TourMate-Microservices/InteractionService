package com.tourmate.InteractionService.service.impl;

import com.tourmate.InteractionService.dto.ContactDto;
import com.tourmate.InteractionService.entity.Contact;
import com.tourmate.InteractionService.mapper.ContactMapper;
import com.tourmate.InteractionService.repository.ContactRepository;
import com.tourmate.InteractionService.service.ContactService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ContactServiceImpl implements ContactService {
    private final ContactRepository repository;

    @Override
    public List<ContactDto> getAll() {
        return repository.findAll().stream()
                .map(ContactMapper::toDto)
                .toList();
    }

    @Override
    public ContactDto getById(Integer id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found"));
        return ContactMapper.toDto(entity);
    }

    @Override
    public ContactDto create(ContactDto contactDto) {
        Contact entity = ContactMapper.toEntity(contactDto);
        entity.setCreatedAt(LocalDateTime.now());
        Contact savedEntity = repository.save(entity);
        return ContactMapper.toDto(savedEntity);
    }

    @Override
    public ContactDto update(Integer id, ContactDto contactDto) {
        Contact existed = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contact not found"));

        existed.setFullName(contactDto.getFullName());
        existed.setPhone(contactDto.getPhone());
        existed.setEmail(contactDto.getEmail());
        existed.setTitle(contactDto.getTitle());
        existed.setContent(contactDto.getContent());
        existed.setIsProcessed(contactDto.getIsProcessed());
        Contact updatedEntity = repository.save(existed);
        return ContactMapper.toDto(updatedEntity);
    }

    @Override
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Contact not found");
        }
        repository.deleteById(id);
    }
}
