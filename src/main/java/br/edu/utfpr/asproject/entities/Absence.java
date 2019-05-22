/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
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
public class Absence implements Serializable {

    @Id
    @GeneratedValue
    protected Long id;
    @OneToOne
    protected Lesson lesson;
    @ManyToOne
    protected Reason reason;
    /*@ManyToMany
    protected Set<Procedure> procedure;*/
}
