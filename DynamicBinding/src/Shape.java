abstract class Shape {

    private double x;
    private double y;

    public void setData(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract double compute_area();
}
