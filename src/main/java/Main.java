import com.opencsv.exceptions.CsvValidationException;
import data.mapper.HumanMapper;
import data.parser.HumanParser;
import data.services.csv.reader.ReaderFromCSV;

import java.io.IOException;
import java.util.ArrayList;


public class Main {

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

        System.out.println(results);

        reader.close();
    }
}
