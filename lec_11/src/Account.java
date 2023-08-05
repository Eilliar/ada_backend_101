public class Account {

    public Client client;
    public String id;
    public double balance;

    public Account(Client client, String id){
        this.client = client;
        this.id = id;
        this.balance = 0;
    }

    public void deposit(double value){
        if(value >= 0){
            this.balance += value;
        }
    }

    public void withdraw(double value){
        if(this.balance > value && value >= 0){
            this.balance -= value;
        }
        else{
            System.out.println("Not enough balance to withdraw.");
        }
    }

    public boolean equals(Object obj){
        if(!(obj instanceof Account)){
            return false;
        }
        return this.id.equals(((Account) obj).id);
    }

    public String toString(){
        return "Account id: " + this.id + "\tClient CPF: " + this.client.cpf + "\tBalance: " + this.balance;
    }

}
