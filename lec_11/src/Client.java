public class Client {

    public String name;
    public String cpf;
    public String email;

    public Client(String name, String cpf, String email){
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Client)){
            return false;
        }
        return this.cpf.equals(((Client) obj).cpf);
    }

    public String toString(){
        return "Name: " + this.name + "\tCPF: " + this.cpf + "\te-mail: " + this.email;
    }
}
