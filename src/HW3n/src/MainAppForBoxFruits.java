/*
2. Задача:
Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
Для хранения фруктов внутри коробки можно использовать ArrayList;
Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той,
которую подадут в compare() в качестве параметра.
true – если их массы равны, false в противоположном случае.
Можно сравнивать коробки с яблоками и апельсинами;
Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
Не забываем про метод добавления фрукта в коробку.*/

public class MainAppForBoxFruits {
    public static void main(String[] args) {
        //создаем коробки и заполняем их
        Box<Apple> boxWithApple = new Box<>(new Apple(), new Apple(), new Apple(), new Apple(), new Apple());
        Box<Orange> boxWithOranges = new Box<>(new Orange(), new Orange());
        //создаем пустую коробку для апельсинов
        Box<Orange> anotherBoxWithOranges = new Box<>();

        System.out.println("Вес коробки с яблоками (брутто): " + boxWithApple.getWeight());
        System.out.println("Вес коробки с апельсинами (брутто): " + boxWithOranges.getWeight());

        //сравниваем коробки по весу
        System.out.println("Вес коробки с яблоками равен(true)/не равен(false) весу коробки с апельсинами: "+boxWithApple.compare(boxWithOranges));

        //добавляем яблоко и 2 апельсина
        boxWithApple.addFruit(new Apple());
        boxWithOranges.addFruit(new Orange());
        boxWithOranges.addFruit(new Orange());

        System.out.println("После добавления нового яблока, вес коробки с яблоками (брутто) стал: " + boxWithApple.getWeight());
        System.out.println("После добавления двух апельсинов вес коробки с апельсинами (брутто) стал: " + boxWithOranges.getWeight());
        //снова сравниваем коробки по весу
        System.out.println("Вес коробки с яблоками равен(true)/не равен(false) весу коробки с апельсинами: "+boxWithApple.compare(boxWithOranges));
        //перекладываем фрукты из одной коробки в другую
        boxWithOranges.replaceFruitsToAnotherBox(anotherBoxWithOranges);

        System.out.println("После пересыпания фруктов, вес пустой коробки из под апельсинов стал: " + boxWithOranges.getWeight());
        System.out.println("После пересыпания фруктов, вес новой коробки (брутто) стал: " + anotherBoxWithOranges.getWeight());
    }


}