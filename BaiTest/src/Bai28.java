import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập email cần kiểm tra(VD: an.nguyen@rikkei.edu.vn): ");
        String input = scanner.nextLine();
        String result = kiemTraEmail(input);
        System.out.print("Kết quả: " + result);
        scanner.close();
    }

    public static String kiemTraEmail(String s) {
        if(s == null){
            return "KHONG HOP LE";
        }

        s = s.trim();

        int atIndex = s.indexOf("@");
        int lastIndex = s.lastIndexOf("@");
        if(atIndex == -1 || atIndex != lastIndex ||s.contains(" ")){
            return "KHONG HOP LE";
        }

        String pre = s.substring(0, atIndex);
        String post = s.substring(atIndex + 1);

        if(pre.isEmpty()) {
            return "KHONG HOP LE";
        }

        if(!post.contains(".") || post.startsWith(".") || pre.endsWith(".") || post.contains("..")){
            return "KHONG HOP LE";
        }

        return "HOP LE";
    }
}
