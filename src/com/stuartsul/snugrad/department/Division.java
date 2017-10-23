package com.stuartsul.snugrad.department;

public class Division {

  /* Divisons
  public static final int unknown = -1;
  public static final int humanities = 0;         // 인문대학
  public static final int social_science = 1;     // 사회과학대학
  public static final int natural_science = 2;    // 자연과학대학
  public static final int nursing = 3;            // 간호대학
  public static final int business = 4;           // 경영대학
  public static final int engineering = 5;        // 공과대학
  public static final int agriculture = 6;        // 농업생명과학대학
  public static final int art = 7;                // 미술대학
  public static final int law = 8;                // 법과대학
  public static final int education = 9;          // 사범대학
  public static final int human_ecology = 10;     // 생활과학대학
  public static final int vet = 11;               // 수의과대학
  public static final int pharmacy = 12;          // 약학대학
  public static final int music = 13;             // 음악대학
  public static final int medicine = 14;          // 의과대학
  public static final int liberal = 15;           // 자유전공학부
  public static final int interdisciplinary = 16; // 연계, 연합전공
  */

  /* Fields */
  private String name_KR;
  private String name_EN;
  private int code;
  private Department[] departments;

  /* Constructor */
  public Division(String name_KR, String name_EN, int code) {
    this.name_KR = name_KR;
    this.name_EN = name_EN;
    this.code = code;
  }

  /* Set-Functions for DepartmentDatabase Class */
  void setDepartmentNumber(int departmentNumber) {
    this.departments = new Department[departmentNumber];
  }

  void setDepartments(Department[] departments) {
    for (int i = 0; i < this.departments.length; i++)
      this.departments[i] = departments[i];
  }

  /* Get-Functions */
  public String getNameKR() { return this.name_KR; }
  public String getNameEN() { return this.name_EN; }
  public int getCode() { return this.code; }
  public Department[] getDepartments() { return this.departments; }
}
