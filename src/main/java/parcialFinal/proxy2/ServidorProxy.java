package parcialFinal.proxy2;

public class ServidorProxy implements IServer{
    private Servidor servidor1;
    private Servidor servidor2;

    public ServidorProxy(String tipo, int capacidad) {
        servidor1 = new Servidor(tipo, capacidad);
        servidor2 = new Servidor("12.0 version", capacidad+16);
    }

    @Override
    public void login(Usuario user, String pwd) {
        if(user.getPassword().equals(pwd)){
            boolean sw = false;
            for(int i=2; i<user.getId(); i++){
                if(user.getId()%i==0){
                    sw = true;
                    servidor2.login(user, pwd);
                    break;
                }
            }
            if(!sw){
                servidor1.login(user, pwd);
            }
        } else{
            System.out.println("Usuario: " + user.getName() + " --> contraseña incorrecta");
        }

    }

    public void showUsers(){
        System.out.println("Lista de usuarios conectados:");
        System.out.println("--> Servidor1");
        for(Usuario user: servidor1.getUsuarioList()){
            user.showInfo();
        }
        System.out.println("\n--> Servidor2");
        for(Usuario user: servidor2.getUsuarioList()){

            user.showInfo();
        }
    }
}
