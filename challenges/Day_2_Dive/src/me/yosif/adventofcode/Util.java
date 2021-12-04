package me.yosif.adventofcode;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Util
{
    public static List<String> readLinesOfFile(String fileLocation) {
        Path path = Paths.get(fileLocation);

        List<String> lines;

        try {
            lines = new ArrayList<>(Files.readAllLines(path).stream().toList());
        } catch (IOException e) {
            throw new IllegalStateException("Unable to read input from " + fileLocation, e);
        }

        return lines;
    }
}
