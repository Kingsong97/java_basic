package oop1;

public class MusicPlasyerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("플레이어 재생");

        // 불륨증가
        volume++;
        System.out.println("음악 플레이어 불륨:" + volume);
        // 불륨증가
        volume++;
        System.out.println("음악 플레이어 불륨:" + volume);
        // 불륨감소
        volume--;
        System.out.println("음악 플레이어 불륨:" + volume);
        //플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if (isOn){
            System.out.println("음악 플레이어 ON, 음량:" + volume);
        } else {
            System.out.println("OFF");
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어 종료");
    }
}
