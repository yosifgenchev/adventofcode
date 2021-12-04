package me.yosif.adventofcode;

public class Submarine {

    private final SubmarinePosition submarinePosition = new SubmarinePosition();

    public void goForward(int units) {
        submarinePosition.increaseHorizontalPositionBy(units);
    }

    public void goDown(int units) {
        submarinePosition.increaseDepthBy(units);
    }

    public void goUp(int units) {
        submarinePosition.decreaseDepthBy(units);
    }

    public void perform(String command) {
        String[] commandParts = command.split(" ");

        String commandType = commandParts[0];
        int units = Integer.parseInt(commandParts[1]);

        switch (commandType)
        {
            case "forward" -> goForward(units);
            case "down" -> goDown(units);
            case "up" -> goUp(units);
        }
    }

    public int getFinalPosition() {
        return submarinePosition.getHorizontalPosition() * submarinePosition.getDepth();
    }
}
