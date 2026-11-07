package com.siva.todo_management.service.impl;

import com.siva.todo_management.dto.TodoDto;
import com.siva.todo_management.entity.Todo;
import com.siva.todo_management.service.TodoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import com.siva.todo_management.repository.TodoRepository;


@Service
@AllArgsConstructor
public class TodoServiceImpl  implements TodoService {

   private TodoRepository todoRepository;

   private ModelMapper modelMaper;
    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        //convert TodoDto into Todo Jpa entity

//        Todo todo=new Todo();
//        todo.setTitle(todoDto.getTitle());
//        todo.setDescription(todoDto.getDescription());
//        todo.setCompleted(todoDto.isCompleted());

        Todo todo=modelMaper.map(todoDto,Todo.class);

        //Todo Jpa enitty
       Todo saveTodo= todoRepository.save(todo);



       //convert saved Todo jpa entity object into TodoDto object

//        TodoDto savedTodoDto=new TodoDto();
//        savedTodoDto.setId(saveTodo.getId());
//        savedTodoDto.setTitle(saveTodo.getTitle());
//        savedTodoDto.setDescription(saveTodo.getDescription());
//        savedTodoDto.setCompleted(saveTodo.isCompleted());

        TodoDto savedTodoDto=modelMaper.map(saveTodo,TodoDto.class);


        return savedTodoDto;
    }

    @Override
    public TodoDto getTodo(Long id) {

       Todo todo= todoRepository.findById(id).get();
        return modelMaper.map(todo,TodoDto.class);
    }
}
