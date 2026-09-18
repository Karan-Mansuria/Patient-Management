package com.pm.patientservice.mapper;

import com.pm.patientservice.dto.PatientRequestDTO;
import com.pm.patientservice.dto.PatientResponseDTO;
import com.pm.patientservice.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setEmail(patient.getEmail());
        dto.setAddress(patient.getAddress());
        dto.setDateOfBirth(patient.getDateOfBirth().toString());
        return dto;
    }

    public static Patient toModel(PatientRequestDTO patientRequestDTO){
        Patient Patient = new Patient();
        Patient.setName(patientRequestDTO.getName());
        Patient.setEmail(patientRequestDTO.getEmail());
        Patient.setAddress(patientRequestDTO.getAddress());
        Patient.setDateOfBirth(LocalDate.parse(patientRequestDTO.getDateOfBirth()));
        Patient.setRegisteredDate(LocalDate.parse(patientRequestDTO.getRegisteredDate()));

        return Patient;
    }



}
