package polymorphism;

/**
 * Created by Namsoo on 2017. 10. 28..
 */
public class SamsungTV implements TV {
    public SamsungTV()
    {
        System.out.println("삼성 TV - 객체 생성");
    }

    public void powerOn() {
        System.out.println("삼성 TV - 전원 켠다");
    }

    public void powerOff() {
        System.out.println("삼성 TV - 전원 끈다");
    }

    public void volumeUp() {
        System.out.println("삼성 TV - 소리를 올린다");
    }

    public void volumeDown() {
        System.out.println("삼성 T - 소리를 내린다");
    }
}