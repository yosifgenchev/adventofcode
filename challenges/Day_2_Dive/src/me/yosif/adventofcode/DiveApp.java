package me.yosif.adventofcode;

import java.util.List;

public class DiveApp {

  public static void main(String[] args) {
    String input = args[0];
    System.out.println("Reading data from: " + input);

    List<String> commands = Util.readLinesOfFile(input);

    Submarine submarine = new Submarine();

    commands.forEach(submarine::perform);

    System.out.println("Submarine's final position: " + submarine.getFinalPosition());
  }
}
