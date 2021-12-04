package me.yosif.adventofcode;

public class SubmarinePosition {
  int horizontalPosition;
  int depth;

  public void increaseHorizontalPositionBy(int units) {
    horizontalPosition += units;
  }

  public void increaseDepthBy(int units) {
    depth += units;
  }

  public void decreaseDepthBy(int units) {
    depth -= units;
  }

  public int getHorizontalPosition() {
    return horizontalPosition;
  }

  public int getDepth() {
    return depth;
  }
}
