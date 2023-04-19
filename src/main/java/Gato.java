public class Gato {
    String nombre;
    String color;

    public Gato(String nombre, String color){
        this.nombre = nombre;
        this.color = color;

    }

    public void maullar(){
        System.out.println(nombre +" maullo");
    }

    public void cualidades(){
        System.out.println("el gato se llama "+nombre+", y su color es "+color);

    }
}
