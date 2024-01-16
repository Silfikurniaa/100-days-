package pkg100.days;

public class day100 {

    public static void main(String[] args) {
        System.out.println("Night Changes");
        System.out.println("_______________");
        String lirik[] = {
            "🎶 movin' too Fast🎶",
            "🎶 Moon is lightin'up her skin🎶",
            "🎶 She's fallin' doesn't🎶",
            "🎶 Even know it yet🎶",
            "🎶 Havin' no regrets is all🎶",
            "🎶 That she really wants🎶"
        };
        for (String baris : lirik) {
            System.out.println(baris);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
