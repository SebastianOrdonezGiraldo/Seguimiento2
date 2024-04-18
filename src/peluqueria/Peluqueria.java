package peluqueria;

public enum Peluqueria {
    CORTE("el 7","Meloso",15000) {
        @Override
        public void showDescripcion() {

        }
    },
    UÑAS("Semi","Agrilico",40000) {
        @Override
        public void showDescripcion() {

        }
    },
    TINTE("Plateado","Tinte semipermanente",50000) {
        @Override
        public void showDescripcion() {

        }
    };

    private String name;
    private String descripcion;
    private int price;

    Peluqueria(String name, String descripcion, int price) {
        this.name = name;
        this.descripcion = descripcion;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getPrice() {
        return price;
    }

    public abstract void showDescripcion();

    @Override
    public String toString() {
        return "Peluqueria" +
                "name'" + name + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", price=" + price;
    }
}
