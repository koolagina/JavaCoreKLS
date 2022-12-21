package HW3;
/*1. Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);
*/

import java.util.Arrays;

public class ChangeElementsInArray {
    static Integer[] arrayA = {5,6,7,8};

    //основной метод
    public static void main(String[] args) {
        changeElementsInArray(arrayA,0,2);
        System.out.println(Arrays.toString(arrayA));
    }
    //метод замены элементов по позициям
    public static void changeElementsInArray(Integer[] arrayName, int positionA, int positionB) {
        Integer elementA = arrayName[positionA];
        arrayName[positionA] = arrayName[positionB];
        arrayName[positionB] = elementA;
    }
}
