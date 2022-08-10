public class Main
{
    public static void main(String[] args) {
        String eredmeny = censor("A kutya nagyon aranyos kutya", "kutya", "macska");
        System.out.println(eredmeny);
    }

    public static String censor(String szoveg, String valtoztatni, String mire){
        if (szoveg.contains(valtoztatni)) {
            szoveg = szoveg.replaceAll(valtoztatni, mire);
        }
        return szoveg;
    }
}
