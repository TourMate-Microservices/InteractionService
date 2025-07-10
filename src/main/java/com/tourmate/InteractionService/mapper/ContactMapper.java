package com.tourmate.InteractionService.mapper;

import com.tourmate.InteractionService.dto.ContactDto;
import com.tourmate.InteractionService.entity.Contact;

public class ContactMapper {
    public static ContactDto toDto(Contact contact) {
        if (contact == null) return null;

        ContactDto dto = new ContactDto();
        dto.setContactId(contact.getContactId());
        dto.setFullName(contact.getFullName());
        dto.setPhone(contact.getPhone());
        dto.setEmail(contact.getEmail());
        dto.setTitle(contact.getTitle());
        dto.setContent(contact.getContent());
        dto.setCreatedAt(contact.getCreatedAt());
        dto.setIsProcessed(contact.getIsProcessed());
        return dto;
    }

    public static Contact toEntity(ContactDto dto) {
        if (dto == null) return null;

        Contact contact = new Contact();
        contact.setContactId(dto.getContactId());
        contact.setFullName(dto.getFullName());
        contact.setPhone(dto.getPhone());
        contact.setEmail(dto.getEmail());
        contact.setTitle(dto.getTitle());
        contact.setContent(dto.getContent());
        contact.setCreatedAt(dto.getCreatedAt());
        contact.setIsProcessed(dto.getIsProcessed());
        return contact;
    }
}
