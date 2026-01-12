package org.example.echo.domain.noticeBoard.entity.repository;

import org.example.echo.domain.noticeBoard.entity.NoticeBoard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface NoticeBoardRepository extends JpaRepository<NoticeBoard, Long> {

    @Modifying(clearAutomatically = true)
    @Query("delete from NoticeBoard")
    void deleteAllInBulk();
}