public class Shape {
    private String color="white";
    public Shape(){

    }
    public Shape (String color ){
        this.color=color;
    }
    private double area (){
        return 0.0;
    }
    private double perimeter () {

        return 0.0;
    }
    public void describe(int sideA, int sideB){
        System.out.println(" Side a is"+ sideA+ "sideB is" +sideB );
    }
    public void describe(int sideA){
        System.out.println(" Side a is"+ sideA );

    }
    public void describe(double sideA ){
        System.out.println(" Side a is"+ sideA);
    }
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void describe (){
        System.out.println("this is a shape");
    }


}
