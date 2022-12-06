package HW1;

//основная программа
public class MainApp {

    public static void main(String[] args) {
        //создаем массив спортсменов
        TeamMate[] member = new TeamMate[4];
        member[0] = new TeamMate("Игнат", 24, 75, 220);
        member[1] = new TeamMate("Архип", 21, 80, 222);
        member[2] = new TeamMate("Захар", 28, 94, 232);
        member[3] = new TeamMate("Ярополк", 25, 68, 189);

        Team team = new Team("Сибирь", member);//создаем экземпляр команды

        //создаем экземпляр полосы препятствий и задаем параметры необходимые для победы
        // (скорость (км/ч), точность стрельбы из лука (%), высота прыжка (см))
        Course course = new Course(22,75,210);

        String result = course.doIt(team); //задаем переменную result, которая содержит результат прохождения полосы препятствий

        System.out.println(result);//выводим результат в консоль
    }
}
