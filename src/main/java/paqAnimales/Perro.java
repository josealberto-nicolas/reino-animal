package paqAnimales;

public class Perro extends Mamifero {

    @Override
    void dormir() {
        System.out.println("El perro debe dormir en funcion del ejericio que realiza");
    }

    void ladrar() {
        System.out.println("Es una labor social de guarda");
    }

    void gruñir() {
        System.out.println("Es un sonido ronco y sostenido");
    }

    @Override
    void relacionar(Animal p) {
        System.out.println("Con el perro: " + p.nombre);
    }

    String ToString() {
        return this.nombre;
    }

}
