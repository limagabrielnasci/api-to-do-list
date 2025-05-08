package br.com.limagabrielnasci.challenge_todolist.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import br.com.limagabrielnasci.challenge_todolist.entity.Todo;
import br.com.limagabrielnasci.challenge_todolist.repository.TodoRepository;

@Service
public class TodoService {

    private TodoRepository todoRepository;
    
    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo); // salvando no banco de dados
        return list();
    }

    public List<Todo> list() {
        // cria um objeto de ordenação para ordenar por prioridade e nome
        Sort sort = Sort.by("priority").descending().and(
            Sort.by("name").ascending()
        );
        return todoRepository.findAll(sort);
    }

    public List<Todo> update(Todo todo) {
        todoRepository.save(todo); // salva ou atualiza o Todo no banco de dados
        return list();
    }

    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id); // excluindo o Todo pelo id
        return list();
    }

}
