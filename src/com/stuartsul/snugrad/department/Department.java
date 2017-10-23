package com.stuartsul.snugrad.department;

public class Department {

  /* Fields */
  private String name_KR;
  private String name_EN;
  private int code;
  private Requirement requirement;
  private Division division;

  /* Constructor */
  Department(String name_KR, String name_EN,
                    int code, Division division) {
    this.name_KR = name_KR;
    this.name_EN = name_EN;
    this.code = code;
    this.division = division;
  }

  /* Set-Function for DepartmentDatabase Class */
  void setRequirement(Requirement requirement) {
    this.requirement = requirement;
  }

  /* Get-Functions */
  public String getNameKR() { return this.name_KR; }
  public String getNameEN() { return this.name_EN; }
  public int getCode() { return this.code; }
  public Requirement getRequirement() { return this.requirement; }
  public Division getDivision() { return this.division; }
}
