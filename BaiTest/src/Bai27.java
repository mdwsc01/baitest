import java.util.Scanner;

public class Bai27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập dãy số cách nhau bởi dấu cách(VD: 3 8 5 10 -2): ");
        String input = scanner.nextLine();
        String result = demChanVaMax(input);
        System.out.print("Kết quả(Số lượng chẵn và số lớn nhất): [" + result + "]");
        scanner.close();
    }

    public static String demChanVaMax(String s) {
        if(s == null || s.trim().isEmpty()){
            return "";
        }

        String[] tokens = s.trim().split("\\s+");
        int count = 0;
        int max = Integer.MIN_VALUE;
        boolean hasEven = false;

        for(String token : tokens){
            if(!token.isEmpty()){
                int num = Integer.parseInt(token);
                if(num%2==0){
                    count++;
                    if(!hasEven|| num>max){
                        max = num;
                        hasEven = true;
                    }
                }
            }
        }
        if(!hasEven){
            return "";
        }
        return count + " " + max;
    }
}
