package com.example.test.temp;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.test.mapper.EntityMapper;

@Mapper
public interface TempMapper extends EntityMapper<TempDto, TempEntity> {
    TempMapper mapper = Mappers.getMapper(TempMapper.class);
}
