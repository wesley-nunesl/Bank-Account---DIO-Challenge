package entities;

public class Account {
    private int number;
    private String agency;
    private String clientName;
    private Double balance;

    public Account() {
    }

    public Account(int number, String agency, String clientName, Double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Hello " + clientName +
                ", thank you for creating an account with our bank, your branch is " + agency +
                ", account " + number +
                " and your balance " + balance +
                " is now available for withdrawal.";
    }
}
