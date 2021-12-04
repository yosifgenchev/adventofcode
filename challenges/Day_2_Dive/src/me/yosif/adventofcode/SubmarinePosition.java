package me.yosif.adventofcode;

public class SubmarinePosition {
  int horizontalPosition;
  int depth;
  int aim;

  public void increaseHorizontalPositionBy(int units) {
    horizontalPosition += units;
    adjustDepthBy(units);
  }

  public void adjustDepthBy(int units) {
    if (aim > 0) {
      depth += (units * aim);
    }
  }

  public void increaseAimBy(int units) {
    aim += units;
  }

  public void decreaseAimBy(int units) {
    aim -= units;
  }

  public int getHorizontalPosition() {
    return horizontalPosition;
  }

  public int getDepth() {
    return depth;
  }
}
