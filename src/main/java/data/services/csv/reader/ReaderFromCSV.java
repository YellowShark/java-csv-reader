package data.services.csv.reader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

public class ReaderFromCSV {
    private static final String FILE_NAME = "foreign_names.csv";
    CSVReader reader = new CSVReader(new FileReader(FILE_NAME));

    public ReaderFromCSV() throws IOException, CsvValidationException {
        // Read useless line.
        reader.readNext();
    }

    public String[] readNext() throws CsvValidationException, IOException {
        return reader.readNext();
    }

    public void close() throws IOException {
        reader.close();
    }
}
