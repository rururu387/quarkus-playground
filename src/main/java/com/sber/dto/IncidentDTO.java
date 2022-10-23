package com.sber.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class IncidentDTO {
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
