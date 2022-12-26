package task10.utils;

import task10.logic.Tablet;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

public class OutputFileWriterTablets {
    public void saveFile(String outputFile, List<Tablet> bestTablet, int sumTablets)
            throws FileNotFoundException {
        final File file = new File(outputFile);
        try (final PrintWriter writer = new PrintWriter(file)) {

            if (bestTablet == null) {
                writer.print("No suitable tablet found, sorry;(");
            } else {
                writer.print("\nВыбранные планшеты: " + bestTablet + "\nСтоимость:" + sumTablets);
            }
        }
    }
}