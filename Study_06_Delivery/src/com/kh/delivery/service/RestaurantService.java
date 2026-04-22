package com.kh.delivery.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.common.Template;
import com.kh.delivery.dao.RestaurantDao;
import com.kh.delivery.dto.Restaurant;

public class RestaurantService {
RestaurantDao rd = new RestaurantDao();
	
	public List<Restaurant> selectAllRestaurant() {
		SqlSession session = Template.getSqlSession();
		
		List<Restaurant> restaurants = rd.selectAllRestaurant(session);
		
		session.close();
		return restaurants;
	}

	public List<Restaurant> restaurantFindByKeyword(Map<String, String> keywords) {
		SqlSession session = Template.getSqlSession();
		
		List<Restaurant> restaurants = rd.restaurantFindByKeyword(session, keywords);
		
		
		session.close();
		
		return restaurants;
	}

}
