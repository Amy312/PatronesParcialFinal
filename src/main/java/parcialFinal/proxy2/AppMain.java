package parcialFinal.proxy2;

public class AppMain {
    public static void main (String []args){
        ServidorProxy servidor = new ServidorProxy("11.5v", 1024);

        servidor.login(new Usuario("pancito", "Valeria", 29), "pancito");
        servidor.login(new Usuario("aoimire", "Jose", 12), "rosas");
        servidor.login(new Usuario("pass", "Joaquin", 25), "word");
        servidor.login(new Usuario("animejsjs", "Manuel", 187), "animejsjs");


        servidor.showUsers();

    }
}

