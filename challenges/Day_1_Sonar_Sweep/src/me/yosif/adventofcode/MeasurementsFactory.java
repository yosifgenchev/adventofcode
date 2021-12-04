package me.yosif.adventofcode;

import java.util.ArrayList;
import java.util.List;

public class MeasurementsFactory {

  public static List<Measurement> createMeasurements(List<Integer> measurementInputs) {
    return measurementInputs.stream().map(Measurement::new).toList();
  }

  public static List<Measurement> createThreeWindowMeasurements(List<Integer> inputs) {
    // As we need to stop when there aren't enough measurements left to create a new three-measurement sum,
    // we should to exclude the modulus if any
    int mod = inputs.size() % 3;

    List<Measurement> measurements = new ArrayList<>();

    for (int i = 0; i < inputs.size() - mod; i++) {
      Measurement measurement = new Measurement(inputs.get(i) + inputs.get(i + 1) + inputs.get(i + 2));

      measurements.add(measurement);
    }

    return measurements;
  }
}
