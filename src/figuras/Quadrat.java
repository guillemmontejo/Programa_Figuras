package figuras;

public class Quadrat extends Rectangle {

    public Quadrat (double l){
        super(l,l); //Cridem al constructor del rectangle
    }

    @Override
    public String toString(){
        return "Quadrat l: " + this.getL1() + " area: {("+super.area()+")}";
    }
}
