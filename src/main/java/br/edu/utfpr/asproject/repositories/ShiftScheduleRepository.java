/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.repositories;

import br.edu.utfpr.asproject.entities.ShiftSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author akira
 */
public interface ShiftScheduleRepository extends JpaRepository<ShiftSchedule, Long> {

}
