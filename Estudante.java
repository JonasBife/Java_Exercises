public class Estudante {

    private String nome;
    private String email;
    private int quarto;

    public Estudante(){

    }
    public Estudante(String nome, String email, int quarto){
        this.nome = nome;
        this.email = email;
        this.quarto = quarto;
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

    public int getQuarto(){
        return quarto;
    }

    public void setQuarto(int quarto){
        this.quarto=quarto;
    }

    //Formatação para printar em tela
    public String toString() {
        return "Nome: " + nome
                +"\nEmail: " + email
                +"\nQuarto: " + quarto;
    }


}
