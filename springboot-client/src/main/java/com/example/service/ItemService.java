package com.example.service;

import com.example.model.Item;
import com.example.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public void test() {
        itemRepository.save(new Item("111", "apple", 10));
        itemRepository.save(new Item("222", "orange", 20));
        itemRepository.save(new Item("333", "banana", 30));
    }

    @Transactional
    public void testTransaction() {
        itemRepository.save(new Item("444", "banana", 40));
//        int i = 5/0;
        itemRepository.save(new Item("555", "banana", 50));
    }
}
