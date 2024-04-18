package Vestuario;

public enum Vestuario {
    BLUSA("pepas","Color negra",1) {
        @Override
        public void showInfo() {

        }
    },
    JEAN("deniem","cargo",2) {
        @Override
        public void showInfo() {

        }
    },
    CAMISETA("Formal","Botones",3) {
        @Override
        public void showInfo() {

        }
    },
    CAMISA("manga larga","Tipo playa",4) {
        @Override
        public void showInfo() {

        }
    };

    private String name;
    private String descripcion;
    private int numeroEstante;

    Vestuario(java.lang.String name, java.lang.String descripcion, int numeroEstante) {
        this.name = name;
        this.descripcion = descripcion;
        this.numeroEstante = numeroEstante;
    }

    public java.lang.String getName() {
        return name;
    }

    public java.lang.String getDescripcion() {
        return descripcion;
    }

    public int getNumeroEstante() {
        return numeroEstante;
    }

    public abstract void showInfo();


    @Override
    public String toString() {
        return "Vestuario{" +
                "name='" + name + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", numeroEstante=" + numeroEstante +
                '}';
    }
}
