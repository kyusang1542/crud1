package com.example.crud1.service;

import com.example.crud1.dto.CrudDto;

import java.util.List;

public interface CrudService {
    void insertItem(CrudDto crudDto);

    void deleteItem(int itemId);

    void updateItem(CrudDto crudDto);

    List<CrudDto> selectItem(int itemId);
}
