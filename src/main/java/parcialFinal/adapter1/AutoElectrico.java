package parcialFinal.adapter1;

public class AutoElectrico implements IElectrico{
    private int bateria = 0;
    @Override
    public void cargar(int voltaje) {
        if(voltaje%2==0){
            bateria = voltaje;
        }else{
            bateria = voltaje-1;
        }
        if(bateria>=100){
            bateria = 100;
        } else if (bateria<0) {
            {
                bateria = 0;
            }

        }
        System.out.println("Estado bateria: " + bateria);

    }

    @Override
    public int estadoElectricidad() {
        bateria = (int)(Math.random()*10+1);
        return bateria;
    }
}
