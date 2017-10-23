package com.stuartsul.snugrad.main;

import com.stuartsul.snugrad.course.*;
import com.stuartsul.snugrad.department.*;
import com.stuartsul.snugrad.handler.*;
import com.stuartsul.snugrad.student.*;

public class SNUGrad {

  /* Program Information */
  public static final int magic = 0xADAD;
  public static final int version = 0;
  public static final int revision = 0;
  public static final int build = 1;

  static final String info =
    "SNUGrad " + version + "." + revision + "." + build + "\n" +
    "Open source graduation planner for Seoul National University undergraduate students\n" +
    "Developed by Hyoung Uk \"Stuart\" Sul\n" +
    "GitHub: https://github.com/StuartSul/SNUGrad\n";

  static final String cliInfo = "Type \"help\" for command information\n";

  static final String promptMessage = ">> ";

  static final String unknownCommandMessage = "Unknown command syntax. " + cliInfo;

  static final String commandInfo =
    "Command syntax : main_command <option1> <option2> ...\n" +
    "     create <name> <class_year>    creates and opens new student data\n" +
    "     open <student_file_location>  opens an existing student data\n" +
    "     save <student_file_name>      saves current student data\n" +
    "     __________________________________________________________________________________________\n" +
    "     department                    displays all the departments with their codes\n" +
    "     search <course_name>          searches for courses and their codes\n" +
    "     update                        updates course database from sugang site\n" +
    "     __________________________________________________________________________________________\n" +
    "     status                        displays current student data with graduation statistics\n" +
    "     add <course_code>             adds a taken course to current student data\n" +
    "     delete <course_code>          deletes a taken course information from current student data\n" +
    "     __________________________________________________________________________________________\n" +
    "     help                          displays the list of commands\n" +
    "     info                          displays program information\n" +
    "     exit                          exits program\n";

  static final String usageInfo =
    "<Usage>\n" +
    "no option     run with graphical user interface\n" +
    "-cli          run with command line interface\n";

  /* Main data fields */
  static Student student;
  static DepartmentDatabase departmentDatabase;
  static CourseDatabase courseDatabase;
  private static ErrorHandler errorHandler;
  private static Fetcher fetcher;
  private static Loader loader;
  private static Saver saver;

  /* main function */
  public static void main(String[] args) {
      departmentDatabase = new DepartmentDatabase(
        "/resources/departmentdata/departments_kr.data",
        "/resources/departmentdata/departments_en.data", 10000);
      courseDatabase = new CourseDatabase();
      departmentDatabase.updateRequirements("");
      errorHandler = new ErrorHandler();
      fetcher = new Fetcher();
      loader = new Loader();
      saver = new Saver();

      System.out.print(info);

      if (args.length == 0) {
        System.out.println();
        new GUI();
      } else if (args[0].equals("-cli")) {
        System.out.print(cliInfo);
        new CLI().run();
      } else {
        System.out.println();
        System.out.print(usageInfo);
      }
  }

  /* Primary functions used both by CLI and GUI
     Integer return values indicate success/failure of the function */
  static int create(String name, String year) {
    System.out.println("create " + name + " " + year);
    return 0;
  }

  static int open(String name) {
    System.out.println("open " + name);
    return 0;
  }

  static int save(String name) {
    System.out.println("save " + name);
    return 0;
  }

  static void department() {
    Division[] divisions = departmentDatabase.getDivisions();
    Department[] departments;

    for (int i = 0; i < divisions.length; i++) {
        departments = divisions[i].getDepartments();

        System.out.println(divisions[i].getCode() + ". " +
          divisions[i].getNameKR() + " (" + divisions[i].getNameEN() + ")");

        for (int j = 0; j < departments.length; j++)
          System.out.println("\t" + departments[j].getCode() + ". " +
            departments[j].getNameKR() + " (" + departments[j].getNameEN() + ")");

        System.out.println();
    }
  }

  static void search(String query) {
    System.out.println("search " + query);
  }

  static int update() {
    System.out.println("update");
    return 0;
  }

  static void status() {
    System.out.println("status");
  }

  static int add(String course) {
    System.out.println("add " + course);
    return 0;
  }

  static int delete(String course) {
    System.out.println("delete " + course);
    return 0;
  }
}
