package com.stuartsul.snugrad.department;

import com.stuartsul.snugrad.Course;

public class Requirement {

  /* Department */
  private Department department;

  /* Credit Requirement */
  private int total_credit;    // 총 필수학점
  private int general_credit;  // 교양 필수학점
  private int single_credit;   // 단일(심화)전공시 전공 필수학점
  private int main_credit;     // 주전공시 전공 필수학점
  private int double_credit;   // 복수전공시 전공 필수학점
  private int minor_credit;    // 부전공시 전공 필수학점

  /* GPA Requirement */
  private double minimum_GPA;  // 졸업 필수 최소 학점

  /* General Education Requirement */
  private Course[] general_required;       // 교양 필수 수업
  private int general_writing_credit;      // 학문의 기초 - 사고와 표현 학점
  private int general_foreign_credit;      // 학문의 기초 - 외국어 학점
  private int general_math_credit;         // 학문의 기초 - 수량적 분석과 추론 학점
  private int general_science_credit;      // 학문의 기초 - 과학적 사고와 실험 학점
  private int general_computer_credit;     // 학문의 기초 - 컴퓨터와 정보 활용 학점
  private int general_liberalarts_credit;  // 학문의 세계 (인문사회) 학점
  private int general_nature_credit;       // 학문의 세계 (자연과학) 학점
  private int general_other_credit;        // 자유 선택 교양 학점

  /* Major Subjects Requirement */
  private Course[] major_required;   // 전공 필수 수업
  private Course[] major_selective;  // 전공 선택 수업

  /* Other Requirements */
  private boolean graduation_thesis;  // 졸업 논문
  private boolean graduation_work;    // 졸업 작품
  private boolean graduation_either;  // 작품과 논문 둘 중 하나만 하면 되는지
  private String other;               // 그 외

  /* Constructor */
  Requirement(Department department,
              int total_credit, int general_credit, int single_credit,
              int main_credit, int double_credit, int minor_credit,
              double minimum_GPA,
              Course[] general_required,
              int general_writing_credit, int general_foreign_credit,
              int general_math_credit, int general_science_credit,
              int general_computer_credit, int general_liberalarts_credit,
              int general_nature_credit, int general_other_credit,
              Course[] major_required, Course[] major_selective,
              boolean graduation_thesis,
              boolean graduation_work,
              boolean graduation_either,
              String other) {
    this.department = department;
    this.total_credit = total_credit;
    this.general_credit = general_credit;
    this.single_credit = single_credit;
    this.main_credit = main_credit;
    this.double_credit = double_credit;
    this.minor_credit = minor_credit;
    this.minimum_GPA = minimum_GPA;
    this.general_required = general_required;
    this.general_writing_credit = general_writing_credit;
    this.general_foreign_credit = general_foreign_credit;
    this.general_math_credit = general_math_credit;
    this.general_science_credit = general_science_credit;
    this.general_computer_credit = general_computer_credit;
    this.general_liberalarts_credit = general_liberalarts_credit;
    this.general_nature_credit = general_nature_credit;
    this.general_other_credit = general_other_credit;
    this.major_required = major_required;
    this.major_selective = major_selective;
    this.graduation_thesis = graduation_thesis;
    this.graduation_work = graduation_work;
    this.graduation_either = graduation_either;
    this.other = other;
  }

  /* Get-Functions */
  public Department get_department() { return this.department; }
  public int get_total_credit() { return this.total_credit; }
  public int get_general_credit() { return this.general_credit; }
  public int get_single_credit() { return this.single_credit; }
  public int get_main_credit() { return this.main_credit; }
  public int get_double_credit() { return this.double_credit; }
  public int get_minor_credit() { return this.minor_credit; }
  public double get_minimum_GPA() { return this.minimum_GPA; }
  public Course[] get_general_required() { return this.general_required; }
  public int get_general_writing_credit() { return this.general_writing_credit; }
  public int get_general_foreign_credit() { return this.general_foreign_credit; }
  public int get_general_math_credit() { return this.general_math_credit; }
  public int get_general_science_credit() { return this.general_science_credit; }
  public int get_general_computer_credit() { return this.general_computer_credit; }
  public int get_general_liberalarts_credit() { return this.general_liberalarts_credit; }
  public int get_general_nature_credit() { return this.general_nature_credit; }
  public int get_general_other_credit() { return this.general_other_credit; }
  public Course[] get_major_required() { return this.major_required; }
  public Course[] get_major_selective() { return this.major_selective; }
  public boolean get_graduation_thesis() { return this.graduation_thesis; }
  public boolean get_graduation_work() { return this.graduation_work; }
  public boolean get_graduation_either() { return this.graduation_either; }
  public String get_other() { return this.other; }
}
