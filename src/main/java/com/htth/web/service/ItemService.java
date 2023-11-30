package com.htth.web.service;

import com.htth.web.mapper.ItemMapper;
import com.htth.web.repository.ItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    private ItemRepository repository;
    @Autowired
    private ModelMapper mapper;
    public List<ItemMapper> getAll(){
        try{
            List<ItemMapper> result = repository.findAll().stream().map(x-> mapper.map(x, ItemMapper.class)).toList();
            return result;
        }catch (Exception e){
            throw new RuntimeException("Can't access to list item");
        }
    }
}
