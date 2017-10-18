package com.stuartsul.snugrad.student;

public class Student {

  /* General Student Information */
  String firstName;
  String lastName;
  int studentID;
  int classYear;           // "학번"
  boolean isFallClass;     // ".5학번"
  int department;          // "입학전공"

  /* Concentraion */
  int[] major_single;      // "단일/심화전공"
  int[] major_main;        // "주전공"
  int[] major_double;      // "복수전공"
  int[] minor;             // "부전공"
  int[] inter; // "연계전공"

}
