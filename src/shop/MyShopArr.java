// package shop;

// import java.util.Scanner;

// public class MyshopArr implements Ishop {
// private Scanner in = new Scanner(System.in);
// private String title;
// // 고객 5명 저장가능한 배열 생성
// private User users[] = new User[5];
// // 제품 10개 저장가능한 배열 생성
// private Product products[] = new Product[10];
// // cart(제품 저장 배열)
// private Product cart[] = new Product[10];

// // start() 에서 선택된 user 보관 변수
// private int uNo;

// @Override
// public void setTitle(String title) {
// this.title = title;
// }

// @Override
// public void genUser() {
// // 2명 User 생성 후 배열객체에 담기
// users[0] = new User("홍길동", PayType.CARD);
// users[1] = new User("성춘향", PayType.CASH);

// }

// @Override
// public void genProduct() {
// products[0] = new CellPhone("삼성 갤럭시 S50", 1000000, "SKT");
// products[1] = new CellPhone("아이폰 12", 14000000, "KT");
// products[2] = new CellPhone("삼성 갤럭시 A20", 300000, "LG U+");
// products[3] = new Tv("LG 울트라", 3500000, "4K");
// products[4] = new Tv("삼성 QLED", 4680000, "QLED");
// }

// // 유저 선택 메뉴(메인화면)
// @Override
// public void start() {
// // 상점이름 : 메인화면 - 계정선택
// // ==============================
// // [0] 홍길동(CARD)
// // [1] 성춘향(CASH)
// // [x] 종료
// // ==============================
// // 선택(0,1,x) :

// // 메인화면
// System.out.println(title + " 메인화면 - 계정선택");
// System.out.println("==============================");
// for (int i = 0; i < users.length; i++) {
// if (users[i] != null)
// System.out.printf("[%d] %s(%s)\n", i, users[i].getName(),
// users[i].getPayType());
// }
// System.out.println("[x] 종료");
// System.out.println("==============================");
// System.out.print("고객 선택(x:종료) : ");
// String user = in.nextLine();

// switch (user) {
// case "0", "1":
// int uNo = Integer.parseInt(user);
// productList();
// break;
// case "x":
// System.out.println("종료합니다.");
// System.exit(0);
// default:
// System.out.println("잘못입력하셨습니다!");
// System.out.println();
// start();
// break;
// }
// }

// // 상품 목록 메뉴
// public void productList() {
// System.out.println(title + " 상품목록 - 상품선택");
// System.out.println("==============================");
// for (int i = 0; i < products.length; i++) {
// if (products[i] != null) {
// System.out.printf("[%d] ", i);
// products[i].printDetail();
// System.out.println();
// }
// }
// System.out.println("[h] 메인화면");
// System.out.println("[c] 체크아웃");
// System.out.println("==============================");

// String pro = in.nextLine();
// switch (pro) {
// case "h":
// //
// start();
// break;
// case "c":
// checkout();
// break;
// case "0", "1", "2", "3", "4":
// int pNo = Integer.parseInt(pro);
// for (int i = 0; i < cart.length; i++) {
// if (cart[i] == null) {
// cart[i] = products[pNo];
// break;
// }
// }
// productList();
// break;
// default:
// System.out.println("잘못입력하셨습니다!");
// System.out.println();
// productList();
// break;
// }
// }

// // 카트 메뉴
// public void checkout() {
// System.out.println(title + users[uNo].getName() + "- 체크아웃");
// System.out.println("==============================");
// int sum = 0;
// for (int i = 0; i < cart.length; i++) {
// if (cart[i] != null) {
// System.out.printf("[%d] %s (%d) ", i, cart[i].getPname(),
// cart[i].getPrice());
// // cart[i].printDetail();
// sum += cart[i].getPrice();
// System.out.println();
// }
// }
// // System.out.println("결제방법 : " + users[uNo].getPayType());
// System.out.println("결제방법 : " + users[uNo].getPayType());
// System.out.println("합계 : " + sum);
// System.out.println("==============================");
// System.out.println("[p] 이전");
// System.out.println("[q] 종료");

// System.out.println("선택 : "); // p=> productList(), q=>종료
// String check = in.nextLine();

// switch (check) {
// case "p":
// productList();
// break;
// case "q":
// System.out.println("종료합니다.");
// System.exit(0);
// default:
// System.out.println("잘못입력하셨습니다!");
// System.out.println();
// checkout();
// break;
// }

// }

// public void newcart() {
// // 첫 유저 입장시 새로운카트 생성해서 배정
// // 기존 유저면 카트이름 저장된거 불러오기
// // 카트가 배열인데 그 카트들을 보관하는 큰 배열이 있는거야
// }
// 브리 왔다감

// }
