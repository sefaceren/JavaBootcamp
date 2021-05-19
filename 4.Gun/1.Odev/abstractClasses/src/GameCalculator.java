public abstract class GameCalculator {

    //override etmek zorunda.
    public abstract void hesapla();
    // değiştirilemez kullanılmak zorunda.
    public final void gameOver(){
        System.out.print("Oyun Bitti");
    }

}
