package app;

import java.util.HashSet;
import java.util.Set;

public class UsuarioService {

    private Set<Usuario> usuarios = new HashSet<>();

    public boolean cadastrarUsuario( Usuario usuario){

        return usuarios.add(usuario);

    }
    public Usuario buscarPorEmail(String email){

        for (Usuario u : usuarios){

            if (u.getEmail().equals(email)){

                return  u;
            }
        }
        return null;
    }
    public boolean removerUsuario(String email){

        Usuario usuario = buscarPorEmail(email);
        if (usuario != null) {
            return usuarios.remove(usuario);
        }
        return false;
    }
    public void listarUsuarios(){

        for (Usuario u : usuarios){

            System.out.println(u.getNome() + " - " + u.getEmail());

        }

    }




}
