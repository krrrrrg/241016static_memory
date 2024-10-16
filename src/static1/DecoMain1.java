package static1;

public class DecoMain1 {

    public static void main(String[] args) {
        String s = "hello";
        DecoUtil1 util1 = new DecoUtil1();
        String deco = util1.deco(s);
        //*hello*

        System.out.println(s); //hello
        System.out.println(deco);

    }



}
