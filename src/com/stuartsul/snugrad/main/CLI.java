package com.stuartsul.snugrad.main;

import java.util.Scanner;

class CLI {
  private static final int unknown = -1;
  private static final int create = 0;
  private static final int open = 1;
  private static final int save = 2;
  private static final int department = 3;
  private static final int search = 4;
  private static final int update = 5;
  private static final int status = 6;
  private static final int add = 7;
  private static final int delete = 8;
  private static final int help = 9;
  private static final int info = 10;
  private static final int exit = 11;

  void run() {
    Scanner sc = new Scanner(System.in);

    String line;
    String[] option = new String[10];

    while (true) {
      System.out.print(SNUGrad.promptMessage);
      line = sc.nextLine();

      switch (interpret(line, option)) {
        case unknown :
          System.out.print(SNUGrad.unknownCommandMessage);
          break;
        case create :
          SNUGrad.create(option[0], option[1], option[2]);
          break;
        case open :
          SNUGrad.open(option[0]);
          break;
        case save :
          SNUGrad.save(option[0]);
          break;
        case department :
          SNUGrad.department();
          break;
        case search :
          SNUGrad.search(option[0]);
          break;
        case update :
          SNUGrad.update();
          break;
        case status :
          SNUGrad.status();
          break;
        case add :
          SNUGrad.add(option[0]);
          break;
        case delete :
          SNUGrad.delete(option[0]);
          break;
        case help :
          System.out.print(SNUGrad.commandInfo);
          break;
        case info :
          System.out.print(SNUGrad.info);
          break;
        case exit :
          sc.close();
          System.exit(0);
          break;
      }
    }
  }

  private int interpret(String line, String[] option) {
    Scanner sc = new Scanner(line);
    String command = sc.next();

    if (command.equals("create")) {

      for (int i = 0; i < 3; i++) {
        if (sc.hasNext())
          option[i] = sc.next();
        else
          return unknown;
      }

      return create;

    } else if (command.equals("open")) {

      if (sc.hasNext())
        option[0] = sc.next();
      else
        return unknown;

      return open;

    } else if (command.equals("save")) {

          if (sc.hasNext())
            option[0] = sc.next();
          else
            return unknown;

          return save;

    } else if (command.equals("department")) {

      return department;

    } else if (command.equals("search")) {

            option[0] = line.substring(command.length() + 1);
            return search;

    } else if (command.equals("update")) {

      return update;

    } else if (command.equals("status")) {

      return status;

    } else if (command.equals("add")) {

            if (sc.hasNext())
              option[0] = sc.next();
            else
              return unknown;

            return add;

    } else if (command.equals("delete")) {

          if (sc.hasNext())
            option[0] = sc.next();
          else
            return unknown;

          return delete;

    } else if (command.equals("help")) {

      return help;

    } else if (command.equals("info")) {

      return info;

    } else if (command.equals("exit")) {

      return exit;

    } else {
      return unknown;
    }
  }
}
