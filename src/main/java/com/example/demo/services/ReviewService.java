package com.example.demo.services;

import com.example.demo.models.Review;
import java.util.List;

public interface ReviewService {
    List<Review> findAll();
    void save(Review review);
}
