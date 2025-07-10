package com.tourmate.InteractionService.controller;

import com.tourmate.InteractionService.dto.CVApplicationDto;
import com.tourmate.InteractionService.service.CVApplicationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cv-applications")
@RequiredArgsConstructor
public class CVApplicationController {
    private final CVApplicationService cvApplicationService;

    @GetMapping
    public List<CVApplicationDto> getAll() {
        return cvApplicationService.getAll();
    }

    @GetMapping("/{id}")
    public CVApplicationDto getById(@PathVariable Integer id) {
        return cvApplicationService.getById(id);
    }

    @PostMapping
    public CVApplicationDto create(@RequestBody CVApplicationDto cvApplicationDto) {
        return cvApplicationService.create(cvApplicationDto);
    }

    @PutMapping("/{id}")
    public CVApplicationDto update(@PathVariable Integer id, @RequestBody CVApplicationDto cvApplicationDto) {
        return cvApplicationService.update(id, cvApplicationDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        cvApplicationService.delete(id);
    }
}
