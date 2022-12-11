//создаем класс фрукт
abstract public class Fruit {
    private final String kind;
    private final Float weight;

    //конструктор
    public Fruit(String kind, Float weight) {
        this.kind = kind;
        this.weight = weight;
    }

    //геттеры
    public String getKind() {
        return kind;
    }
    public Float getWeight() {
        return weight;
    }
}

