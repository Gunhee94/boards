package kr.co.board.service;

import kr.co.board.dao.BoardDao;
import kr.co.board.vo.Board;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardDao boardDao;

    @Override
    public Board getBoardByNo(int bdNo) {
        return boardDao.getBoardByNo(bdNo);
    }
}
