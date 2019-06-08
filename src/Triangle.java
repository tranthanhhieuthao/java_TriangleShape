public class Triangle extends Shape {
    private double side1 =1.0;
    private double side2 =1.0;
    private double side3 =1.0;

    public Triangle(){
    }

    public Triangle(double side1,double side2,double side3,String color,boolean filled){
        super(color, filled);
        this.side1 =side1;
        this.side2 =side2;
        this.side3 =side3;

    }

    public double getSide1(){
        return this.side1;
    }

    public void setSide1(double side1){
        this.side1 =side1;
    }

    public double getSide2(){
        return this.side1;
    }

    public void setSide2(double side2){
        this.side2 =side2;
    }

    public double getSide3(){
        return this.side3;
    }

    public void setSide3(double side3){
        this.side3 =side3;
    }

    public void setside(double side1,double side2,double side3){
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
    }

    public double getPerimeter(){
        return this.side1 +this.side2 + this.side3;
    }

    public double getArea(){
        return Math.pow((getPerimeter()/2)*(getPerimeter()/2 -this.side1)*(getPerimeter()/2 -this.side2)*(getPerimeter()/2 -this.side3),0.5);
    }

    @Override
    public String toString(){
        return "A Triangle have"+" "
                +"side1 ="
                +this.side1+" "
                +"side2 ="
                +this.side2+" "
                +"side3 ="
                +this.side3
                +" "
                +"and"+"\n "
                +"it have Area =" +" "
                +getArea()+" "
                +"and have perimeter =" +" "
                +getPerimeter()+ " \n"
                +"Color = "
                +super.getColor()+" "
                +"filled = "
                +super.isFilled();
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        triangle = new Triangle(10,12,15,"yellow",true);
        System.out.println(triangle);
    }
}
