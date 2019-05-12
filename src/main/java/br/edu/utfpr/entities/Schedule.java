/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.entities;

import br.edu.utfpr.enums.EWeek;
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
public class Schedule {

    private Long id;
    private EWeek week;
    private List<ShiftSchedule> shiftSchedules;
}
