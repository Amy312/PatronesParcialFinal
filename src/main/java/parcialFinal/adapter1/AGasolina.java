package parcialFinal.adapter1;

public class AGasolina implements IAutomovil{
    private int gasolina;

    @Override
    public void llenarGasolina(int cantidad) {
        gasolina = cantidad;
        if(cantidad>=100){
            gasolina = 100;
        } else if (cantidad<0) {
            gasolina = 0;
        }
        System.out.println("Estado combustible: " + gasolina);

    }

    @Override
    public int estadoCombustible() {
        gasolina = (int)(Math.random()*100+1);
        return gasolina;
    }
}
