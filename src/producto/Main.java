package producto;

public class Main {
    public static void main(String[] args) {
        Producto array[] = Producto.values();
        for (Producto pro : array){
            System.out.println(pro + "descripcion" + pro.getDescripcion());;
        };
    }
}
