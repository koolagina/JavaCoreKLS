package HW5;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CSVfileClass {

    public static ArrayList<int[][]> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "src/HW5/demo.csv"; //путь к файлу
    private static String[] header;//заголовки
    private static int[][] data;//данные

    public static void main(String[] args) throws IOException {
        AppData appData = new AppData();//создаем новый экземпляр содержимого файла
        header = appData.getHeader();//подтягиваем заголовки
        data = appData.getData();//подтягиваем данные
        fIleObjectArrayList.add(data);//заполняем рабочий массив
        writer();//записываем данные в файл
        reader();//считываем данные из файла в консоль
    }
    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFile);){
            for (String val:header) { writer.write(val+ ";");//записываем заголовок в файл
            } writer.write(System.getProperty("line.separator"));//отделяем строку

            for(int[] element : data) {
                for(int el:element) { writer.write(el + ";");//записываем данные в файл
                } writer.write(System.getProperty("line.separator"));
                    }
        }
    }
    public static void reader() throws IOException{
            byte[] buf = new byte[100];//заводим рабочий массив
            try (FileInputStream in = new FileInputStream(pathToFile)) {
                int count;

                while ((count = in.read(buf)) > 0) {
                    for (int i = 0; i < count; i++) {
                        System.out.print((char) buf[i]);//посимвольно выводим данные в консоль
                    }
                }
            }
    }
}






