package com.stuartsul.snugrad.student;

import com.stuartsul.snugrad.course.Course;

class Semester {
  private static final int maxCredit = 21;

  /* Fixed Information */
  private int year;
  private int semester;  // Use constants from the Course class

  /* Variable Information */
  final Course[] courses;
  final double[] grades;

  /* Constructor */
  Semester(int year, int semester) {
    this.year = year;
    this.semester = semester;
    this.courses = new Course[maxCredit];
    this.grades = new double[maxCredit];
  }
}
