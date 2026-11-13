import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào họ tên cần chuẩn hóa:");
        String input = scanner.nextLine();
        String result = chuanHoaTen(input);
        System.out.println("Kết quả sau chuẩn hóa: [" + result + "]");
        scanner.close();
    }

    public static String chuanHoaTen(String s) {
        if (s == null || s.trim().isEmpty()) {
            return "";
        }

        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();

        for (String w : words) {
            if (!w.isEmpty()) {
                sb.append(Character.toUpperCase(w.charAt(0)))
                        .append(w.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return sb.toString().trim();
    }
}
