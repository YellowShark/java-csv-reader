package data.services.csv.reader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;

/**
 * Class for reading data from the foreign_names.csv file.
 */
public class ReaderFromCSV {
    private static final String FILE_NAME = "foreign_names.csv";
    CSVReader reader = new CSVReader(new FileReader(FILE_NAME));

    public ReaderFromCSV() throws IOException, CsvValidationException {
        // Read useless line.
        reader.readNext();
    }

    /**
     * Reads next record.
     * @return array of strings. If data is empty, returns null.
     * @throws CsvValidationException if a validation error occurs.
     * @throws IOException if an I/O error occurs.
     */
    public String[] readNext() throws CsvValidationException, IOException {
        return reader.readNext();
    }

    /**
     * Closes this stream and releases any system resources associated with it.
     * @throws IOException if an I/O error occurs
     */
    public void close() throws IOException {
        reader.close();
    }
}
