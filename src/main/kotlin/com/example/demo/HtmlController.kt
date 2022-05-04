package com.example.demo

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
class HtmlController {
    @RequestMapping("/")
    fun home(): String {
        return "This is a homepage"
    }
}