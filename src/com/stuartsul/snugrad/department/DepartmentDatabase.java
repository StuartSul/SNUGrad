package com.stuartsul.snugrad.department;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class DepartmentDatabase {

  /* Database */
  private Division[] divisions;
  private Department[] departments;

  /* Constructor */
  public DepartmentDatabase(String KRFileLocation, String ENFileLocation, int fileSize) {

    int divisionNumber = 0;
    int departmentNumber = 0;
    int index_division = 0;
    int index_department = 0;
    int cnt_department = 0;
    String line_kr;
    String line_en;

    try {
      BufferedReader br_kr =
        new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(KRFileLocation)), fileSize);
      BufferedReader br_en =
        new BufferedReader(new InputStreamReader(getClass().getResourceAsStream(ENFileLocation)), fileSize);

      br_kr.mark(fileSize);

      while ((line_kr = br_kr.readLine()) != null) {
          if (line_kr.charAt(0) == '*') continue;
          else if (line_kr.charAt(0) == '#') divisionNumber++;
          else departmentNumber++;
      }

      br_kr.reset();

      this.divisions = new Division[divisionNumber];
      this.departments = new Department[departmentNumber];

      while (((line_kr = br_kr.readLine()) != null) && ((line_en = br_en.readLine()) != null)) {
          if (line_kr.charAt(0) == '*') continue;
          else if (line_kr.charAt(0) == '#') {
            if (index_division != 0)
              this.divisions[index_division - 1].setDepartmentNumber(cnt_department);

            this.divisions[index_division] = new Division(line_kr.substring(1),
                                                          line_en.substring(1),
                                                          index_division);
            index_division++;
            cnt_department = 0;
          }
          else {
            this.departments[index_department] = new Department(line_kr.substring(1),
                                                                line_en.substring(1),
                                                                index_department,
                                                                this.divisions[index_division - 1]);
            index_department++;
            cnt_department++;
          }
      }

      this.divisions[index_division - 1].setDepartmentNumber(cnt_department);

      index_department = 0;

      for (int i = 0; i < this.divisions.length; i++) {
        Department[] temp = new Department[this.divisions[i].getDepartments().length];
        for (int j = 0; j < temp.length; j++) temp[j] = this.departments[index_department++];
        this.divisions[i].setDepartments(temp);
      }
    } catch (Exception e) {
      System.out.println("ERROR: the program cannot properly form departments database");
      e.printStackTrace();
      System.out.println("Program terminated");
      System.exit(0);
    }
  }

  public void updateRequirements (String requirementFileLocation) {

  }

  /* Get-Functions */
  public Division[] getDivisions() { return this.divisions; }
  public Department[] getDepartments() { return this.departments; }

  /* Search Functions */
  public Division getDivision(String name) {
    for (int i = 0; i < this.divisions.length; i++) {
      if (this.divisions[i].getNameKR().equals(name) ||
          this.divisions[i].getNameEN().equals(name))
          return this.divisions[i];
    }

    return null;
  }

  public Division getDivision(int code) {
    if (code >= 0 && code < this.divisions.length)
      return this.divisions[code];
    else
      return null;
  }

  public Department getDepartment(String name) {
    for (int i = 0; i < this.departments.length; i++) {
      if (this.departments[i].getNameKR().equals(name) ||
          this.departments[i].getNameEN().equals(name))
          return this.departments[i];
    }

    return null;
  }

  public Department getDepartment(int code) {
    if (code >= 0 && code < this.departments.length)
      return this.departments[code];
    else
      return null;
  }
}
