package GameShop;



public enum VideoGame implements GameShoop{
    DEPORTIVOS("FIFA 23", "Juego de fútbol con controles intuitivos", 2022) {
        @Override
        public void showRanking() {
            System.out.println("Estás en el puesto 10 del ranking mundial de FIFA 23.");
        }

        @Override
        public void buyCoins() {
            System.out.println("Puedes comprar monedas FIFA para mejorar tu equipo y jugadores.");
        }
    },
    ESTRATEGIA("Age of Empires IV", "Construye un imperio y conquista a tus enemigos", 2021) {
        @Override
        public void showRanking() {
            System.out.println("Estás en el puesto 25 del ranking de Age of Empires IV.");
        }

        @Override
        public void buyCoins(){
            System.out.println("Puedes comprar recursos adicionales para avanzar más rápido en el juego.");
        }
    },
    MUSICALES("Just Dance 2023", "Sigue los pasos de baile al ritmo de la música", 2022) {
        @Override
        public void showRanking() {
            System.out.println("Estás en el puesto 5 del ranking de Just Dance 2023 en tu país.");
        }

        @Override
        public void buyCoins() {
            System.out.println("Estás en el puesto 5 del ranking de Just Dance 2023 en tu país.");
        }
    },
    AVENTURA("Horizon Forbidden West", "Explora un vasto mundo abierto y completa misiones", 2022) {
        @Override
        public void showRanking() {
            System.out.println("Estás en el puesto 3 del ranking de jugadores de Horizon Forbidden West.");
        }

        @Override
        public void buyCoins() {
            System.out.println("Puedes comprar objetos y accesorios adicionales para tus Sims.");
        }
    },
    SIMULACION("The Sims 4", "Crea y controla la vida de tus propios Sims", 2014) {
        @Override
        public void showRanking() {
            System.out.println("Estás en el puesto 20 del ranking de constructores de The Sims 4.");
        }

        @Override
        public void buyCoins() {
            System.out.println("Puedes comprar objetos y accesorios adicionales para tus Sims.");

        }
    };

    private String gameName;
    private String gameDescription;
    private int year;



    public String getGameName() {
        return gameName;
    }

    public String getGameDescription() {
        return gameDescription;
    }

    public int getYear() {
        return year;
    }

    VideoGame(String gameName, String gameDescription, int year) {
        this.gameName = gameName;
        this.gameDescription = gameDescription;
        this.year = year;
    }



}
