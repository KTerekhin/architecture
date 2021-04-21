public interface Participant {
    void run(ObstacleImpl obstacle);
    void jump(ObstacleImpl obstacle);
    void infoRun();
    void infoJump();
}
