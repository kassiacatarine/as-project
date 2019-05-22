/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.services;

import br.edu.utfpr.asproject.entities.Absence;
import br.edu.utfpr.asproject.repositories.AbsenceRepository;

/**
 *
 * @author akira
 */
public class AbsenceService {

    private AbsenceRepository absenceRepository;

    public AbsenceService(AbsenceRepository absenceRepository) {
        this.absenceRepository = absenceRepository;
    }

    public void createAbsence(Absence absence) {
        absenceRepository.save(absence);
    }

    public void editAbsence(Absence absence) {
        absenceRepository.save(absence);
    }

    public void deleteAbsence(Long id) {
        absenceRepository.deleteById(id);
    }
}
