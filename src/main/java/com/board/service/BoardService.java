package com.board.service;

//MVC2에서 command 역할
import java.util.List;

import com.board.domain.BoardVO;

public interface BoardService {
	
	// 게시물 목록
	public List<BoardVO> list() throws Exception;
	
	// 게시물 작성
	public void write(BoardVO vo) throws Exception;
	
	public BoardVO view(int bno) throws Exception;
}
