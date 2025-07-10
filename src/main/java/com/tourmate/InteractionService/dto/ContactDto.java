package com.tourmate.InteractionService.dto;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ContactDto {
    private Integer contactId;

    private String fullName;

    private String phone;

    private String email;

    private String title;

    private String content;

    private LocalDateTime createdAt;

    private Boolean isProcessed;
}
