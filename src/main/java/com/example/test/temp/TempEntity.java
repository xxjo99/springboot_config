package com.example.test.temp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "temp")
@Getter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class TempEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long tempId;

    private String tempName;
}
