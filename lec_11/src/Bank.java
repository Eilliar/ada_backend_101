public class Bank {

    Account[] accounts = new Account[] {};
    public void createAccount(String name, String cpf, String email, String id){
        Client client = new Client(name, cpf, email);
        Account account = new Account(client, id);

        Account[] newAccounts = new Account[this.accounts.length + 1];
        int i;
        for (i = 0; i < this.accounts.length; i++){
            newAccounts[i] = this.accounts[i];
        }
        newAccounts[i] = account;

        this.accounts = newAccounts;
    }

    public Account searchAccount(String accountId){

        if(this.accounts.length < 1){
            return null;
        }
        for(Account account: this.accounts){
            if(account.id.equals(accountId)){
                return account;
            }
        }

        return null;
    }

    public boolean depositToAccount(String accountId, double value){
        if(this.accounts.length < 1){
            return false;
        }
        for(Account account: this.accounts){
            if(account.id.equals(accountId)){
                return account.deposit(value);
            }
        }
        return false;
    }

    public boolean withdrawFromAccount(String accountId, double value){
        if(this.accounts.length < 1){
            return false;
        }
        for(Account account: this.accounts) {
            if (account.id.equals(accountId)) {
                return account.withdraw(value);
            }
        }
        return false;
    }
}
