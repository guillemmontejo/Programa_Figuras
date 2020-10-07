package figuras;

public class Cercle extends Figura {
    //Cercle hereta Figura
    private double r;

    public Cercle (double r){
        this.r = r;
    }

    //El metode de area que implementa el metode de la clase abstracta figura.
    public double area() {
        return Math.PI * Math.pow(this.r, 2);
    }

    //Re-implementem un metode que existeix a la clase objecte.
    @Override
    public String toString(){
        return "Cercle r:" + this.r + " area: ({"+this.area()+"})";
    }
}
