package Allatok;


public class Macska extends Allat implements Haziallat {
    @Override
    public void hang(){
        System.out.println("MEOW");
    }
  
    public Macska(String nev, int suly){
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
        System.out.println("Ülés");
    }
}
