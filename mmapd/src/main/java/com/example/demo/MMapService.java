package com.example.demo;

import java.util.List;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MMapService {

    @Autowired
    private MMapRepository mMapRepository;

    public List<Mmap> getAllMMapData() {
        return mMapRepository.findAll();
    }

    @Transactional // DB
    public void save(Mmap mmap) {
        mMapRepository.save(mmap);
    }
    
    //public List<Mmap> getAllMMapDataBySido(String sido) {
     //   return mMapRepository.findBySido(sido);
    
}

