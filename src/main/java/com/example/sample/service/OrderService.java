package com.example.sample.service;

import com.example.sample.model.Order;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderService {
    private List<Order> orders = new ArrayList<>();
    public List<Order> getOrders(){

        loadOrders();
        return orders;
    }

    public  void loadOrders(){
        Order shirt = new Order(1,"shirt",20);
        Order jacket = new Order(2,"jacket",200);
        Order cycle = new Order(3,"cycle",800);

        this.orders.add(shirt);
        this.orders.add(jacket);
        this.orders.add(cycle);

    }
}
