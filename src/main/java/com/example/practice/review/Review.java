package com.example.practice.review;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@Table(name = "Review")
public class Review {
    @Id
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "comment")
    String comment;
    @Column(name = "grade")
    Integer grade;
    @Column(name = "date")
    Date date;

    public Review(String name, String comment, Integer grade) {
        this.name = name;
        this.comment = comment;
        this.grade = grade;
    }
}
