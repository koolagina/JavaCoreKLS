package HW1;
//создаем класс члена команды
public class TeamMate {
    private String name;
    private int runningSpeed; //скорость спорсмена
    private int archeryAccuracy; //точность спорсмена
    private int jumpHeight; //высота прыжка спорсмена
    //конструктор
    public TeamMate(String name, int runningSpeed, int archeryAccuracy, int jumpHeight) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.archeryAccuracy = archeryAccuracy;
        this.jumpHeight = jumpHeight;
    }
    //геттеры
    public String getName() {
        return name;
    }

    public int getRunningSpeed() {
        return runningSpeed;
    }

    public int getArcheryAccuracy() {
        return archeryAccuracy;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }
}

