package ipl;

import com.opencsv.*;
import java.io.*;
import java.util.*;

public class CSVProcessor {
    public static void processCSV(String inputPath, String outputPath) throws Exception {
        try (
                CSVReader reader = new CSVReader(new FileReader(inputPath));
                CSVWriter writer = new CSVWriter(new FileWriter(outputPath))
        ) {
            String[] headers = reader.readNext();
            writer.writeNext(headers);

            String[] row;
            while ((row = reader.readNext()) != null) {
                row[1] = CensorshipUtil.maskTeam(row[1]);
                row[2] = CensorshipUtil.maskTeam(row[2]);
                row[5] = CensorshipUtil.maskTeam(row[5]);
                row[6] = CensorshipUtil.redactPlayer();
                writer.writeNext(row);
            }
        }
    }
}

