package com.kh.delivery.controller;

import java.util.List;

import com.kh.delivery.dto.Restaurant;
import com.kh.delivery.service.RestaurantService;

public class RestaurantController {
	RestaurantService rs = new RestaurantService();

	public List<Restaurant> selectAllRestaurant() {
		return rs.selectAllRestaurant();
	}

}
