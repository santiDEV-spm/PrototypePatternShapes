import java.util.Objects;

public class Circle extends Shape{

    private int radius;

    public Circle(){

    }

    public Circle(Circle target){
        super(target);
        if (target != null){
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Circle) || !super.equals(object)) return false;
        Circle circle = (Circle) object;
        return circle.getRadius() == this.radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
