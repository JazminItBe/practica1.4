package com.practicalab.services;

import com.practicalab.models.usuario;
import com.practicalab.repository.CRUDusuario;
import com.practicalab.repository.usuarioRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usuarioServices extends CRUDusuario<usuario, usuarioRepository> {


}
