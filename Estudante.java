public class Estudante {

    private String nome;
    private String email;

    public Estudante(){

    }
    public Estudante(String nome, String email){
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //Formatação para printar em tela
    public String toString() {
        return "\nNome: " + nome
                +"\nEmail: " + email;
    }


}
