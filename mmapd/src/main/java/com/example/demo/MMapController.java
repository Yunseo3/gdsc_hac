package com.example.demo;

import java.util.List;

import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MMapController {

    @Autowired
    private MMapService mMapService;

    @GetMapping("/mmapData")
    public List<Mmap> getAllMMapData() {
        return mMapService.getAllMMapData();
    }

    /**
     * 테스트용 데이터 삽입 (서버 실행 때 마다 적용)
     */
    @PostConstruct
    @Transactional
    public void init() {
        Mmap mmap = new Mmap("1","2","3","4","5","6","7","8",1D,1D);
        mMapService.save(mmap);
    }
}
