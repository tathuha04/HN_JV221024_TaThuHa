import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    static Array[] arrays = new Array[0];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[100];
        int number = 0;
        int check = scanner.nextInt();

        do {
            System.out.println("***HACKATHON-JAVA-BASIC-1-MENU***");
            System.out.println("1. Nhập số phần tử và giá trị cho các phần tử của mảng từ bàn phím");
            System.out.println("2. In ra giá trị các phần tử trong mảng");
            System.out.println("3. Tính tổng và in ra phần tử có giá trị lẻ trong mảng");
            System.out.println("4. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
            System.out.println("5. Thống kê số lượng phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("6. In ra mảng đảo ngược");
            System.out.println("7. In ra các phần tử và tổng số các phần tử là số nguyên tố trong mảng");
            System.out.println("8. Sắp xếp mảng tăng dần");
            System.out.println("9. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("bạn muốn nhập giá trị cho bao nhiêu phần tử trong mảng?");
                  number = scanner.nextInt();
                    for (int i = 0; i < number; i++) {
                        System.out.print("Phần tử thứ " + (i + 1) + ": ");
                        array[i] = scanner.nextInt();
                    }

                    break;
                case 2:
                    System.out.print("Phần tử của mảng : " );
                    for (int i = 0; i < number; i++) {

                        System.out.print( array[i]);
                    }
                    System.out.println("");
                    break;
                case 3:
                    int sum = 0;
                    System.out.println("số phần tử lẻ: ");
                    for (int i = 1; i < number; i++) {
                        if (number%i!=0){
                            System.out.print(i+",");
                            sum +=i;
                        }
                    }
                    System.out.println("");
                    System.out.println("Tổng các phần tử lẻ trong mảng là: " +sum);
                    break;
                case 4:
                    int max = 0;
                    int min = 0;
                    for (int i = 0; i < array.length; i++) {
                        if (array[i] > max){
                            max = array[i];
                        }
                    }
                    System.out.println("Phần tử lớn nhất trong mảng: "+max);
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]<min){
                            min = array[i];
                        }
                    }
                    System.out.println("Phần tử lớn nhất trong mảng: "+min);
                    break;
                case 5:
                    break;
                case 6:
                    int count = 0;
                    System.out.print("Số chia hết cho cả 2 và 3 trong mảng: ");
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]%2==0 && array[i]%3==0&&array[i]!=0){
                           break;
                        }
                        else {
                            System.out.println("không có phần tử nào ");
                        }
                    } count++;
                    System.out.println(count);
                    break;
                case 7:
                    int countPrime = 0;
                    System.out.print("Các số nguyên tố trong mảng là: ");
                    for (int i = 0; i < array.length; i++) {
                        boolean isPrime = true;
                        if (array[i] < 2) {
                            isPrime = false;
                        }
                        for (int j = 2; j <= Math.sqrt(array[i]); j++) {
                            if (array[i] % j == 0) {
                                isPrime = false;
                                break;
                            }
                        }
                        if (isPrime) {
                            System.out.print(array[i] + " ");
                            countPrime++;
                        }
                    }
                    System.out.println("Số lượng số nguyên tố trong mảng là: " + countPrime);
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        }
        while (check != 9);

    }
}