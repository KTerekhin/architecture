public class Main {

    public static void main(String[] args) {
        runProgram();
    }

    static void runProgram() {
        Participant[] participant = new Participant[3];
        participant[0] = new Human("Петя", 1000, 4);
        participant[1] = new Cat("Васька", 800, 10);
        participant[2] = new Robot("Терминатор", 1500, 5);

        ObstacleImpl[] obstacle = new ObstacleImpl[2];
        obstacle[0] = new ObstacleTrack(1000);
        obstacle[1] = new ObstacleWall(5);

        for (Participant value : participant) {
            value.run(obstacle[0]);
            value.infoRun();
            value.jump(obstacle[1]);
            value.infoJump();
        }
    }
}

