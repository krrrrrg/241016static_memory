package static1;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public void instanceCall(){

        staticValue++; //정적 변수 접근
        staticMethod();


        instanceValue++;
        instanceMethod();
    }

    //정적 매서드라서 스태틱만 사용 할 수 있음
    public static void staticCall(){
        staticValue++; //정적 변수 접근
        staticMethod();
    }

    private void instanceMethod(){
        System.out.println(instanceValue);

    }
    //정적 매서드라서 스태틱만 사용 할 수 있음
    private static void staticMethod(){
        System.out.println(staticValue);
    }
}
