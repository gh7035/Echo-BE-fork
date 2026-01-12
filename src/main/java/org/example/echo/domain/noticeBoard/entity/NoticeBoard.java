package org.example.echo.domain.noticeBoard.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class NoticeBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "message", length = 255)
    private String message;

    @Column(name = "time")
    private LocalDateTime createdAt;

}
