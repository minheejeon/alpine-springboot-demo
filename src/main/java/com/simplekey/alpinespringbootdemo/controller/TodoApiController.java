package com.simplekey.alpinespringbootdemo.controller;

import com.simplekey.alpinespringbootdemo.dto.Todo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController // HTML이 아닌 JSON을 반환
@RequestMapping("/api/todos")
public class TodoApiController {

    private static List<Todo> todoList = new ArrayList<>();

    public TodoApiController() {
        todoList.add(new Todo("Fetch API 배우기", false));
        todoList.add(new Todo("새로고침 없이 데이터 불러오기", false));
    }

    @GetMapping
    public List<Todo> getodos() {
        return todoList; // 리스트를 반환하면 Spring이 JSON으로 변환하여 리턴해준다.
    }

    @PostMapping
    public List<Todo> addTodo(@RequestBody Todo newTodo) {
        todoList.add(newTodo);
        return todoList; // 갱신된 전체 목록 다시 리턴
    }

}
