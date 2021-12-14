import com.opencsv.exceptions.CsvValidationException;
import data.services.mapper.HumanMapper;
import data.services.parser.HumanParser;
import data.services.csv.reader.ReaderFromCSV;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Main class of the program.
 * @author Daniil.
 */
public class Main {
    /**
     * Reads all data from the file and saves in the list.
     * @param args - default parameter.
     * @throws IOException if an I/O error occurs.
     * @throws CsvValidationException if a validation error occurs.
     */
    public static void main(String[] args) throws IOException, CsvValidationException {
        var reader = new ReaderFromCSV();
        var parser = new HumanParser();
        var mapper = new HumanMapper();
        var results = new ArrayList<>();

        String[] record;

        while ((record = reader.readNext()) != null) {
            var humanDto = parser.parse(record);
            var human = mapper.toDomain(humanDto);
            results.add(human);
        }
        reader.close();

        System.out.println(results);
    }
}
