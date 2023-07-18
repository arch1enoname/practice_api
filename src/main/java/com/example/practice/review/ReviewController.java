package com.example.practice.review;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    @Autowired
    private final ReviewService reviewService;

    @PostMapping("/createReview")
    public Review createReview(@RequestBody Review review) {
        return reviewService.createReview(review);
    }
}
