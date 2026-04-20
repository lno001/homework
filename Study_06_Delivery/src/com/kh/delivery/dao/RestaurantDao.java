package com.kh.delivery.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.dto.Restaurant;

public class RestaurantDao {

	public List<Restaurant> selectAllRestaurant(SqlSession session) {
		return session.selectList("restaurantMapper.selectAllRestaurant");
	}

}
