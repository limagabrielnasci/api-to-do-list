package br.com.limagabrielnasci.challenge_todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.limagabrielnasci.challenge_todolist.entity.Todo;

// interface que fornece operações crud para a entidade Todo
public interface TodoRepository extends JpaRepository<Todo, Long> {

    // JpaRepository já fornece métodos save, findById, findALl, delete, etc
    
}
