package io.github.toquery.example.spring.boot.querydsl.bff.open.controller;

import io.github.toquery.example.spring.boot.querydsl.modules.order.entity.Order;
import io.github.toquery.example.spring.boot.querydsl.modules.order.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *
 */
@RequiredArgsConstructor
@RestController
@RequestMapping("/open/order")
public class OpenOrderController {

    private final OrderService orderService;

    @GetMapping
    public List<Order> page(@RequestParam(required = false) Integer page, @RequestParam(required = false) Integer size) {
        return orderService.page(page, size);
    }

    @GetMapping("/list")
    public List<Order> list(@RequestParam(required = false) Long userId, @RequestParam(required = false) List<Long> orderIds) {
        return orderService.list(userId, orderIds);
    }

    @PostMapping
    public List<Order> save(Order order) {
        return orderService.save(order);
    }

    @PutMapping
    public Order update(Order order) {
        return orderService.update(order);
    }


    @DeleteMapping
    public void delete(@RequestParam(required = false) Long id) {
        orderService.delete(id);
    }

}
