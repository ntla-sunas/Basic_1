import java.util.Arrays;

public class Array_Example {
    public static void main(String[] args) {
        // 1. Mảng một chiều - khai báo và khởi tạo
        int[] myArr1 = new int[5];
        myArr1[0] = 1;
        int[] myArr2 = {1, 2, 3, 9, 10};
        int[] myArr3 = new int[]{1, 2, 3, 9, 10};

        System.out.println("Giá trị phần tử thứ 4 của myArr3 là: " + myArr3[3]);
        System.out.println();

        // 2. Duyệt mảng với for
        System.out.println("Duyệt bằng for thường: ");
        for (int i = 0; i < myArr2.length; i++) {
            System.out.println("myArr2[" + i + "] = " + myArr2[i]);
        }
        System.out.println();

        // 3. Duyệt mảng với for - each
        double[] myList = {1.9, 2.9, 3.9, 4.5};
        System.out.println("Duyệt mảng bằng for - each: ");
        for (double value : myList) {
            System.out.println(value);
        }
        System.out.println();

        // 4. Tính tổng phần tử
        double total = 0;
        for (double v : myList) {
            total += v;
        }
        System.out.println();

        // 5. Mảng hai chiều
        int[][] my2DArr = {
                {1, 4},
                {4, 7},
                {7, 2},
                {6, 9}
        };

        System.out.println("Mảng 2 chiều: ");
        for (int i = 0; i < my2DArr.length; i++) {
            for (int j = 0; j < my2DArr[i].length; j++) {
                System.out.println("my2DArr[" + i + "][" + j + "] = " + my2DArr[i][j]);
            }
        }
        System.out.println();

        // 6. Sử dụng lớp Arrays để sao chép và sắp xếp mảng
        double[] grades = {42.5, 28.5, 92.9, 34.55, 23.6, 75.7};

        // Cách sai: gán tham chiếu
        //double[] percentagesWrong = grades;
        //percentagesWrong[2] = 70;
        //System.out.println("grades[3] sau khi sửa trực tiếp: " + grades[2]);

        // Cách đúng: sao chép mảng
        double[] percentages = Arrays.copyOf(grades, grades.length);
        percentages[2] = 60.0;
        System.out.println("grade[3] không bị ảnh hưởng: " + grades[2]);

        // Sắp xếp mảng
        Arrays.sort(grades);
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(grades));

        // Lấy 2 phần tử đầu và 2 phần tử cuối
        double[] lowerGrades = Arrays.copyOfRange(grades, 0, 2);
        System.out.println("2 phần tử đầu : " + Arrays.toString(lowerGrades));

        double[] lowestGrades = Arrays.copyOfRange(grades, grades.length - 2, grades.length);
        System.out.println("2 phần tử  cuối : " + Arrays.toString(lowestGrades));
        System.out.println();

        // 7. So sánh mảng
        int[] intA1 = {0, 2, 4, 6};
        int[] intA2 = {0, 2, 4, 6};
        int[] intA3 = {10, 8, 6, 4};

        System.out.println("intA1 == intA2: " + (intA1 == intA2));
        System.out.println("Arrays.equals(intA1, intA2): " + Arrays.equals(intA1, intA2));
        System.out.println("Arrays.equals(intA1, intA3): " + Arrays.equals(intA1, intA3));
    }
}
