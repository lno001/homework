package com.kh.delivery.service;

import org.apache.ibatis.session.SqlSession;

import com.kh.delivery.common.Template;
import com.kh.delivery.dao.MemberDao;
import com.kh.delivery.dto.DeliMember;

public class MemberService {
MemberDao md = new MemberDao();

	public String login(DeliMember member) {
		SqlSession session = Template.getSqlSession();
		String memberName = md.login(session, member);
		session.close();
		
		return memberName;
	}

	public int idCheckDuplicate(String memberId) {
		SqlSession session = Template.getSqlSession();
		int idCheckDuplicate = md.idCheckDuplicate(session, memberId);
		session.close();
		return idCheckDuplicate;
	}

	public int insertMember(DeliMember member) {
		SqlSession session = Template.getSqlSession();
		int result = md.insertMember(session, member);
		if(result > 0) {
			session.commit();
		}
		session.close();
		return result;
	}

}
