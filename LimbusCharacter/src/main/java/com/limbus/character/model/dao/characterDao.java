package com.limbus.character.model.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.limbus.character.model.dto.characterDto;

public class characterDao {
	
	// 모든 캐릭터 정보 보여주기
	public List<characterDto> selectCharList(SqlSession sqlSession) {
		return sqlSession.selectList("charMapper.selectCharList");
	}
	
	// 특정 캐릭터 정보 보여주기
	public characterDto selectChar(SqlSession sqlSession, characterDto charNo) {
		return sqlSession.selectOne("charMapper.selectChar", charNo);
	}
	
	// 특정 수감자 번호의 캐릭터 정보 보여주기

}
