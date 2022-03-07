package com.example.Restlearning;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookController {
    @GetMapping("/books")
    //method to handle all get request
    public List<Book> getallbooks(){
        return Arrays.asList(new Book(1,"MATHEMATICS","RD SHARMA"));
    }
}
