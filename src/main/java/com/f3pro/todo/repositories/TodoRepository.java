package com.f3pro.todo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.f3pro.todo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Integer>{

    @Query("SELECT obj FROM Todo  obj where  obj.finalizado =false ORDER BY obj.dataParaFinalizar")
    List<Todo> findAllOpen();

    @Query("SELECT obj FROM Todo  obj where  obj.finalizado =true ORDER BY obj.dataParaFinalizar")
    List<Todo> findAllClose();
}