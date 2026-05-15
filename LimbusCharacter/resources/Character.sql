/* 	림버스 캐릭터를 데이터 베이스에 넣고 저장해보자
	테이블명 LIM_CHAR

	캐릭터 번호 NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY -- 식별값
	인격 이름 NVARCHAR2(30) UNIQUE NOT NULL
	인격 등급 NUMBER 1성~3성 
	수감자 번호 NUMBER  
	출시 시기 DATE	
	스킬셋 -- 식별값을 가지고 테이블(SKILL)에 따로 스킬에 대한 정보를 넣을 예정
	특성 키워드 -- 식별값을 가지고 테이블(KEYWORD)에 따로 키워드에 대한 정보를 넣을 예정
 */

CREATE TABLE LIM_CHAR(
	CHAR_NO NUMBER GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
	CHAR_NAME NVARCHAR2(30) UNIQUE NOT NULL,
	CHAR_TIER NUMBER NOT NULL,
	MEMBER_NO NUMBER NOT NULL,
	RELEASE_DATE DATE NOT NULL
);

/*	기본 캐릭터 중 하나인 이상을 넣어보자
 * 	인격이름 [LCB 수감자]이상
 * 	인격등급 	1	
 *  수감자 번호	1
 *  출시일	2023-02-27
 */  

INSERT INTO LIM_CHAR(
	CHAR_NAME,
	CHAR_TIER,
	MEMBER_NO,
	RELEASE_DATE
)
VALUES(
	'[LCB 수감자]이상',
	1,
	1,
	'2023-02-27'
);