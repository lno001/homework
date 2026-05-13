package com.homepage.web.check.dao;

import org.apache.ibatis.session.SqlSession;

public class CheckDao {

	public int checkId(SqlSession sqlSession, String userId) {
		return sqlSession.selectOne("checkMapper.checkId", userId);
	}

}
