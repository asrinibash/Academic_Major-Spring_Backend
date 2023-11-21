package com.EShoapEaze.service;

import java.util.List;

import com.EShoapEaze.exception.ProductException;
import com.EShoapEaze.modal.Rating;
import com.EShoapEaze.modal.User;
import com.EShoapEaze.request.RatingRequest;

public interface RatingServices {
	
	public Rating createRating(RatingRequest req,User user) throws ProductException;
	
	public List<Rating> getProductsRating(Long productId);

}
