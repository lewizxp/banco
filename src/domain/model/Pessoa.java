package domain.model;

public class Pessoa {
    private String nome;
    private String cpf;
    private String cnpj;
    private String dataNasc;
    private String email;
    private String tel;

    public Pessoa(String nome, String email, String tel) throws Exception {
        this.setNome(nome); // this.nome = nome
        this.setEmail(email); // this.email = email
        this.setTel(tel); // this.tel = tel
    }

    public Pessoa(String nome, String cpf) throws Exception {
        this.setNome(nome);
        this.setCpf(cpf);
    }

    public void setNome(String nome) throws Exception {
        if (nome.trim().equals(""))
            throw new Exception("Nome embranco!");
        this.nome = nome.trim();
    }

    public String getNome() {
        return this.nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return this.cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}