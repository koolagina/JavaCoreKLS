package HW5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVfileClass {

    public static ArrayList<int[][]> fIleObjectArrayList = new ArrayList<int[][]>();
    public static final String pathToFile = "src/HW5/demo.csv";
    private static String[] header;
    private static int[][] data;

    public static void main(String[] args) throws IOException {
        AppData appData = new AppData();
        header = appData.getHeader();
        data = appData.getData();
        fIleObjectArrayList.add(data);
        writer();
        //readToObject();
        BufferedReader br = new BufferedReader(new FileReader(pathToFile));
        System.out.println(br);
    }
    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            for (String val:header) {
                writer.write(val+ ";");
            }writer.write(System.getProperty("line.separator"));

            for(int[] element : data) {
                for(int el:element) {writer.write(el + ";");}writer.write(System.getProperty("line.separator"));
                    }
        }
    }



    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader( line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };

        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;

    }
    }



