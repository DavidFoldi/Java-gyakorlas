package Emberek;

class Main {
    public static void main(String[] args) {
        Ember elso = new Ember();
        elso.setNev("Zoltán");
        elso.setKor(25);
        elso.setNem("Férfi");
        elso.kiVagyokEn();

        Ember masodik = new Ember();
        masodik.setNev("Éva");
        masodik.setKor(19);
        masodik.setNem("Nő");
        masodik.kiVagyokEn();
      
        Ember harmadik = new Ember();
        masodik.setNev("Árpi");
        masodik.setKor(30);
        masodik.setNem("Férfi");
        masodik.kiVagyokEn();
    }
}
