package com.kh.delivery.dao;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.dto.DeliMember;

public class MemberDao {

	public String login(SqlSession session, DeliMember member) {
		return session.selectOne("memberMapper.login", member);
	}

	public int idCheckDuplicate(SqlSession session, String memberId) {
		return session.selectOne("memberMapper.idCheckDuplicate", memberId);
	}

	public int insertMember(SqlSession session, DeliMember member) {
		return session.insert("memberMapper.insertMember", member);
	}

}
