import java.util.Scanner;

public class Lab603 {

    // Method 1: คืนค่า array (ตรงรูปตัวอย่าง)
    public static int[] random_array() {
        int[] numbers = {13, 11, 11, 4, 16, 17, 1, 14, 1, 0};
        return numbers;
    }

    // Method 2: นับจำนวนครั้งที่เลขปรากฏ
    public static int count_element(int[] numbers, int element) {
        int count = 0;
        for (int n : numbers) {
            if (n == element) {
                count++;
            }
        }
        return count;
    }

    // Method 3: แสดงตัวเลขทั้งหมดใน array
    public static void display_array(int[] numbers) {
        System.out.print("Here are the elements in the array: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = random_array();

        System.out.print("Enter your guess (0-20): ");
        int guess = sc.nextInt();

        int count = count_element(numbers, guess);

        System.out.println();

        // กรณีที่ 1: พบ 1 ครั้ง
        if (count == 1) {
            System.out.println(
                    "Congratulations!! " + guess + " is an element in the array!!"
            );
        }
        // กรณีที่ 2: พบมากกว่า 1 ครั้ง
        else if (count > 1) {
            System.out.println(
                    "Congratulations!! " + guess + " is an element in the array!!"
            );
            System.out.println(
                    "Fantastic!! It also appears more than once!!"
            );
        }
        // กรณีที่ 3: ไม่พบ
        else {
            System.out.println("Sorry, try again next time...");
            display_array(numbers);
        }
    }
}
