package Emberek;

public class Ember {
    //Az ember neve
    private String nev;
    //Az ember kora
    private int kor;
    //Az ember neme
    private String nem;
    
    /** Ez a metódus kiírja az ember tulajdonságait */
    public void kiVagyokEn(){
        System.out.println("Az én nevem " + nev + "!");
        System.out.println(kor + " éves vagyok!");
    }

    public String getNev(){
        return this.nev;
    }

    public void setNev(String nev){
        this.nev = nev;
    }
  
    public int getKor(){
        return this.kor;
    }
  
    public void setKor(int kor){
        this.kor = kor;
    }
  
    public String getNem(){
        return this.nem;
    }

    public void setNem(String nem){
        this.nem = nem;
    }
}