package paqAnimales;

public class Gato extends Mamifero {

    private int pelos;
            
       // Constructor que pasa el nombre a la clase padre (Mamifero)
    public Gato(String nombre) {
        super(nombre);
    }
      
    
   
    @Override
    void dormir() {
        System.out.println("El gato se pasa todo el día durmiendo");
    }

    void maullar() {
        System.out.println("Es lo que hacen los gatos");
    }
    
    public int getPelos(){
        return pelos;
    }
    
    public void setPelos(int pelos){
        this.pelos = pelos;
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el gato: " + p.getNombre());
    }

}
