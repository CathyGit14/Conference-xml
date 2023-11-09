package com.plurasight.service;

import com.plurasight.model.Speaker;
import com.plurasight.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        this.repository = repository;
    }
}
