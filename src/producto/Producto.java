package producto;

import Vestuario.Vestuario;

public enum Producto {
    LAPIZ("Mirado 3","Es muy bueno") {
        @Override
        public void showUse() {

        }
    },
    CUADERNO("Marvel","100 HOJAS") {
        @Override
        public void showUse() {
            this.getDescripcion();
        }
    },
    BORRADOR("Norma","Blanco") {
        @Override
        public void showUse() {
            this.getDescripcion();

        }
    },
    SACAPUNTAS("arle","Muy efectivo") {
        @Override
        public void showUse() {
            this.getDescripcion();
        }
    },
    CARTUCHERA("grande","Perfecta para el colegio") {
        @Override
        public void showUse() {

        }
    };

    private String name;
    private String descripcion;

    Producto(String name, String descripcion) {
        this.name = name;
        this.descripcion = descripcion;
    }

    Producto() {

    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public abstract void showUse();
}
