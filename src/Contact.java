abstract class Contact {
    protected String name;
    protected String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public abstract void display();

    public String getName() {
        return name;
    }
}
