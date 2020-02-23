package com.example.board.domain;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {
    // findBy + 조회할 키 값 지정
    public Board findByAuthor(String author);

    // order by를 키 값으로 하기 위해 findAll 뒤에 ByOrderBy + 키 + Asc/Desc 지
    public List<Board> findAllByOrderByIdDesc();

    public Board findBoardById(Long id);
}
