package com.practicalab.restcontrollers;

import antlr.collections.List;
import com.practicalab.models.usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping

public class usuarioRestcontrollers {

    @Autowired
    usuario service;
    @GetMapping("/list")
    public List<usuario> list(){
        return service.list();
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody usuario usuario, @PathVariable int id){
        service.update(usuario,id);
    }
    @PostMapping("/add")
    public void add(@RequestBody usuario usuario) {
        service.add(usuario);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        service.delete(id);
    }
}
