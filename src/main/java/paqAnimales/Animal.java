package paqAnimales;

/*Esta clase representa a un animal genérico*/
/* esta es la clase base de otros tipos de animales, de la que heredan*/
public class Animal {

    private String nombre;
    
     // Constructor de la clase animal. Establece el nombre del animal.
    public Animal(String nombre) {
        this.nombre = nombre;
    }

    /*Método que simula el acto de comer. Muestra un mensaje 
    indicando que el animal necesita comer*/ 
    
    void comer() {
        System.out.println("Necesita comer diarimente para sobrevivir");
    }

       /*Método que simula el acto de dormir. Muestra un mensaje 
    indicando que dormir es indispensable*/ 
    void dormir() {
        System.out.println("Dormir es indispensable para descansar");
    }

       /*Método que simula el acto de reproducirse. Muestra un mensaje 
    indicando que el animal origina nuevos seres vivos*/ 
    void reproducir() {
        System.out.println("Originar nuevos seres vivos");
    }

       /*Método que simula la relación entre los animales.*/ 
    void relacionar(Animal a) {
        System.out.println("Con el animal: " + a.nombre);
    }
    // obtiene el nombre del animal.
    
    public String getNombre(){
        return nombre;
    }
    
    //establece el nombre del animal.
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
   // Representación String de un objeto de tipo Animal. Devuelve el nombre del animal.
    @Override
    public String toString(){
        return "Animal [nombre=" + nombre + "]";
    }
}
