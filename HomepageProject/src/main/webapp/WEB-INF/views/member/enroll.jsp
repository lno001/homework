<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>-회원 가입-</title>
</head>
<body>
	<jsp:include page="../include/header.jsp"></jsp:include>
	<hr>
	<main>
		<h1>회원 가입 페이지 입니다.</h1>
		<form action="${ pageContext.request.contextPath }/member/enroll" method="post">
			<table>
				<tr>
					<td>아이디</td>
					<td>
						<input type="text" id="userId" name="userId" required
							   oninput="this.value = this.value.replace(/[^a-zA-Z0-9]/g, '')">
						<button type="button" onclick="checkIdDuplicate()">중복확인</button>
						<span id="idCheckResult"></span>
					</td>
				</tr>
			</table>
		</form>
	
	</main>
	<hr>
	<jsp:include page="../include/footer.jsp"></jsp:include>
	<script>
		async function checkIdDuplicate() {
			const userId = document.getElementById("userId").value;
			const resultSpan = document.getElementById("idCheckResult");
			
			if (!userId) {
				resultSpan.innerHTML = "아이디를 입력해주세요.";
				resultSpan.style.color = "red";
				return;
			}
			
			try {
				const response = await fetch("${pageContext.request.contextPath}/check/id-duplicate", {
	                method: "POST",
	                headers: {
	                    "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8"
	                },
	                body: "userId=" + encodeURIComponent(userId)
	            });
				const result = await response.json();
			
				resultSpan.innerHTML = result.message;
			
				if (result.available) {
            	    resultSpan.style.color = "green";   // 사용 가능 → 초록색
           	 	} else {
                	resultSpan.style.color = "red";     // 중복 → 빨간색
            	}
			} catch (error) {
            	console.error("에러 발생:", error);
            	resultSpan.innerHTML = "서버 통신 오류가 발생했습니다.";
            	resultSpan.style.color = "red";
        	}
		}
	</script>
</body>
</html>