/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author titou
 */

public class Point {
    private double px;
    private double py;
    
    public Point(double px, double py){
        this.px = px;
        this.py = py;
    }
    
    public Point(){
        this.px = 0;
        this.py = 0;
    }
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }

    
    public String toStringPoint() {
        String res;
        res = "(" + px + "," + py + ")";
        return res;
    }
    public static Point demandePoint() {
        System.out.println("abscisse : ");
        double px = Lire.d();
        System.out.println("ordonnée : ");
        double py = Lire.d();
        return new Point(px, py);
    }
    
    public static void main(String[] args) {
      demandePoint();
    }
    
    
}
