package week;

import java.util.Scanner;

// public class Week3 {
//     public static void main(String[] args){
//         int i;
//         for (i = 1; i <= 10; i++){
//             System.out.println(i + "번째 출력");
//         }
// }
    
// }


// public class Week3 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);

//         int sum = 0;
//         System.out.println("5개의 정수를 입력하시오.");

//         for (int i = 0; i < 5; i ++){
//             int num = input.nextInt();
//             sum += num;
//         }
//         System.out.println("합계:" + sum);
//         }
// }
    



// public class Week3 {
//     public static void main(String[] args){
//         int i = 1;

//         while (i <= 10) {
//             System.out.println(i);
//             i++;
            
//         }
//         }
// }


// public class Week3 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         while (true) {
//             System.out.println("정수입력");
//             int num = input.nextInt();

//             if (num%2 == 0){
//                 System.out.println("짝수");
//             }
//             else{
//                 System.out.println("홀수");
//             }
            
//         }
//     }
// }


// public class Week3 {
//     public static void main(String[] args){
//         int choice = 0;
//         Scanner input = new Scanner(System.in);
        
//         while (choice == 0) {
//             System.out.println("정수입력");
//             int num = input.nextInt();
            
//             if (num%2 == 0){
//                 System.out.println("짝");
//             }
//             else {
//                 System.out.println("홀");
//             }
//             System.out.println("계속: 0 / 종료 : 1");
//             choice = input.nextInt();
//         }
//         input.close();
//     }
// }


// public class Week3 {
//     public static void main(String[] args){
//         int i = 1;

//         do {
//             System.out.println("hello");
//             i++;
//         } while (i < 6);
//     }
// }


// public class Week3 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("1보다 큰 숫자");
//         int x = input.nextInt();
//         int sum = 0;

//         do {
//             sum += x;
//             x--;
//         } while (x >= 1);
//         System.out.println("합계" + sum);
//         input.close();
//     }
// }



// public class Week3 {
//     public static void main(String[] args){
//         for (int i=1; i<10; i++){
//             System.out.println("구구단" + i + "단");

//             for (int j=1; j<10; j++){
//                 System.out.println(i+" * "+j+" = "+(i*j));
//             }
//         }
//     }
// }



// public class Week3 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);

//         System.out.println("높이");
//         int height = input.nextInt();

//         for (int i = 0; i < height; i++) {
//             for (int j = 0; j<height-i-1; j++){
//                 System.out.print(" ");
//             }
//             for (int j=0; j<2*i+1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         input.close();
//     }
// }








// public class Week3 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);

//         System.out.println("높이 입력.: ");
//         int height = input.nextInt();

//         for (int i = 0; i < height; i ++){
//             for (int j = 0; j < i; j++){
//                 System.out.print(" ");
//             }
//             for (int j = 0; j<(2*height)-(2*i)-1; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//         input.close();

// }
    
// }



// public class Week3 {
//     public static void main(String[] args){
//         for (int i = 0; i < 5; i++){
//             if (i == 3){
//                 break;
//             }
//             System.out.println(i);
//         }
//     }
    
// }


// public class Week3 {
//     public static void main(String[] args){
//         for (int i=0; i < 5; i++){
//             System.out.println(i);
//             if (i==3){
//                 break;
//             }
//         }
//     }
// }

// public class Week3 {
//     public static void main(String[] args){
//         for (int i=1; i < 5; i++){
//             for (int j = 1; j <= 5; j++){
//                 if (i%2 == 1){
//                     continue;
//                 }
//                 System.out.println(i + "*" + j + "=" + i*j);
//             }
//         }

//     }
// }




// public class Week3 {
//     public static void method() {
//         System.out.print("5 + 6 = ");
//         System.out.print(5 + 6);
//     }
//     public static void main(String[] args){
//         method();
//     }
// }


// public class Week3 {
//     public static String method() {
//         return "HI!";
//     }
//     public static void main(String[] args){
//         String str = method();
//         System.out.println(str + "JAVA!");
//     }
// }


// public class Week3 {
//     public static int method() {
//         int a = 10, b = 5;
//         int result = a / b;

//         return result;
//     }
//     public static void main(String[] args){
//         int num = method();
//         System.out.println(num);
//     }
// }


