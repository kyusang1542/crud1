package com.example.crud1.service;

import com.example.crud1.dto.CrudDto;
import com.example.crud1.mapper.CrudMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrudServiceImpl implements CrudService{

    @Autowired
    private CrudMapper crudMapper;

    @Override
    public void insertItem(CrudDto crudDto) {
        crudMapper.insertItem(crudDto);
    }

    @Override
    public void deleteItem(int itemId) {
        crudMapper.deleteItem(itemId);
        System.out.println(itemId + " + 2번");
    }

    @Override
    public void updateItem(CrudDto crudDto) {
        crudMapper.updateItem(crudDto);
    }

    @Override
    public List<CrudDto> selectItem(int itemId) {
        return crudMapper.selectItem(itemId);
    }
}
