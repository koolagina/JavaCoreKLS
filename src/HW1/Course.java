package HW1;
import java.util.ArrayList;
import java.util.List;
//создаем класс полосы препятствий
public class Course {
    //объявляем переменные
    String result;
    String listWinner;
    private int running; //скорость необходимая для победы (км/ч)
    private int archery; //точность необходимая для победы (%)
    private int highJump; //высота необходимая для победы (см)

    //конструктор
    public Course(int running, int archery, int highJump) {
        this.running = running;
        this.archery = archery;
        this.highJump = highJump;
    }
    //метод прохождения полосы препятствий
    public String doIt(Team team){
        List<String> winners = new ArrayList<>();//список победителей
        result = "Команда: "+ team.getName()+ " " + '\n';

        for(TeamMate member: team.getMembers()){
            result += "Cпортсмен: " + member.getName()+ " " + '\n';
            int valueRunningSpeed = member.getRunningSpeed();
            int valueArcheryAccuracy = member.getArcheryAccuracy();
            int valueJumpHeight = member.getJumpHeight();

            testRunning(valueRunningSpeed);
            testArchery(valueArcheryAccuracy);
            testHighJump(valueJumpHeight);

            if (testAll(valueRunningSpeed, valueArcheryAccuracy, valueJumpHeight)) {
                winners.add(String.valueOf(member.getName()));
            }
        }
        listWinner = "Члены команды " + team.getName()+ " успешно прошедшие все испытания: " + winners + '\n';

        return listWinner + result;

    }
    //метод определяющий успешность прохождения дистанции бега
    private void testRunning(int valueRunningSpeed){
        if(valueRunningSpeed>=running) result = result + "Дистанцию прошел с нужной скоростью. Бег - ЗАЧЕТ "+ '\n';
        else result += "Не смог уложиться в отведенное время. Бег - НЕ ЗАЧЕТ "+ '\n';

    }
    //метод определяющий успешность прохождения стрельбы из лука
    private void testArchery(int valueArcheryAccuracy){
        if(valueArcheryAccuracy>=archery) result += "Поражено достаточное количество мишеней. Стрельба из лука - ЗАЧЕТ "+ '\n';
        else result += "Поражено не достаточное количество мишеней. Стрельба из лука - НЕ ЗАЧЕТ "+ '\n';
    }
    //метод определяющий успешность прохождения прыжков в высоту
    private void testHighJump(int valueJumpHeight){
        if(valueJumpHeight>highJump) result += "Прыгнул выше планки. Прыжок в высоту - ЗАЧЕТ "+ '\n';
        else result += "Планка сбита. Прыжок в высоту - НЕ ЗАЧЕТ "+ '\n';
    }
    //метод определяющий успешность прохождения всей полосы препятствий
    private boolean testAll(int valueRunningSpeed, int valueArcheryAccuracy, int valueJumpHeight) {
        return ((valueRunningSpeed >= running) && (valueArcheryAccuracy >= archery) && (valueJumpHeight > highJump));
    }
}