// public class Week3 {
//     public static int method(int x, int y) {
//         return x + y;
//     }
//     public static void main(String[] args){
//         int num = method(5, 6);
//         System.out.println(num);
//     }
// }



// public class Week3 {
//     public static int method(int x, int y) {
//         int result;
//         if (x > y){ result = x; }
//         else { result = y;}
        
//         return result;
//     }
//     public static void main(String[] args){
//         int num = method(11, 22);
//         System.out.println(num);
//     }
// }


// public class Week3 {
//     public static void method() {
//         System.out.println("Hi JAVA");
//     }
//     public static void main(String[] args){
//         method();
//     }
// }



// public class Week3 {
//     public static void method() {
//         int sum = 0;
//         for (int i = 1; i<=10; i++){
//             sum += i;
//         }
//         System.out.println(sum);
//     }
//     public static void main(String[] args){
//         System.out.println("합");
//         method();
//     }
// }


// public class Week3 {
//     public static void method(int x, int y) {
//         int sum = x + y;
//         System.out.println(x+"와" + y + "의합:" + sum);
//     }
//     public static void main(String[] args){
//         method(10, 15);
//     }
// }


// public class Week3 {
//     public static void method(int x, double y) {
//         System.out.println(2*x*y);
//     }
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
//         System.out.print("원의 반지름");
//         int r = input.nextInt();
//         double pi = 3.14159265353979323846264338;

//         method(r, pi);
//         input.close();
//     }
// }









public class Week3{

    public static void menuIntroduction() {
        System.out.println("=".repeat(50));
        System.out.println("1. 고객 정보 확인 \t 2. 장바구니 항목 추가");
        System.out.println("3. 장바구니 항목 확인 \t 4. 장바구니 항목 수량 감소");
        System.out.println("5. 장바구니 비우기 \t 6. 장바구니 항목 삭제");
        System.out.println("7. 결제 영수증 출력 \t 8. 종료");
        System.out.println("=".repeat(50));
    }
    
    public static void menuGuestInfo(String userName, String userMobile){
        System.out.println("현재 고객 정보");
        System.out.println("이름: " + userName + '\t' + "연락처: " + userMobile);
    }

    public static void menuCartItem(){
        System.out.println("장바구니 항목 추가");
    }

    public static void menuCartItemList(){
        System.out.println("장바구니 항목 확인");
    }

    public static void menuCartRemoveItemCount(){
        System.out.println("장바구니 항목 수량 감소");
    }

    public static void menuCartClear(){
        System.out.println("장바구니 비우기");
    }

    public static void menuCartRemoveItem(){
        System.out.println("장바구니 항목 삭제");
    }

    public static void menuCartBill(){
        System.out.println("결제 영수증 출력");
    }

    public static void menuExit(){
        System.out.println("종료");
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("사용자의 이름을 입력하십시오 : ");
        String userName = input.nextLine();
        System.out.print("연락처를 '-'를 제외하고 입력하십시오 : ");
        String userMobile = input.nextLine();

        String greeting = "Welcome to Shopping Mall";
        String tagline = "Welcome to Book Market";

        System.out.println("=".repeat(50));
        System.out.println("\t" + greeting);
        System.out.println("\t" + tagline);
        System.out.println("=".repeat(50));
        
        boolean quit = true;
        while(quit){
            menuIntroduction();
            System.out.println("메뉴 번호를 선택하십시오 : ");
            int menuNum = input.nextInt();

            if (menuNum < 1 || menuNum > 8){
                System.out.println("1부터 8까지의 숫자를 입력하십시오.");
            }
            else{
                switch (menuNum) {
                    case 1:
                        menuGuestInfo(userName, userMobile);
                        break;
                    case 2:
                        menuCartItem();
                        break;
                    
                    case 3:
                        menuCartItemList();
                        break;

                    case 4:
                        menuCartRemoveItemCount();
                        break;
                    
                    case 5:
                        menuCartClear();
                        break;

                    case 6:
                        menuCartRemoveItem();
                        break;

                    case 7:
                        menuCartBill();
                        break;

                    case 8:
                        menuExit();
                        quit = false;
                        break;
                
                }
            }
        }
    }  
}