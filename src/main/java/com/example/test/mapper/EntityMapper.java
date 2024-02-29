package com.example.test.mapper;

public interface EntityMapper<Dto, Entity> {
    Entity toEntity(final Dto dto);
    Dto toDto(final Entity entity);
}
