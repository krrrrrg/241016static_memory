package static1;

public class DataCountMain1 {

    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println(data1.count);

        Data1 data2 = new Data1("B");
        System.out.println(data1.count);

        Data1 data3 = new Data1("C");
        System.out.println(data1.count);
//새로운 인스턴스가 계속 생성되므로 카운트 값은 0으로 시작합니다.

    }
}
