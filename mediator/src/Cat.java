public class Cat implements Participant {
    private String name;
    private int runDistance;
    private int jumpHeight;
    private boolean successfulRun;
    private boolean successfulJump;

    public Cat(String name, int runDistance, int jumpHeight) {
        this.name = name;
        this.runDistance = runDistance;
        this.jumpHeight = jumpHeight;
    }

    public void run(ObstacleImpl obstacle) {
        successfulRun = obstacle.runTrack(runDistance);
    }

    public void infoRun() {
        if (successfulRun) {
            System.out.println(String.format("Кот %s успешно пробежал дистанцию", name));
        } else {
            System.out.println(String.format("Кот %s не смог пробежать дистанцию", name));
        }
    }

    public void jump(ObstacleImpl obstacle) {
        successfulJump = obstacle.jumpWall(jumpHeight);
    }

    public void infoJump() {
        if (successfulJump) {
            System.out.println(String.format("Кот %s успешно перепрыгнул через стену", name));
        } else {
            System.out.println(String.format("Кот %s не смог перепрыгнуть через стену", name));
        }
    }
}
