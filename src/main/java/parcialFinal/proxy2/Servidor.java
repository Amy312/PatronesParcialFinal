package parcialFinal.proxy2;

import java.util.ArrayList;
import java.util.List;

public class Servidor implements IServer{
    private List<Usuario> usuarioList;

    private String tipo;
    private int capacidad;

    public Servidor(String tipo, int capacidad) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.usuarioList = new ArrayList<>();
    }

    @Override
    public void login(Usuario user, String pwd) {
        usuarioList.add(user);
    }

    public List<Usuario> getUsuarioList() {
        return usuarioList;
    }

    public void finish(Usuario user){
        usuarioList.remove(user);
    }
}
