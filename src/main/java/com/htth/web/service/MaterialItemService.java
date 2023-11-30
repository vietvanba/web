package com.htth.web.service;

import com.example.htth.entity.MaterialItem;
import com.example.htth.mapper.ItemMapper;
import com.example.htth.repository.MaterialItemRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialItemService {
    @Autowired
    private MaterialItemRepository repository;
    @Autowired
    private ModelMapper mapper;
    public List<ItemMapper> IgetAll() {
        try {
            List<ItemMapper> result = repository.findAll().stream().map(x-> mapper.map(x, ItemMapper.class)).toList();
            return result;
        } catch (Exception e) {
            throw new RuntimeException("Can't access to list item");
        }
    }
}
