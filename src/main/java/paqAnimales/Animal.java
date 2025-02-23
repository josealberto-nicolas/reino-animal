package paqAnimales;

public class Animal {

    private String nombre;
    
     // Constructor
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.nombre);
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
   
    @Override
    public String toString(){
        return "Animal [nombre=" + nombre + "]";
    }
}
