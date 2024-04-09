package week;

import java.util.Scanner;

// public class Week4 {
//     public static void main(String[] args){
//         int [] myArr = new int[5];
//         myArr[0] = 0;
//         myArr[1] = 1;
//         myArr[2] = 2;
//         myArr[3] = 3;
//         myArr[4] = 4;

//         for (int i = 0; i < 5; i++){
//             System.out.println(i + "번째 요소 : " + myArr[i]);
//         }
//     }
    
// }


// public class Week4 {
//     public static void main(String[] args){
//         String [] myArr = new String[3];
//        myArr[0] = "Hello";
//        myArr[1] = "JAVA";
//        myArr[2] = "Program";

//         for (int i = 0; i < 3; i++){
//             System.out.println(myArr[i]);
//         }
//     }
    
// }



// public class Week4 {
//     public static void main(String[] args){
//         String [] myArr = new String[3];
       
//         Scanner input = new Scanner(System.in);
//         System.out.println("3개의 문자열을 입력");

//         for (int i = 0; i < 3; i++){
//             myArr[i] = input.nextLine();
//         }

//         for (int i = 0; i < 3; i++){
//             System.out.println(myArr[i]);
//         }
//         input.close();
//     }
    
// }


// public class Week4 {
//     public static void main(String[] args){
//         int[] myArr1 = {1, 2, 3, 4, 5};
//         int[] myArr2 = new int[]{10, 20, 30, 40, 50};

//         for (int i = 0; i<myArr1.length; i++){
//             System.out.println("myArr1[" + i + "]: " + myArr1[i]);
//         }
//         for (int i = 0; i<myArr2.length; i++){
//             System.out.println("myArr2[" + i + "]: " + myArr2[i]);
//         }
//     }
// }



// public class Week4 {
//     public static void main(String[] args){
//         double[] gradeArr = {90, 70.5, 82, 90.2};
//         double sum = 0.0;

//         for (int i = 0; i < gradeArr.length; i++){
//             sum += gradeArr[i];
//         }

//         double average = sum / gradeArr.length;

//         System.out.println("합계: " + sum);
//         System.out.println("평균: " + average);
//     }
// }


// public class Week4 {
//     public static void main(String[] args){
//         String s1 = "JAVA";
//         String s2 = "Java";
//         String s3 = "java";

//         System.out.println(s1 == s2);
//         System.out.println(s1 != s2);

//         System.out.println(s2 == s3);
//         System.out.println(s3 != s2);

//         String s4 = s2 + s3;
//         System.out.println(s4);
//     }
// }


// public class Week4 {
//     public static void main(String[] args){
//         String s1 = new String("JAVA");
//         String s2 = new String("JAVA");
//         String s3 = s1;

//         if (s1 == s2) { System.out.println("s1과 s2는 같다.");}
//         else {System.out.println("s1과 s2는 다르다. ");}

//         if (s1 == s3) { System.out.println("s1과 s3는 같다.");}
//         else {System.out.println("s1과 s3는 다르다. ");}

//         if (s1.equals(s2)) { System.out.println("s1과 s2는 같다.");}
//         else {System.out.println("s1과 s2는 다르다. ");}

//     }
// }







public class Week4{

    static final int NUM_BOOK = 3;
    static final int NUM_ITEM = 5;


    public static void menuIntroduction() {
        System.out.println("=".repeat(50));
        System.out.println("1. 고객 정보 확인 \t 2. 장바구니 항목 추가");
        System.out.println("3. 장바구니 항목 확인 \t 4. 장바구니 항목 수량 감소");
        System.out.println("5. 장바구니 비우기 \t 6. 장바구니 항목 삭제");
        System.out.println("7. 결제 영수증 출력 \t 8. 종료");
        System.out.println("=".repeat(50));
    }

    public static void BookList(String[][] book){
        book[0][0] = "ISSN_1001";
        book[0][1] = "JAVA";
        book[0][2] = "20000";
        book[0][3] = "YOON";
        book[0][4] = "Alpha";

        book[1][0] = "ISSN_1002";
        book[1][1] = "C++";
        book[1][2] = "20000";
        book[1][3] = "JUNG";
        book[1][4] = "Alpha";

        book[2][0] = "ISSN_2001";
        book[2][1] = "Python";
        book[2][2] = "25000";
        book[2][3] = "LEE";
        book[2][4] = "Beta";
    }

    public static void menuGuestInfo(String userName, String userMobile){
        System.out.println("현재 고객 정보");
        System.out.println("이름: " + userName + '\t' + "연락처: " + userMobile);
    }

    public static void menuCartItem(String[][] book){
        BookList(book);

        System.out.println("=".repeat(20) + "[도서목록]" + "=".repeat(20));
        for (int i = 0; i < NUM_BOOK; i++) {
            for (int j = 0; j < NUM_ITEM; j++) {
                System.out.print(book[i][j] + "/t");
            }
            System.out.println();   
        }

        boolean quit = true;
        while (quit) {
            System.out.print("장바구니에 추가할 도서의 ID를 입력하시오: ");
            Scanner input = new Scanner(System.in);
            String str = input.nextLine();

            boolean flag = false;
            int numID = -1;

            for (int i = 0; i < NUM_BOOK; i++){
                if (str.equals(book[i][0])) {
                    numID = 1;
                    flag = true;
                    break;
                }
            }

            if (flag){
                System.out.print("장바구니에 추가하시겠습니까? Y | N: ");
                str = input.nextLine();

                if (str.toUpperCase().equals("Y")){
                    System.out.println("도서가 장바구니에 추가되었습니다.");
                    System.out.println("Book ID\t: " + book[numID][0]);
                    System.out.println("Book Title\t: " + book[numID][1]);
                }
                quit = false;
            }
            else {
                System.out.println("추가할 도서의 ID가 없습니다. 추가할 도서의 ID를 다시 입력하십시오.");
            }
        }
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
        String[][] mBOOK = new String[NUM_BOOK][NUM_ITEM];

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
                        menuCartItem(mBOOK);
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











