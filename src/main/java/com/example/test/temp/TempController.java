package com.example.test.temp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.exception.ApiRuntimeException;
import com.example.test.exception.ExceptionType;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/temp")
public class TempController {
    private final TempService tempService;

    @GetMapping("/all")
    public List<TempDto> getAllDatas() {

        try {

            List<TempEntity> tempEntityList = tempService.getAllDatas();

            // Entity to Dto
            List<TempDto> tempDtoList = new ArrayList<>();
            for (TempEntity tempEntity : tempEntityList) {
                TempDto tempDto = TempMapper.mapper.toDto(tempEntity);
                tempDtoList.add(tempDto);
            }

            return tempDtoList;
        } catch (RuntimeException e) {
            throw new ApiRuntimeException(ExceptionType.SERVER_ERROR, e);
        }

    }

    @PostMapping("/save")
    public void saveData(@RequestBody @Valid TempDto tempDto) {
        // Dto to Entity
        TempEntity tempEntity = TempMapper.mapper.toEntity(tempDto);
        tempService.saveData(tempEntity);
    }

}
