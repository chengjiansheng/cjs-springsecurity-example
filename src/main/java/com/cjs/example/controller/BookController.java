package com.cjs.example.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/book")
public class BookController {

    @PreAuthorize("hasAuthority('BookList')")
    @GetMapping("/list.html")
    public String list() {
        return "book/list";
    }

    @PreAuthorize("hasAuthority('BookAdd')")
    @GetMapping("/add.html")
    public String add() {
        return "book/add";
    }

    @PreAuthorize("hasAuthority('BookDetail')")
    @GetMapping("/detail.html")
    public String detail() {
        return "book/detail";
    }
}
