package com.gs3.evaluation.mapper;

import java.util.List;
import java.util.Set;

public interface BaseMapper<E, D> {

    D toDto(E entity);

    E toEntity(D dto);

    List<D> toDto(List<E> entities);

    List<E> toEntity(List<D> dtos);

    Set<D> toDto(Set<E> entities);

    Set<E> toEntity(Set<D> dtos);

}