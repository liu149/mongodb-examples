package com.example.controller;

import com.example.service.ItemService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/hello")
    public String test() {
        return "hello world";
    }

    @GetMapping("/save")
    public void save() {
        itemService.test();
    }

    @GetMapping("/testTransaction")
    public void testTransaction() {
        itemService.testTransaction();
    }
}
