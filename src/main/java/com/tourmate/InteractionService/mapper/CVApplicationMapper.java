package com.tourmate.InteractionService.mapper;

import com.tourmate.InteractionService.dto.CVApplicationDto;
import com.tourmate.InteractionService.entity.CVApplication;

public class CVApplicationMapper {
    public static CVApplicationDto toDto(CVApplication cvApplication) {
        if (cvApplication == null) return null;

        CVApplicationDto dto = new CVApplicationDto();
        dto.setCvApplicationId(cvApplication.getCvApplicationId());
        dto.setFullName(cvApplication.getFullName());
        dto.setDateOfBirth(cvApplication.getDateOfBirth());
        dto.setGender(cvApplication.getGender());
        dto.setAddress(cvApplication.getAddress());
        dto.setEmail(cvApplication.getEmail());
        dto.setPhone(cvApplication.getPhone());
        dto.setLink(cvApplication.getLink());
        dto.setImage(cvApplication.getImage());
        dto.setDescription(cvApplication.getDescription());
        dto.setStatus(cvApplication.getStatus());
        dto.setResponse(cvApplication.getResponse());
        dto.setCreatedAt(cvApplication.getCreatedAt());
        dto.setAreaId(cvApplication.getAreaId());
        return dto;
    }

    public static CVApplication toEntity(CVApplicationDto dto) {
        if (dto == null) return null;

        CVApplication cvApplication = new CVApplication();
        cvApplication.setCvApplicationId(dto.getCvApplicationId());
        cvApplication.setFullName(dto.getFullName());
        cvApplication.setDateOfBirth(dto.getDateOfBirth());
        cvApplication.setGender(dto.getGender());
        cvApplication.setAddress(dto.getAddress());
        cvApplication.setEmail(dto.getEmail());
        cvApplication.setPhone(dto.getPhone());
        cvApplication.setLink(dto.getLink());
        cvApplication.setImage(dto.getImage());
        cvApplication.setDescription(dto.getDescription());
        cvApplication.setStatus(dto.getStatus());
        cvApplication.setResponse(dto.getResponse());
        cvApplication.setCreatedAt(dto.getCreatedAt());
        cvApplication.setAreaId(dto.getAreaId());
        return cvApplication;
    }
}
