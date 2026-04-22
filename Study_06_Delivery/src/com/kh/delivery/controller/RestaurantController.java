package com.kh.delivery.controller;

import java.util.List;
import java.util.Map;

import com.kh.delivery.dto.Restaurant;
import com.kh.delivery.service.RestaurantService;

public class RestaurantController {
	RestaurantService rs = new RestaurantService();

	public List<Restaurant> selectAllRestaurant() {
		return rs.selectAllRestaurant();
	}

	public List<Restaurant> restaurantFindByKeyword(Map<String, String> keywords) {
		return rs.restaurantFindByKeyword(keywords);
	}

}
