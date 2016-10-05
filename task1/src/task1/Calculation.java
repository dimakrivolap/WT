package task1;

public class Calculation
{
    private double x;
    private double y;

    public Calculation()
    {
        x = 0;
        y = 0;
    }

    public Calculation(double x, double y)
    {
        this.x = x;
        this.y = y;
    }


    public double getX() { return x; }
    public void setX(double x) { this.x = x; }
    public double getY() { return y; }
    public void setY(double y) { this.y = y; }


    public double calculate()
    {
        double numerator = 1 + Math.pow(Math.sin(x + y), 2);
        double denominator = 2 + Math.abs(x - 2 * x / (1 + x * x * y * y));

        if (denominator == 0)
            throw new ArithmeticException();

        return numerator / denominator + x;
    }
}
