package com.example.crud1.controller;

import com.example.crud1.dto.CrudDto;
import com.example.crud1.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CrudController {

    @Autowired
    private CrudService crudService;

    @RequestMapping(value = "/create/item", method = RequestMethod.GET)
    public void insertItem (@RequestBody CrudDto crudDto) throws Exception{
        crudService.insertItem(crudDto);
    }

    @RequestMapping(value = "/delete/item/{itemId}", method = RequestMethod.GET)
    public void deleteItem (@PathVariable("itemId") int itemId) throws Exception{
        crudService.deleteItem(itemId);
        System.out.println(itemId + " + 1번");
    }

    @RequestMapping(value = "/update/item", method = RequestMethod.GET)
    public void updateItem (@RequestBody CrudDto crudDto) throws Exception{
        crudService.updateItem(crudDto);
    }

    @RequestMapping(value = "/read/item/{itemId}", method = RequestMethod.GET)
    public List<CrudDto> selectItem (@PathVariable("itemId") int itemId) throws Exception {

        return crudService.selectItem(itemId);
    }
}
