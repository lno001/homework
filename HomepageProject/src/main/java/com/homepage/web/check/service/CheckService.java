package com.homepage.web.check.service;

import org.apache.ibatis.session.SqlSession;

import com.homepage.web.check.dao.CheckDao;
import com.homepage.web.common.Template;

public class CheckService {

	public int checkId(String userId) {
		SqlSession sqlSession = Template.getSqlSession();
		
		int idCheck = new CheckDao().checkId(sqlSession, userId);
		
		sqlSession.close();
		
		return idCheck;
	}

}
