package com.tourmate.InteractionService.service;

import com.tourmate.InteractionService.dto.CVApplicationDto;

import java.util.List;

public interface CVApplicationService {
    List<CVApplicationDto> getAll();
    CVApplicationDto getById(Integer id);
    CVApplicationDto create(CVApplicationDto dto);
    CVApplicationDto update(Integer id, CVApplicationDto dto);
    void delete(Integer id);
}
