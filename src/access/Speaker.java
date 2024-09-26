package access;

public class Speaker {
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    void volumUp() {
        if (volume >= 100){
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10;
            System.out.println("음량을 10 증가");
        }
    }

    void volumDown(){
        volume -= 10;
        System.out.println("volumDown 호ㅜㄹ");
    }

    void showVolum(){
        volume = volume;
        System.out.println("현 음량 : " + volume);
    }
}
