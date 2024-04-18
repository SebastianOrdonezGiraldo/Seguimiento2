package Trasporte;

public enum Transporte {
    BUS(50, "Diesel") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("El bus es un medio de transporte terrestre de capacidad media, generalmente utilizado para el transporte público.");
        }
    },
    TREN(500, "Eléctrico") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("El tren es un medio de transporte terrestre de alta capacidad, generalmente utilizado para viajes de larga distancia.");
        }
    },
    BARCO(2000, "Diésel") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("El barco es un medio de transporte marítimo de alta capacidad, utilizado para el transporte de carga y pasajeros.");
        }
    },
    MOTO(2, "Gasolina") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("La moto es un medio de transporte terrestre de baja capacidad, utilizada generalmente para el transporte individual.");
        }
    },
    AVION(300, "Turbina") {
        @Override
        public void mostrarDescripcion() {
            System.out.println("El avión es un medio de transporte aéreo de alta capacidad, utilizado para viajes de larga distancia.");
        }
    };

    private int capacidad;
    private String tipoMotor;

    Transporte(int capacidad, String tipoMotor) {
        this.capacidad = capacidad;
        this.tipoMotor = tipoMotor;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public abstract void mostrarDescripcion();


}

