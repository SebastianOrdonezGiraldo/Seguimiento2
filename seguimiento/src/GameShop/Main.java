package GameShop;

public class Main {
    public static void main(String[] args) {
        for (VideoGame juego : VideoGame.values()){
            System.out.println("Nombre del juego: " + juego.getGameName());
            System.out.println("Instrucciones: " + juego.getGameDescription());
            System.out.println("Año de creación: " + juego.getYear());
            juego.showRanking();
            juego.buyCoins();
            System.out.println();
        }
    }
}
