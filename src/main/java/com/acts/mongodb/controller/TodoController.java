package com.acts.mongodb.controller;


import com.acts.mongodb.model.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class TodoController {
    @Autowired
    private TodoService todoService;

    @GetMapping("/")
    public String getAll(Model model) {
        Todo td = new Todo();
        model.addAttribute("todo", td);
        model.addAttribute("todolist", todoService.getAll());
        return "hello";
    }

    @PostMapping("/save")
    public String addTodo(@ModelAttribute ("todo") Todo todo) {
        todoService.saveTodo(todo);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String deleteByID(@PathVariable("id") String id) {
        todoService.delete(id);
        return "redirect:/";
    }

}
