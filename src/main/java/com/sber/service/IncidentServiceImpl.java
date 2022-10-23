package com.sber.service;

import com.sber.entity.Incident;
import com.sber.repository.IncidentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class IncidentServiceImpl implements IncidentService {
    IncidentRepository incidentRepository;

    @Autowired
    public IncidentServiceImpl(IncidentRepository incidentRepository) {
        this.incidentRepository = incidentRepository;
    }

    @Transactional
    public void persist(Incident incident) {
        incidentRepository.save(incident);
    }

    @Transactional
    public void delete(Incident incident){
        incidentRepository.delete(incident);
    }

    @Transactional
    public void update() {

    }
}
