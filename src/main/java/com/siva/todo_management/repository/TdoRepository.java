package com.siva.todo_management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.siva.todo_management.entity.Todo;

public interface TdoRepository extends JpaRepository <Todo,Long>{


}
