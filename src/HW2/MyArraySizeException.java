package HW2;

public class MyArraySizeException extends Exception{
    public MyArraySizeException(){
        super("Не верно заданы размеры массива. Задайте массив 4*4");
    }
}
