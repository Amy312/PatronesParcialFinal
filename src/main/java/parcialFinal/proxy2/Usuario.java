package parcialFinal.proxy2;

public class Usuario {
    private String password;
    private String name;
    private int id;

    public Usuario(String password, String name, int id) {
        this.password = password;
        this.name = name;
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void showInfo(){
        System.out.println("\t> Usuario: " + name);
        System.out.println("\t- ID: " + id + "\n");
    }
}
