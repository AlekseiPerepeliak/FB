package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVDataProvider {


    public static Iterator<Object[]> loadDataFromFile() {
        List<Object[]> list = new ArrayList<Object[]>();
        String filePath = new File("./target/classes/InvalidCredentials.csv").getAbsolutePath();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            reader.readLine();
            String line = reader.readLine();

            while (line != null) {
                String[] params = line.split(",");
                list.add(new Object[]{params[0], params[1]});
                line = reader.readLine();
            }
        } catch (Exception e) {
        }
        return list.iterator();
    }
}
