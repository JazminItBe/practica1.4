package com.practicalab.restcontrollers;

import antlr.collections.List;
import com.practicalab.models.pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping

public class pedidoRestcontrollers {

    @Autowired
    pedidoRestcontrollers service;
    @GetMapping("/list")
    public List<pedido> list(){
        return service.list();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody pedido pedido, @PathVariable int id){
        service.update(pedido,id);
    }
    @PostMapping("/add")
    public void add(@RequestBody pedido pedido) {
        service.add(pedido);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
