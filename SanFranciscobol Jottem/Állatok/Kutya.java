package Allatok;


public class Kutya extends Allat implements Haziallat {
    @Override
    public void hang(){
        System.out.println("VAU");
    }
  
    public Kutya(String nev, int suly){
      this.setNev(nev);
      this.setSuly(suly);
    }
  
    @Override
    public void oleles(){
        System.out.println("Ölelés");
    }
  
    @Override
    public void halas(){
        System.out.println("Hálás");
    }
  
    @Override
    public void ules(){
      
    } 
}
