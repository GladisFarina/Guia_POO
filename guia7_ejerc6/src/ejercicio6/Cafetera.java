
package ejercicio6;


public class Cafetera {
    private int capacidadMax;
    private int cantActual;

    
    public void Cafetera(){
        
    }
    public void Cafetera(int cantActual,int capacidadMax){
        this.capacidadMax=capacidadMax;
        this.cantActual=cantActual;
            
        }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }

    public int getCantActual() {
        return cantActual;
    }

    public void setCantActual(int cantActual) {
        this.cantActual = cantActual;
    }
    
    public void llenarCafetera(){
        this.cantActual=this.capacidadMax;
        
    }
    public void servirTaza(int servirTaza){
        
        if (servirTaza>this.cantActual){
            servirTaza=this.cantActual;
            System.out.println("la taza solo se cargo con "+servirTaza);
            this.cantActual=0;
        }else 
            this.cantActual-=servirTaza;
            System.out.println("la taza se lleno correctamente con "+servirTaza);
    
    }  
     public void vaciarCafetera(){
         System.out.println("la cafetera se vació");
         this.cantActual=0;
     }   
    public void agregarCafe(int agregar){
        if (agregar+this.cantActual>this.capacidadMax){
            System.out.println("la cafetera se lleno y sobro "+(agregar+this.cantActual-this.capacidadMax));
            this.cantActual=this.capacidadMax;
        }else
            this.cantActual+=agregar;
        System.out.println("se agrego cafe y en la cafetera hay "+this.cantActual);
        
    }
    
}
