package com.projetojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetojpa.entity.produto;

public interface produtoRepository extends JpaRepository<produto, Long> {

}
