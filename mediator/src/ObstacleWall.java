public class ObstacleWall extends ObstacleImpl {
    private int height;

    public ObstacleWall(int height) {
        this.height = height;
    }

    public boolean jumpWall(int JumpHeight) {
        return height - JumpHeight <= 0;
    }
}
