package com.springapp.mapper;

import java.util.List;

public interface EntityMapper<D, E> {

    /**
     * DTO to Entity
     * @param dto
     * @return
     */
    E toEntity(D dto);

    /**
     * Entity to DTO
     * @param entity
     * @return
     */
    D toDto(E entity);

    /**
     * DTO collection Entity collection
     * @param dtoList
     * @return
     */
    List <E> toEntity(List<D> dtoList);

    /**
     * Entity collection  DTO collection 
     * @param entityList
     * @return
     */
    List <D> toDto(List<E> entityList);
}

