package com.htth.web.controller;


import com.htth.web.service.EquipmentService;
import com.htth.web.service.ItemService;
import com.htth.web.service.MaterialItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/")
public class ItemController {
    @Autowired
    private ItemService service;
    @Autowired
    private MaterialItemService materialItemService;
    @Autowired
    private EquipmentService equipmentService;

    @GetMapping("item")
    public ResponseEntity<?> getAllItem() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("material")
    public ResponseEntity<?> getAllMaterialItem() {
        return ResponseEntity.ok(materialItemService.getAll());
    }

    @GetMapping("equipment")
    public ResponseEntity<?> getAllEquipment() {
        return ResponseEntity.ok(equipmentService.getAll());
    }
}