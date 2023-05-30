package P17_carpetCostCalculator;

public class Floor {
    double width,length;

    public Floor(double width, double length){


        if(width < 0){
            this.width = 0;
        } else {
            this.width= width;
        }
        if(length < 0){
            this.length = 0;
        } else {
            this.length= length;
        }

    }
    public double getArea(){
        double area = width * length;
        return area;
    }








}
