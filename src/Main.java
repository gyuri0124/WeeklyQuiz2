import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        while (true) {
            System.out.println("\n1. 비즈니스 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.print("메뉴를 선택해주세요: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // 버퍼 비우기

            switch (choice) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String name1 = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String phone1 = scanner.nextLine();
                    System.out.print("회사명을 입력하세요: ");
                    String company = scanner.nextLine();
                    addressBook.addBusinessContact(name1, phone1, company);
                    break;

                case 2:
                    System.out.print("이름을 입력하세요: ");
                    String name2 = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String phone2 = scanner.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String relation = scanner.nextLine();
                    addressBook.addPersonalContact(name2, phone2, relation);
                    break;

                case 3:
                    addressBook.displayContacts();
                    break;

                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    addressBook.searchContact(searchName);
                    break;

                case 5:
                    System.out.println("프로그램을 종료합니다.");
                    scanner.close();
                    return;

                default:
                    System.out.println("올바른 번호를 입력하세요.");
            }
        }
    }
}
