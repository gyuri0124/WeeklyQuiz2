class PersonalContact extends Contact {
    private String relationship;

    public PersonalContact(String name, String phoneNumber, String relationship) {
        super(name, phoneNumber);       //  부모 클래스 생성자 상속
        this.relationship = relationship;
    }

    @Override
    public void display() {
        System.out.println("이름: " + name + ", 전화번호: " + phoneNumber + ", 관계: " + relationship);
    }
}