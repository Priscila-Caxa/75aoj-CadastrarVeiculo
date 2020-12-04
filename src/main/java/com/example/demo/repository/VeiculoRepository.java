package com.example.demo.repository;

import com.example.demo.domain.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.Veiculo;

@Repository
public interface Veiculo Repository extends JpaRepository<Veiculo, Integer>{

}
