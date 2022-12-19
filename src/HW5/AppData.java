package HW5;


public class AppData {
    private String[] header = {"value1", "value2", "value3"};
    private int[][] data = {{10, 4, 9}, {0, 1, 8}};

    public void setHeader(String[] header) {

        this.header = header;
        this.data = data;

    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void setData(int[][] data) {
        this.data = data;
    }


}
