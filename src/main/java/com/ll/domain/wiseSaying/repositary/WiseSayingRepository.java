package com.ll.domain.wiseSaying.repositary;

import com.ll.domain.wiseSaying.entity.WiseSaying;

import java.util.ArrayList;
import java.util.List;

public class WiseSayingRepository {
    private int lastID;
    private final List<WiseSaying> wiseSayings;

    public WiseSayingRepository() {
        this.lastID = 0;
        this.wiseSayings = new ArrayList<>();
    }

    public WiseSaying save(WiseSaying wiseSaying) {
        wiseSaying.setId(++lastID);
        wiseSayings.add(wiseSaying);
        return wiseSaying;
    }

    public List<WiseSaying> findAll() {
        return wiseSayings;
    }
}
