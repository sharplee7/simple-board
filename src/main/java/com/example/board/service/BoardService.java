package com.example.board.service;

import com.example.board.domain.Board;
import com.example.board.domain.BoardRepository;
import com.example.board.web.BoardRequest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BoardService {
    @Autowired
    private BoardRepository boardRepository;

    public Long save(BoardRequest boardRequest) {
        Board board = new Board();
        BeanUtils.copyProperties(boardRequest, board);
        board = boardRepository.save(board);
        return board.getId();
    }

    public List<Board> findAllByOrderByIdDesc() {
        return boardRepository.findAllByOrderByIdDesc();
    }

    public Board findBoardById(Long id) {
        return boardRepository.findBoardById(id);
    }

    public void delete(Long id) {
         boardRepository.deleteById(id);
    }

    public Long update(BoardRequest boardRequest) {
//        boardRepository.

        return null;
    }
}
