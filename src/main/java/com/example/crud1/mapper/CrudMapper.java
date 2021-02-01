package com.example.crud1.mapper;

import com.example.crud1.dto.CrudDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CrudMapper {
    void insertItem(CrudDto crudDto);

    void deleteItem(int itemId);

    void updateItem(CrudDto crudDto);

    List<CrudDto> selectItem(int itemId);
}
