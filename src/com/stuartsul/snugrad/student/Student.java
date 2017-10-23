package com.stuartsul.snugrad.student;

import com.stuartsul.snugrad.department.Department;

public class Student {

  /* General Student Information */
  private String first_name;
  private String last_name;
  private int student_ID;
  private int class_year;         // 학번
  private boolean isFallClass;    // .5학번
  private Department department;  // 입학전공

  /* Concentraion 전공 */
  private Department[] major_single;  // 단일/심화전공
  private Department[] major_main;    // 주전공
  private Department[] major_double;  // 복수전공
  private Department[] minor;         // 부전공
  private Department[][] concentration;

  /* Course Registration History 이수 기록 */
  private Semester[] semesters;

  /* Constructor */
  public Student() {

  }

  /* Set-Functions */
  /* Add-Functions */
  /* Get-Functions */
  /* Delete-Functions */
  /* File IO */
}
