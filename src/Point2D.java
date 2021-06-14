public class Point2D {
     float x;
     float y;

    public Point2D(){
    }

    public Point2D(float x, float y){
        this.x =x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxy(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float[] getxy(){
        return new float[]{this.x, this.y};
    }

    @Override
    public String toString() {
        return "Point2D{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
