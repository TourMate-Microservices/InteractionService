package com.tourmate.InteractionService.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "CVApplication")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CVApplication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer cvApplicationId;

    @Column(nullable = false, length = 255)
    private String fullName;

    @Column(nullable = false)
    private LocalDate dateOfBirth;

    @Column(nullable = false, length = 50)
    private String gender;

    @Column(nullable = false, length = 255)
    private String address;

    @Column(nullable = false, length = 255)
    private String email;

    @Column(nullable = false, length = 10)
    private String phone;

    @Column(length = 255)
    private String link;

    @Column(nullable = false, length = 255)
    private String image;

    @Column(columnDefinition = "nvarchar(max)")
    private String description;

    @Column(nullable = false, length = 50)
    private String status;

    @Column(columnDefinition = "nvarchar(max)")
    private String response;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private Integer areaId;

    // @ManyToOne
    // @JoinColumn(name = "areaId", insertable = false, updatable = false)
    // private Area area;
}