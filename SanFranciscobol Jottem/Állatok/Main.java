package Allatok;


class Main {
  public static void main(String[] args) {
    
    Macska cicus = new Macska("Cirmi", 3);
    Kutya bloki = new Kutya("Buksi", 18);
    
    System.out.println(cicus.getNev()+" " + cicus.getSuly() + "kg");
    System.out.println(bloki.getNev()+" " + bloki.getSuly() + "kg");
  }
}
