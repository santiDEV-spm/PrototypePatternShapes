import java.util.Objects;

public abstract class Shape {

    private int x;
    private int y;
    private String color;

    public Shape(){

    }

    public Shape(Shape target){
        if (target != null){
            this.x = target.getX();
            this.y = target.getY();
            this.color = target.getColor();
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object object){
        if (!(object instanceof Shape)) return false;
        Shape shape = (Shape) object;
        return shape.getX() == this.x && shape.getY() == this.y && Objects.equals(shape.getColor(), this.color);
    }

    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

