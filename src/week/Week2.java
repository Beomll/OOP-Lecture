package week;

import java.util.Scanner;

// public class Week2 {
//     public static void main(String[] args){
//         byte small = 10;
//         int big = 100000;

//         int result = big - small;
//         System.out.println(result);
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
//         byte a = 32;
//         short b = a;

//         System.out.println(b);

//         int c = b;
//         float d = c;

//         System.out.println(d);
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
//         int a = 1234;
//         float b = a;

//         float c = 3.14f;
//         int d = c;

//         System.out.println(d);
//     }
// }


// 캐스팅 형 변환
// public class Week2 {
//     public static void main(String[] args){
//         float a = 12.0f;
//         int b = (int) a;

//         System.out.println(a);
//         System.out.println(b);

//         float c = 1234.5678f;
//         int d = (int) c;

//         System.out.println(c);
//         System.out.println(d);
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
//         int a = 10;
//         float b = 3.0f;

//         System.out.println(a/b);
//         System.out.println(a/(int)b);
//         System.out.println((int)(a/b));
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
//         int a = 100;
//         short b = (byte) a;

//         System.out.println(a);
//         System.out.println(b);

//         int c = 1000;
//         short d = (byte) c;

//         System.out.println(c);
//         System.out.println(d);
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("나이를 입력하시오.");

//         int age = input.nextInt();

//         System.out.println(age);

//         input.close();
//     }
// }



// public class Week2 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("원의 반지름의 크기를 입력하시오.");

//         float r = input.nextFloat();

//         System.out.println("원의 반지름은 " + r + "입니다.");
//         System.out.println("원의 둘레는" + 2*3.14*r + "입니다.");

//         input.close();
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         String hi = input.next();

//         System.out.println(hi);

//         input.close();
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         System.out.println("이름을 입력하시오.");

//         String name = input.nextLine();

//         System.out.println("입력하신 사용자는" + name + "입니다.");

//         input.close();
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         int age = input.nextInt();
//         String name = input.nextLine();

//         System.out.println("나이:\t" + age);
//         System.out.println("이름:\t" + name);


//         input.close();
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
//         Scanner input = new Scanner(System.in);
        
//         int age = input.nextInt();
//         String name = input.nextLine();

//         System.out.println("나이:\t" + age);
//         System.out.println("이름:\t" + name);


//         input.close();
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
        
//         String sign = "green";

//         if (sign =="green"){
//             System.out.println("신호등이 파란색입니다.");
//             System.out.println("횡단보도를 건너십시오.");
//         }

//         System.out.println("이 문장은 If문 외부에 있습니다.");
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
        
//         Scanner input = new Scanner(System.in);

//         System.out.println("10 이상의 정수를 입력하시오");
//         int num = input.nextInt();

//         if (num < 10){
//             System.out.println("10보다 작은 숫자를 입력하였습니다.");
//         }

//         System.out.println("입력한 숫자는" + num + "입니다.");

//         input.close();
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
        
//         String sign = "green";

//         if (sign == "green"){
//             System.out.println("신호등이 파란색입니다.");
//             System.out.println("횡단보도를 건너십시오.");
//         }
//         else {
//             System.out.println("신호등이 빨간색입니다.");
//             System.out.println("횡단보도 앞에 멈추십시오.");
//         }
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
        
//         Scanner input = new Scanner(System.in);

//         System.out.println("10 이상의 정수를 입력하십시오.");
//         int num = input.nextInt();

//         if (num >= 10){
//             System.out.println("입력한 숫자는" + num + "입니다.");
//         }
//         else {
//             System.out.println("10보다 작은 숫자를 입력하였습니다.");
//         }
//         input.close();
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
        
//         Scanner input = new Scanner(System.in);

//         System.out.println("정수를 입력하십시오.");
//         int num = input.nextInt();

//         if (num % 2 == 0){
//             System.out.println("입력한 숫자는 짝수입니다.");
//         }
//         else {
//             System.out.println("입력한 숫자는 홀수입니다.");
//         }
//         input.close();
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
        
//         int num = 20;

//         if (num == 10){
//             System.out.println("숫자가 10입니다.");
//         }
//         else if (num == 15){

//             System.out.println("숫자가 15입니다.");
//         }
//         else if (num == 20){
//             System.out.println("숫자가 20입니다.");
//         }
//     }
// }

// public class Week2 {
//     public static void main(String[] args){
        
//         Scanner input = new Scanner(System.in);

//         System.out.println("점수를 입력하세요.");
//         int score = input.nextInt();

//         if (score >= 90){
//             System.out.println("A 학점");
//         }
//         else if (score < 90){
//             if (score >= 80){
//                 System.out.println("B학점");
//             }
//             else{
//                 System.out.println("C학점");
//             }
//         }
//         input.close();
//     }
// }


// public class Week2 {
//     public static void main(String[] args){
        
//         Scanner input = new Scanner(System.in);

//         System.out.println("3개의 점수를 입력하세요.");
//         int x = input.nextInt();
//         int y = input.nextInt();
//         int z = input.nextInt();

//         if (x > y){
//             if (x > z){
//                 System.out.println(x + "는 가장 큰 정수입니다.");
//             }
//             else {
//                 System.out.println(x + "는 가장 큰 정수가 아닙니다.");
//             }
//         }
//         else {
//             System.out.println(x + "는 가장 큰 정수가 아닙니다.");
//         }
//     input.close();
//     }
// }

public class Week2{
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

        System.out.println("1. 고객 정보 확인 \t 2. 장바구니 항목 추가");
        System.out.println("3. 장바구니 항목 확인 \t 4. 장바구니 항목 수량 감소");
        System.out.println("5. 장바구니 비우기 \t 6. 장바구니 항목 삭제");
        System.out.println("7. 결제 영수증 출력 \t 8. 종료");
        System.out.println("=".repeat(50));

        System.out.print("메뉴 번호를 선택하십시오 : ");
        int menuNum = input.nextInt();

        if (menuNum < 1 || menuNum > 8){
            System.out.println("1부터 8까지 숫자를 입력하십시오.");
        }
        switch (menuNum) {
            case 1:
                System.out.println("현재 고객 정보");
                System.out.println("이름: " + userName);
                System.out.println("연락처: " + userMobile);
                break;
            case 2:
                System.out.println("장바구니 항목 추가");
                break;
            
            case 3:
                System.out.println("장바구니 항목확인");
                break;

            case 4:
                System.out.println("장바구니 항목확인");
                break;
            
            case 5:
                System.out.println("장바구니 항목확인");
                break;

            case 6:
                System.out.println("장바구니 항목확인");
                break;

            case 7:
                System.out.println("장바구니 항목확인");
                break;

            case 8:
                System.out.println("장바구니 항목확인");
                break;
        }
        input.close();
    
    }
}