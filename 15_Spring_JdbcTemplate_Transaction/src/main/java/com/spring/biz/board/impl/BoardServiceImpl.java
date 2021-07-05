package com.spring.biz.board.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.biz.board.BoardService;
import com.spring.biz.board.BoardVO;

// @Service : @Component 상속 확장 어노테이션
// 		비즈니스 로직 처리 서비스 영역에 사용
@Service("boardService")
public class BoardServiceImpl implements BoardService{
	@Autowired // 타입이 일치하는 객체(인스턴스) 주입
	// private BoardDAO boardDAO;
	private BoardDAOSpring boardDAO;
	
	public BoardServiceImpl() {
		System.out.println(">> BoardServiceImpl() 객체 생성");
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		vo.setSeq(111);
		boardDAO.insertBoard(vo);
		vo.setSeq(111);
		boardDAO.insertBoard(vo);
		// 111 값 두 번 넣으려고 시도 ->
		// 한 값은 정상 / 한 값이 잘못 되더라도 정상 처리 됐던 것도 같이 취소, 롤백 됨
		// 두 개의 동작이 하나의 덩어리(?)로 처리되는 것이 트랜잭션!!
		
	}

	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		
	}

	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}


	@Override
	public List<BoardVO> getBoardList() {
		return boardDAO.getBoardList();
	}

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}

}
