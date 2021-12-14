package data.services.parser;

import data.services.csv.model.HumanDto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class for parsing records from the foreign_names.csv file.
 */
public class HumanParser {
    /**
     * Parses line of data from file and returns HumanDto object.
     * @param line - one record from file.
     * @return HumanDto object.
     */
    public HumanDto parse(String[] line) {
        var record = new ArrayList<>(List.of(line[0].split(";")));

        if (line.length > 1) {
            fixInvalidRecord(line, record);
        }

        HumanDto human = new HumanDto();
        human.setId(Integer.parseInt(record.get(0)));
        human.setName(record.get(1));
        human.setSex(record.get(2));
        human.setDateOfBirth(record.get(3));
        human.setSubdiv(record.get(4));
        human.setSalary(Integer.parseInt(record.get(5)));

        return human;
    }

    /**
     * Method for dealing with parsing issues. If User's name contains spaces or commas.
     * @param line - one record from file.
     * @param record - transformed readable record.
     */
    private void fixInvalidRecord(String[] line, ArrayList<String> record) {
        String[] piece = new String[0];
        String fullName = "";
        if (line.length == 2) {
            piece = line[1].split(";");
            fullName = record.get(1) + piece[0];
        } else if (line.length == 3) {
            var piece1 = line[1];
            piece = line[2].split(";");
            fullName = record.get(1) + piece1 + piece[0];
        }
        record.set(1, fullName);
        record.addAll(Arrays.asList(piece).subList(1, piece.length));
    }
}
