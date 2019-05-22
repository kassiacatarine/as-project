/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.entities;

import br.edu.utfpr.asproject.enums.EWeek;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author akira
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Schedule implements Serializable {

    @Id
    @GeneratedValue
    protected Long id;
    protected EWeek week;
    @ManyToMany
    protected Set<ShiftSchedule> shiftSchedules;
}
