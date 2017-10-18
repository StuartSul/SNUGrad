package com.stuartsul.snugrad.course;

public class Course {
  public static final int unknown = -1;

  /* Course-Open Year 년도 */
  private int open_year;

  /* Course-Open Semester 학기 */
  private int open_semester;
  public static final int spring = 0;
  public static final int summer = 1;
  public static final int fall = 2;
  public static final int winter = 3;

  /* Course Classification 교과구분 */
  private int classification;
  public static final int general_education = 0; // 교양
  public static final int general_selective = 1; // 일선
  public static final int major_selective = 2;   // 전선
  public static final int major_required = 3;    // 전필
  public static final int teaching = 4;          // 교직
  public static final int paper = 5;             // 논문
  public static final int graduate = 6;          // 대학원

  /* Division 개설대학 */
  private int division;

  /* Department 개설학과 */
  private int department;

  /* Level 이수 과정 */
  private int level;
  public static final int bachelor = 0;  // 학사
  public static final int master = 1;    // 석사
  public static final int combined = 2;  // 석박사통합
  public static final int doctor = 3;    // 박사

  /* Year 학년 */
  private int year;

  /* Course Code 교과목번호
     Course codes are in the form of
     (alphabet)(number)(alphabet).(number)(alphabet)*/
  private int[] code = new int[5];

  /* Class Number 강좌번호 */
  private int class_number;

  /* Course Name 교과목명 */
  private String name;

  /* Course Credit 학점 */
  private int credit;

  /* Lecture Time 강의 */
  // to be implemented

  /* Lab Time 실습 */
  // to be implemented

  /* Class Time 수업교시 */
  // to be implemented

  /* Classroom 강의실 */
  // to be implemented

  /* Professor 주담당교수 */
  private String professor;

  /* Lecture Langauge 강의언어 */
  private int langauge;
  public static final int korean = 0;   // 한국어
  public static final int english = 1;  // 영어
  public static final int other = 2;

  /* Constructor and Get-Functions */
  public Course(int open_year, int open_semester, int classification,
                int division, int department, int level,
                int year, int[] code, int class_number, String name,
                int credit, String professor, int language) {
    this.open_year = open_year;
    this.open_semester = open_semester;
    this.classification = classification;
    this.department = department;
    this.level = level;
    this.year = year;
    this.class_number = class_number;
    this.name = name;
    this.credit = credit;
    this.professor = professor;
    this.language = language;

    for (int i = 0; i < this.code.length; i++)
      this.code[i] = code[i];
  }

  public int getOpenYear() { return this.open_year; }
  public int getOpenSemester() { return this.open_semester; }
  public int getClassification() { return this.classification; }
  public int getDivision() { return this.division; }
  public int getDepartment() { return this.department; }
  public int getLevel() { return this.level; }
  public int getYear() { return this.year; }
  public int[] getCode() { return this.code; }
  public int getClassNumber() { return this.class_number; }
  public String getName() { return this.name; }
  public int getCredit() { return this.credit; }
  public String getProfessor() { return this.professor; }
  public int getLanguage() { return this.language; }
}
