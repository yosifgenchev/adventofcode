package me.yosif.adventofcode;

import java.util.List;

public class SonarSweepApp {

  public static void main(String[] args) {

    String input = args[0];
    System.out.println("Reading data from: " + input);

    List<Integer> lines = Util.mapStringCollectionToIntegerList(Util.readLinesOfFile(input));

    List<Measurement> measurements = MeasurementsFactory.createMeasurements(lines);

    int depthMeasurementIncreasesCount = calculateDepthMeasurementIncreasesCount(measurements);

    System.out.println("Depth measurement increases count: " + depthMeasurementIncreasesCount);

    List<Measurement> threeWindowMeasurements =
        MeasurementsFactory.createThreeWindowMeasurements(lines);

    int threeWindowMeasurementsCount =
        calculateDepthMeasurementIncreasesCount(threeWindowMeasurements);

    System.out.println("Three window measurement increases count: " + threeWindowMeasurementsCount);
  }

  private static int calculateDepthMeasurementIncreasesCount(List<Measurement> measurements) {
    int depthMeasurementIncreasesCount = 0;

    for (int i = 1; i < measurements.size(); i++) {
      if (measurements.get(i).isMoreThan(measurements.get(i - 1))) {
        depthMeasurementIncreasesCount++;
      }
    }

    return depthMeasurementIncreasesCount;
  }
}
