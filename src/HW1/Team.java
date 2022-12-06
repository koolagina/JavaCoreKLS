package HW1;
//создаем класс команды
public class Team {

    private String name;
    private TeamMate[] members; //объявляем массив спортсменов
    //конструктор
    public Team(String name, TeamMate[] members) {
        this.name = name;
        this.members = members;
    }
    //геттеры
    public String getName() {
        return name;
    }
    public TeamMate[] getMembers() {
        return members;
    }
}
