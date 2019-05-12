/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entities;

import java.util.List;
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
public class Discipline {

    private Long id;
    private String name;
    private List<Schedule> schedules;
    private Teacher teacher;
}
