package com.practicalab.repository;

import com.practicalab.models.usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface pedidoRepository extends JpaRepository<usuario, Integer > {
}
