package lap7;

import java.util.Objects;

public class Circle implements shape {
    public Circle(int radius) {
        this.radius = radius;
    }

    private  int radius;

    @Override
    public double area() {
        return radius*radius*Math.PI;
    }


    @Override
    public double perimeter() {
        return 2*radius*Math.PI;
    }


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return radius == circle.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
