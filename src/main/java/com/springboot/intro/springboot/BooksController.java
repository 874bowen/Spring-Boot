package com.springboot.intro.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {
    // url /books
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(11, "Mastering Spring", "Ranga Karanam"));
    }
}
