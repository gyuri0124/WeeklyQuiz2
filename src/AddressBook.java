import java.util.ArrayList;
import java.util.List;

class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addBusinessContact(String name, String phoneNumber, String company) {
        contacts.add(new BusinessContact(name, phoneNumber, company));
    }

    public void addPersonalContact(String name, String phoneNumber, String relationship) {
        contacts.add(new PersonalContact(name, phoneNumber, relationship));
    }

    public void displayContacts() {
        if (contacts.isEmpty()) {
            System.out.println("연락처가 비어있습니다.");
        } else {
            for (Contact contact : contacts) {
                contact.display();      // displayInfo() 메서드 호출
            }
        }
    }

    public void searchContact(String name) {
        boolean found = false;      // 연락처 찾았는지 못 찾았는지 확인! 아직은 못 찾은 상태로 저장
        for (Contact contact : contacts) {
            if (contact.getName().equals(name)) {
                contact.display();
                found = true;
            }
        }
        if (!found) {       // for문이 끝난 후에도 찾지 못한 경우
            System.out.println("연락처를 찾을 수 없습니다.");
        }
    }
}