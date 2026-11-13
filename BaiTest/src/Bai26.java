import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập danh sách điểm(VD: SV01:7.5,SV02:4,SV03:9,SV04:7.5): ");
        String input = scanner.nextLine();
        String result = danhSachDat(input);
        System.out.print("Kết quả: " + result);
        scanner.close();
    }

    public static class Student{
        String id;
        double score;
        public Student(String id, double score) {
            this.id = id;
            this.score = score;
        }
    }

    public static String danhSachDat(String s) {
        if(s == null || s.trim().isEmpty()){
            return "KHONG CO";
        }

        String[] parts = s.split(",");

        List<Student> list =  new ArrayList<>();

        for(String p : parts){
            String[] kv = p.split(":");
            if(kv.length == 2){
                String id = kv[0].trim();
                double score = Double.parseDouble(kv[1].trim());

                if(score >= 5.0){
                    list.add(new Student(id,score));
                }
            }
        }

        if(list.isEmpty()){
            return "KHONG CO";
        }

        list.sort((a,b) ->{
            if(Double.compare(a.score,b.score) != 0){
                return Double.compare(b.score,a.score);
            }
            return a.id.compareTo(b.id);
        });

        StringBuilder sb = new StringBuilder();
        for(Student st : list){
            sb.append(st.id).append(" ");
        }
        return sb.toString().trim();
    }
}
