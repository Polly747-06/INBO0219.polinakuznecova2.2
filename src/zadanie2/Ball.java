package zadanie2;

public class Ball {
    private double X = 0.0D;
    private double Y = 0.0D;

    public Ball(double x, double y) {
    }

    public double getX() {
        return this.X;
    }

    public double getY() {
        return this.Y;
    }

    public void setX(double x) {
        this.X = x;
    }

    public void setY(double y) {
        this.Y = y;
    }

    public void setXY(double x, double y) {
        this.X = x;
        this.Y = y;
    }

    public void move(double xDisp, double yDisp) {
        this.X += xDisp;
        this.Y += yDisp;
    }

    public String toString() {
        return "Ball{X=" + this.X + ", Y=" + this.Y + "}";
    }
}

