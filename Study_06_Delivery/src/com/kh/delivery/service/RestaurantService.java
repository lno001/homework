package com.kh.delivery.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.common.Template;
import com.kh.delivery.dao.RestaurantDao;
import com.kh.delivery.dto.Restaurant;

public class RestaurantService {
RestaurantDao rd = new RestaurantDao();
	
	public List<Restaurant> selectAllRestaurant() {
		SqlSession session = Template.getSqlSession();
		
		List<Restaurant> restaurants = rd.selectAllRestaurant(session);
		return restaurants;
	}

}
