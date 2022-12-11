import java.util.ArrayList;
import java.util.Arrays;

//создаем класс коробки
public class Box<T extends Fruit> {
    final float BOXWEIGHT = (float) 0.2; //вес пустой коробки

    ArrayList<T> box; //массив фруктов в коробке

    @SafeVarargs
    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
    } //конструктор

    public void addFruit(T fruit) {
        box.add(fruit);
    } //метод для добавления фрукта в коробку

    // метод вычисления веса коробки
    public float getWeight() {
        float totalWeight = BOXWEIGHT;
        for (T t : box) {
            totalWeight = totalWeight + t.getWeight();
        }
        return totalWeight;
    }
    //метод сравнения веса коробок
    public boolean compare(Box<? extends Fruit> boxWithSomething) {
        return Math.abs(getWeight() - boxWithSomething.getWeight()) < 0.0001f;
    }
    //метод перекладывания фруктов в другую коробку
    public void replaceFruitsToAnotherBox(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box); //перемещаем все фрукты
        this.box.clear(); //очищаем коробку
    }
    //геттер
    public ArrayList<T> getBox() {
        return box;
    }
}

