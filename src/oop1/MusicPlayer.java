package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

     void on(){
        isOn = true;
        System.out.println("플레이어 재생");
    }

     void off(){
        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }

     void volumeUp(){
        volume++;
        System.out.println("음악 플레이어 불륨:" + volume);
    }
     void volumeDown(){
        volume--;
        System.out.println("음악 플레이어 불륨:" + volume);
    }

     void showStatus(){
        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 ON, 음량:" + volume);
        } else {
            System.out.println("OFF");
        }
    }
}
