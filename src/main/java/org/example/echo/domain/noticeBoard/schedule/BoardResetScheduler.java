package org.example.echo.domain.noticeBoard.schedule;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.echo.domain.noticeBoard.entity.repository.NoticeBoardRepository;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
@Slf4j
public class BoardResetScheduler {
    private final NoticeBoardRepository noticeBoardRepository;

    @Scheduled(cron = "0 0 0 * * *", zone = "Asia/Seoul")
    @Transactional
    public void resetNoticeBoard() {
        noticeBoardRepository.deleteAllInBulk();
        log.info("성공적으로 방송 기록을 초기화했습니다.");
    }
}
