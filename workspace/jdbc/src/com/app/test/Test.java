package com.app.test;

import com.app.dao.BoardDAO;
import com.app.dao.UserDAO;
import com.app.domain.BoardVO;
import com.app.domain.UserVO;

public class Test {

	public static void main(String[] args) {
		
		UserVO userVO = new UserVO();
			
		UserDAO userDAO = new UserDAO();
		
		BoardVO boardVO = new BoardVO();
		
//		boardVO.setBoardTitle("제곧내");
//		boardVO.setBoardContent("안녕");
//		
		
		BoardDAO boardDAO = new BoardDAO();
		
//		System.out.println(userDAO.checkId("ljm1234"));
//		
//		userVO.setUserIdentification("ljm1234");
//		userVO.setUserPassword("1234");
//		userVO.setUserName("이종문");
//		userVO.setUserPhone("01012341234");
//		userVO.setUserEmail("jongmoon@naver.com");
//		
//		userDAO.insert(userVO);
		
		// 로그인
		System.out.println(userDAO.login("ljm1234", "1234567"));

		// 아이디 찾기
//		System.out.println(userDAO.selectId("01012341234"));
		
		// 비밀번호 변경
//		
//	userDAO.changePassWord("123456", "1234567");
		
		// 게시글 상세조회 1개
		
//		System.out.println(boardDAO.selectBoard(1L));
		
		
//		게시글 전체 조회
//		System.out.println(boardDAO.selectAll());
		
		
		
		// 게시글 추가
//		
//		boardDAO.insert(boardVO);
		
		
		// 게시글 수정
		
		
//		boardVO.setBoardId(1L);
//		boardVO.setBoardTitle("가입인사");
//		boardVO.setBoardContent("안녕25");
//		
//		boardDAO.edit(boardVO);
		
		// 게시글 삭제
		// 원하는 게시물 선택
//		boardVO.setBoardId(1L);
//		
//		boardDAO.delete(boardVO);
		

	}

}
