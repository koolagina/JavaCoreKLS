package HW2;

/*1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При
подаче массива другого размера необходимо бросить исключение MyArraySizeException.
2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и
просуммировать. Если в каком-то элементе массива преобразование не удалось (например, в
ячейке лежит символ или текст вместо числа), должно быть брошено исключение
MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3 В методе main() вызвать полученный метод, обработать возможные исключения
MyArraySizeException и MyArrayDataException и вывести результат расчета. */

public class ArrayMain {
    //массив отвечающий всем требованиям
    static String[][] arrayNorm = {{"21", "52", "36", "49"}, {"51", "62", "77", "78"}, {"59", "60", "97", "82"}, {"85", "16", "17", "89"}};
    //массив не правильного размера
    static String[][] arraySizeMistake = {{"1", "2", "1"}, {"1", "6", "5"}, {"9", "6", "8"}, {"5", "6", "9"}};
    //массив с элементом не правильного типа
    static String[][] arrayTypeMistake = {{"8", "2", "7", "4"}, {"7", "6", "k", "8"}, {"9", "8", "7", "8"}, {"5", "6", "7", "8"}};
    //основной метод
    public static void main(String[] args) {
       //запускаем метод получающий сумму элементов с обработкой исключений для каждого из массивов
        try{
            System.out.println("Сумма всех элементов массива: " + arraySum(arrayNorm));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        try{
            System.out.println("Сумма всех элементов массива: " + arraySum(arraySizeMistake));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }

        try{
        System.out.println("Сумма всех элементов массива: " + arraySum(arrayTypeMistake));
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        }
    }

    //метод получающий сумму элементов с проверкой исключений
        static int arraySum(String[][] array) throws MyArraySizeException, MyArrayDataException {
        if (array.length != 4 || array[0].length != 4) throw new MyArraySizeException();//проверка размера массива
        int sum = 0;
        int i = 0;
        int j = 0;
        try {
            for (i = 0; i < array.length; i++) {
                for (j = 0; j < array.length; j++) {
                    sum = sum + Integer.parseInt(array[i][j]); //приведение строкового типа к числовому
                }
            }
        } catch (NumberFormatException e) {
            throw new MyArrayDataException("Ошибка по адресу: " + i + "," + j);
        }
        return sum;
    }
}
