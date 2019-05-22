/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.factories;

import br.edu.utfpr.asproject.entities.ShiftSchedule;
import br.edu.utfpr.asproject.enums.EShift;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author akira
 */
public class ShiftScheduleFactory {

    private Set<ShiftSchedule> shiftSchedules;

    protected ShiftScheduleFactory() {
        shiftSchedules = new HashSet<ShiftSchedule>();
        ShiftSchedule shiftScheduleN1 = ShiftSchedule.builder()
                .name("N1")
                .shift(EShift.NIGHT)
                .start("18h40")
                .end("19h30")
                .build();
        shiftSchedules.add(shiftScheduleN1);
        ShiftSchedule shiftScheduleN2 = ShiftSchedule.builder()
                .name("N2")
                .shift(EShift.NIGHT)
                .start("19h30")
                .end("20h20")
                .build();
        shiftSchedules.add(shiftScheduleN2);
        ShiftSchedule shiftScheduleN3 = ShiftSchedule.builder()
                .name("N3")
                .shift(EShift.NIGHT)
                .start("20h20")
                .end("21h10")
                .build();
        shiftSchedules.add(shiftScheduleN3);
        ShiftSchedule shiftScheduleN4 = ShiftSchedule.builder()
                .name("N4")
                .shift(EShift.NIGHT)
                .start("21h20")
                .end("22h10")
                .build();
        shiftSchedules.add(shiftScheduleN4);
        ShiftSchedule shiftScheduleN5 = ShiftSchedule.builder()
                .name("N5")
                .shift(EShift.NIGHT)
                .start("22h10")
                .end("23h00")
                .build();
        shiftSchedules.add(shiftScheduleN5);
    }
}
