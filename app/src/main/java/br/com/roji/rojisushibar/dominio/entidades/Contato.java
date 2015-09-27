package br.com.roji.rojisushibar.dominio.entidades;

import java.util.Date;

/**
 * Created by Fernando Júnior on 24/09/2015.
 */
public class Contato {

    private long id;
    private String nome;
    private String telefone;
    private String tipotelefone;
    private String email;
    private String tipoEmail;
    private String endereco;
    private String tipoEndereco;
    private Date datasEspeciais;
    private String tipoDatasEspeciais;
    private String grupos;

    public Contato() {

    }

    public long getId() {

        return id;
    }

    public void setId(long id) {

        this.id = id;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getTelefone() {

        return telefone;
    }

    public void setTelefone(String telefone) {

        this.telefone = telefone;
    }

    public String getTipotelefone() {

        return tipotelefone;
    }

    public void setTipotelefone(String tipotelefone) {

        this.tipotelefone = tipotelefone;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getTipoEmail() {

        return tipoEmail;
    }

    public void setTipoEmail(String tipoEmail) {

        this.tipoEmail = tipoEmail;
    }

    public String getEndereco() {

        return endereco;
    }

    public void setEndereco(String endereco) {

        this.endereco = endereco;
    }

    public String getTipoEndereco() {

        return tipoEndereco;
    }

    public void setTipoEndereco(String tipoEndereco) {

        this.tipoEndereco = tipoEndereco;
    }

    public Date getDatasEspeciais() {

        return datasEspeciais;
    }

    public void setDatasEspeciais(Date datasEspeciais) {

        this.datasEspeciais = datasEspeciais;
    }

    public String getTipoDatasEspeciais() {

        return tipoDatasEspeciais;
    }

    public void setTipoDatasEspeciais(String tipoDatasEspeciais) {
        this.tipoDatasEspeciais = tipoDatasEspeciais;
    }

    public String getGrupos() {

        return grupos;
    }

    public void setGrupos(String grupos) {

        this.grupos = grupos;
    }

    @Override
    public String toString(){

        return nome +
               "\n" +
                telefone +
                "\n" +
                email +
                "\n" +
                endereco +
                "\n" +
                datasEspeciais
                ;
    }
}
