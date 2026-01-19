package app;
import java.util.Objects;

public class Usuario {
    private String nome;
    private String email;

    public Usuario(String nome, String email){

        this.nome = nome;
        this.email = email;

    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    @Override

    public boolean equals(Object o ) {

        if (this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;
        return email.equals(usuario.email);


    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}


