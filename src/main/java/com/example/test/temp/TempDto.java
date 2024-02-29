package com.example.test.temp;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TempDto {
    private Long tempId;

    @NotBlank(message = "공백 에러")
    private String tempName;
}
