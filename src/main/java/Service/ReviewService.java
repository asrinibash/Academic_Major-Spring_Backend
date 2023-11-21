package com.EShoapEaze.service;

import java.util.List;

import com.EShoapEaze.exception.ProductException;
import com.EShoapEaze.modal.Review;
import com.EShoapEaze.modal.User;
import com.EShoapEaze.request.ReviewRequest;

public interface ReviewService {

	public Review createReview(ReviewRequest req,User user) throws ProductException;
	
	public List<Review> getAllReview(Long productId);
	
	
}
