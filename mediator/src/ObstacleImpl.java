public class ObstacleImpl implements Obstacle {
    private int param;

    @Override
    public boolean runTrack(int RunDistance) {
        return param - RunDistance <= 0;
    }

    @Override
    public boolean jumpWall(int JumpHeight) {
        return param - JumpHeight <= 0;
    }
}
