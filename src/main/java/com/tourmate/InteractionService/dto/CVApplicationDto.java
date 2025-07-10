package com.tourmate.InteractionService.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CVApplicationDto {
    private Integer cvApplicationId;

    private String fullName;

    private LocalDate dateOfBirth;

    private String gender;

    private String address;

    private String email;

    private String phone;

    private String link;

    private String image;

    private String description;

    private String status;

    private String response;

    private LocalDateTime createdAt;

    private Integer areaId;

    // private Area area;
}
