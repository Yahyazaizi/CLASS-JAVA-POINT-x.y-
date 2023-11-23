public class Point {
    private double x;
    private double y;

    public Point() {
        this(0, 0);
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(point.getY() - this.y, 2) + Math.pow(point.getX() - this.x, 2));
    }

    public double norm() {
        return distance(new Point(0, 0));
    }
}