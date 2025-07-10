package com.tourmate.InteractionService.service.impl;

import com.tourmate.InteractionService.dto.CVApplicationDto;
import com.tourmate.InteractionService.entity.CVApplication;
import com.tourmate.InteractionService.mapper.CVApplicationMapper;
import com.tourmate.InteractionService.repository.CVApplicationRepository;
import com.tourmate.InteractionService.service.CVApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CVApplicationServiceImpl implements CVApplicationService {
    private final CVApplicationRepository repository;

    @Override
    public List<CVApplicationDto> getAll() {
        return repository.findAll().stream()
                .map(CVApplicationMapper::toDto)
                .toList();
    }

    @Override
    public CVApplicationDto getById(Integer id) {
        var entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("CVApplication not found"));
        return CVApplicationMapper.toDto(entity);
    }

    @Override
    public CVApplicationDto create(CVApplicationDto dto) {
        CVApplication entity = CVApplicationMapper.toEntity(dto);
        entity.setCreatedAt(LocalDateTime.now());
        CVApplication savedEntity = repository.save(entity);
        return CVApplicationMapper.toDto(savedEntity);
    }

    @Override
    public CVApplicationDto update(Integer id, CVApplicationDto dto) {
        CVApplication existed = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("CVApplication not found"));

        existed.setFullName(dto.getFullName());
        existed.setDateOfBirth(dto.getDateOfBirth());
        existed.setGender(dto.getGender());
        existed.setAddress(dto.getAddress());
        existed.setEmail(dto.getEmail());
        existed.setPhone(dto.getPhone());
        existed.setLink(dto.getLink());
        existed.setImage(dto.getImage());
        existed.setDescription(dto.getDescription());
        existed.setStatus(dto.getStatus());
        existed.setResponse(dto.getResponse());
        existed.setAreaId(dto.getAreaId());
        CVApplication updatedEntity = repository.save(existed);
        return CVApplicationMapper.toDto(updatedEntity);
    }

    @Override
    public void delete(Integer id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("CVApplication not found");
        }
        repository.deleteById(id);

    }
}
