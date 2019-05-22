/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.utfpr.asproject.services;

import br.edu.utfpr.asproject.entities.Absence;
import br.edu.utfpr.asproject.entities.Discipline;
import br.edu.utfpr.asproject.entities.Lesson;
import br.edu.utfpr.asproject.entities.Reason;
import br.edu.utfpr.asproject.entities.Schedule;
import br.edu.utfpr.asproject.entities.ShiftSchedule;
import br.edu.utfpr.asproject.entities.Teacher;
import br.edu.utfpr.asproject.enums.EReason;
import br.edu.utfpr.asproject.enums.EShift;
import br.edu.utfpr.asproject.enums.ESituation;
import br.edu.utfpr.asproject.enums.EWeek;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author akira
 */
public class AbsenceServiceTest {

    public AbsenceServiceTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testCreateAbsenceWithProcedureAntecipation() {
        Teacher teacher = Teacher.builder()
                .name("Gabriel Costa Silva")
                .code("123456")
                .situation(ESituation.ACTIVE)
                .build();
        Set<ShiftSchedule> shiftSchedules1 = new HashSet<ShiftSchedule>();
        Set<ShiftSchedule> shiftSchedules2 = new HashSet<ShiftSchedule>();
        ShiftSchedule shiftScheduleN1 = ShiftSchedule.builder()
                .name("N1")
                .shift(EShift.NIGHT)
                .start("18h40")
                .end("19h30")
                .build();
        shiftSchedules1.add(shiftScheduleN1);
        shiftSchedules2.add(shiftScheduleN1);
        ShiftSchedule shiftScheduleN2 = ShiftSchedule.builder()
                .name("N2")
                .shift(EShift.NIGHT)
                .start("19h30")
                .end("20h20")
                .build();
        shiftSchedules2.add(shiftScheduleN2);
        shiftSchedules1.add(shiftScheduleN2);
        ShiftSchedule shiftScheduleN3 = ShiftSchedule.builder()
                .name("N3")
                .shift(EShift.NIGHT)
                .start("20h20")
                .end("21h10")
                .build();
        shiftSchedules1.add(shiftScheduleN3);

        Schedule schedule1 = Schedule.builder()
                .week(EWeek.WEDNESDAY)
                .shiftSchedules(shiftSchedules1)
                .build();
        Schedule schedule2 = Schedule.builder()
                .week(EWeek.THURSDAY)
                .shiftSchedules(shiftSchedules2)
                .build();
        Set<Schedule> schedules = new HashSet<>();
        schedules.add(schedule1);
        schedules.add(schedule2);
        Set<Lesson> lessons = new HashSet<>();
        Lesson lesson1 = Lesson.builder()
                .name("1")
                .date(new Date())
                .build();
        lessons.add(lesson1);
        Lesson lesson2 = Lesson.builder()
                .name("2")
                .date(new Date())
                .build();
        lessons.add(lesson2);
        Discipline discipline = Discipline.builder()
                .name("Arquitetura de Software")
                .schedules(schedules)
                .teacher(teacher)
                .lessons(lessons)
                .build();
        lesson1.setDiscipline(discipline);
        lesson2.setDiscipline(discipline);
        Reason reason = Reason.builder()
                .type(EReason.FORESEEN)
                .description("Seminário de Arquitetura de software")
                .build();
        Absence absence = Absence.builder()
                .lesson(lesson1)
                .reason(reason)
                .build();
    }

}
