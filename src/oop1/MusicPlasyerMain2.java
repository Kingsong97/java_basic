package oop1;

public class MusicPlasyerMain2 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        int volume = 0;
        boolean isOn = false;

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);
        off(data);

    }

    static void on(MusicPlayerData data){
        data.isOn = true;
        System.out.println("플레이어 재생");
    }

    static void off(MusicPlayerData data){
        // 음악 플레이어 끄기
        data.isOn = false;
        System.out.println("음악 플레이어 종료");
    }

    static void volumeUp(MusicPlayerData data){
        data.volume++;
        System.out.println("음악 플레이어 불륨:" + data.volume);
    }
    static void volumeDown(MusicPlayerData data){
        data.volume--;
        System.out.println("음악 플레이어 불륨:" + data.volume);
    }

    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn){
            System.out.println("음악 플레이어 ON, 음량:" + data.volume);
        } else {
            System.out.println("OFF");
        }
    }
}
