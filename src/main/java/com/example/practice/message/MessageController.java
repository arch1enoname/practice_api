package com.example.practice.message;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private MessageService messageService;

    @PostMapping("/")
    public Message createMessage(@RequestParam String name, @RequestParam String comment, @RequestParam Integer grade) {
        return messageService.createMessage(comment, name, grade);
    }
}
