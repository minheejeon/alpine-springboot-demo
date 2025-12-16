package com.simplekey.alpinespringbootdemo.controller;

import com.simplekey.alpinespringbootdemo.dto.Todo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

    @GetMapping("/")
    public String home(Model model) {
        List<Todo> javaTodos = new ArrayList<>();
        javaTodos.add(new Todo("Spring에서 보낸 데이터 1", false));
        javaTodos.add(new Todo("Alpine.js로 렌더링하기", true));
        javaTodos.add(new Todo("서버 데이터 연동 성공!", false));

        model.addAttribute("serverTodos",  javaTodos);

        return "home";
    }
}
