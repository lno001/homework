package com.kh.delivery.controller;

import com.kh.delivery.dto.DeliMember;
import com.kh.delivery.service.MemberService;

public class MemberController {
MemberService ms = new MemberService();
	
	public String login(DeliMember member) {
		if (member.getMemberId().length() <= 20 && member.getMemberPw().length() <= 20) {
			return ms.login(member);
		}
		return null;
	}
	
	public int idCheckDuplicate(String memberId) {
		return ms.idCheckDuplicate(memberId);
	}

	public boolean idCheck(String memberId) {
		if (memberId.length() <= 20 && memberId != "") {
			return true;
		}
		return false; 
	}
	
	public boolean pwCheck(String memberPw) {
		if (memberPw.length() <= 20 && memberPw != "") {
			return true;
		}
		return false;
	}
	
	public boolean nameCheck(String memberName) {
		if (memberName.length() <= 30 && memberName != "") {
			return true;
		}
		return false;
	}

	public boolean addressCheck(String address) {
		if (address.length() <= 100 && address != "") {
			return true;
		}
		return false;
	}

	public int insertMember(DeliMember member) {
		return ms.insertMember(member);
	}
}
