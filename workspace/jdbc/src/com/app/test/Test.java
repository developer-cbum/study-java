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
		
//		boardVO.setBoardTitle("����");
//		boardVO.setBoardContent("�ȳ�");
//		
		
		BoardDAO boardDAO = new BoardDAO();
		
//		System.out.println(userDAO.checkId("ljm1234"));
//		
//		userVO.setUserIdentification("ljm1234");
//		userVO.setUserPassword("1234");
//		userVO.setUserName("������");
//		userVO.setUserPhone("01012341234");
//		userVO.setUserEmail("jongmoon@naver.com");
//		
//		userDAO.insert(userVO);
		
		// �α���
		System.out.println(userDAO.login("ljm1234", "1234567"));

		// ���̵� ã��
//		System.out.println(userDAO.selectId("01012341234"));
		
		// ��й�ȣ ����
//		
//	userDAO.changePassWord("123456", "1234567");
		
		// �Խñ� ����ȸ 1��
		
//		System.out.println(boardDAO.selectBoard(1L));
		
		
//		�Խñ� ��ü ��ȸ
//		System.out.println(boardDAO.selectAll());
		
		
		
		// �Խñ� �߰�
//		
//		boardDAO.insert(boardVO);
		
		
		// �Խñ� ����
		
		
//		boardVO.setBoardId(1L);
//		boardVO.setBoardTitle("�����λ�");
//		boardVO.setBoardContent("�ȳ�25");
//		
//		boardDAO.edit(boardVO);
		
		// �Խñ� ����
		// ���ϴ� �Խù� ����
//		boardVO.setBoardId(1L);
//		
//		boardDAO.delete(boardVO);
		

	}

}