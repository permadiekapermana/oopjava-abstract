public abstract class Shape {
    
    String color;
    
    void setColor(String color){
        this.color = color;
    }
    
    String getColor(){
        return this.color;
    }
    
    abstract float getArea();
}

public class Triangle extends Shape {

    private float base;
    private float height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    @Override
    float getArea() {
        return 0.5f * base * height;
    }
    
}

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }
    
    
    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
    
}