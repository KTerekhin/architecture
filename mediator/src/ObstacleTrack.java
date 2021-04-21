public class ObstacleTrack extends ObstacleImpl {
    private int length;

    public ObstacleTrack(int length) {
        this.length = length;
    }

    public boolean runTrack(int RunDistance) {
        return length - RunDistance <= 0;
    }
}
