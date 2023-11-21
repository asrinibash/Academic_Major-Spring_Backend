package com.EShoapEaze.service;

import com.EShoapEaze.exception.CartItemException;
import com.EShoapEaze.exception.UserException;
import com.EShoapEaze.modal.Cart;
import com.EShoapEaze.modal.CartItem;
import com.EShoapEaze.modal.Product;

public interface CartItemService {
	
	public CartItem createCartItem(CartItem cartItem);
	
	public CartItem updateCartItem(Long userId, Long id,CartItem cartItem) throws CartItemException, UserException;
	
	public CartItem isCartItemExist(Cart cart,Product product,String size, Long userId);
	
	public void removeCartItem(Long userId,Long cartItemId) throws CartItemException, UserException;
	
	public CartItem findCartItemById(Long cartItemId) throws CartItemException;
	
}
