/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.entities;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
public class Discipline implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ManyToMany
    private Set<Schedule> schedules;
    @ManyToOne
    private Teacher teacher;
    @OneToMany(mappedBy = "discipline")
    private Set<Lesson> lessons;
}
