package com.htth.web.service;

import com.htth.web.mapper.EquipmentMapper;
import com.htth.web.repository.EquipmentRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquipmentService {
    @Autowired
    private EquipmentRepository repository;
    @Autowired
    private ModelMapper mapper;
    public List<EquipmentMapper> getAll(){
        try{
            List<EquipmentMapper> result = repository.findAll().stream().map(x-> mapper.map(x, EquipmentMapper.class)).toList();
            return result;
        }catch (Exception e){
            throw new RuntimeException("Can't access to list item");
        }
    }
}
