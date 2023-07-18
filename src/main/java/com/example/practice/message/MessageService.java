package com.example.practice.message;

import java.time.LocalDate;
import java.util.Date;

public class MessageService {
    private MessageRepository messageRepository;

    public Message createMessage(String comment, String name, Integer grade) {
        Message message = new Message();
        message.setName(name);
        message.setGrade(grade);
        message.setComment(comment);
        message.setDate(new Date());
        return messageRepository.save(message);
    }
}
