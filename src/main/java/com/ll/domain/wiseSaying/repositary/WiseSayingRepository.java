package com.ll.domain.wiseSaying.repositary;

import com.ll.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class WiseSayingRepository {
    private int lastID;
    private final List<WiseSaying> wiseSayings;

    public WiseSayingRepository() {
        this.lastID = 0;
        this.wiseSayings = new ArrayList<>();
    }

    public WiseSaying save(WiseSaying wiseSaying) {
        // 메모리 저장 특성상 새 객체가 아니라면 딱히 헐 게 없다.
        if (!wiseSaying.isNew()) {
            return wiseSaying;
        }
        // 새 객체라면 아이디를 부여하고 저장한다.
        //저장위치 : 메모리(wiseSayings)
        wiseSaying.setId(++lastID);
        wiseSayings.add(wiseSaying);
        return wiseSaying;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }

    public boolean deleteById(int id) {
        return wiseSayings.removeIf(wiseSaying -> wiseSaying.getId() == id);
    }

    public Optional<WiseSaying> findById(int id) {
        return wiseSayings.stream()
                .filter(wiseSaying -> wiseSaying.getId() == id)
                .findFirst();
    }
}
