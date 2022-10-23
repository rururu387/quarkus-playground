package com.sber.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Incident {
    @Id
    Long id;
    String sourceSystem;
    String riskProfile;
    String incidentName;
    String incidentDescription;
    String incidentStatus;
    String author;
    String owner;
    String verifier;
    LocalDateTime timeCreated;
    LocalDateTime dateNotified;
    LocalDateTime dateDiscovered;
    LocalDateTime dateOfIncident;
    LocalDateTime dateFinished;
    LocalDateTime dateExpired;
    LocalDateTime timeFirstValidated;
    LocalDateTime timeLastValidated;
    LocalDateTime clientType;
}
