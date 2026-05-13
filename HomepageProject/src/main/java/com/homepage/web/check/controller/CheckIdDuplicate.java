package com.homepage.web.check.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.homepage.web.check.service.CheckService;

@WebServlet("/check/id-duplicate")
public class CheckIdDuplicate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CheckIdDuplicate() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        String userId = request.getParameter("userId");
        
        // ★★★ 실제로는 여기서 DB 조회해야 함 ★★★
        boolean isDuplicate = checkDuplicateInDB(userId);  // 아래에 메서드 만들어야 함
//        boolean isDuplicate = false;
        response.setContentType("application/json; charset=UTF-8");
        PrintWriter out = response.getWriter();

        if (isDuplicate) {
            out.print("{\"available\": false, \"message\": \"이미 사용 중인 아이디입니다.\"}");
        } else {
            out.print("{\"available\": true, \"message\": \"사용 가능한 아이디입니다.\"}");
        }
    }

	private boolean checkDuplicateInDB(String userId) {
		int idCheck = new CheckService().checkId(userId);
		if (idCheck == 0) {
			return false;
		} else {
			return true;
		}
	}
}
