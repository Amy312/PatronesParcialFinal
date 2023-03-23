package parcialFinal.adapter1;

public class ADiesel implements IAutomovil{
    private int diesel;

    @Override
    public void llenarGasolina(int cantidad) {
        diesel = cantidad;
        if(cantidad>=100){
            diesel = 100;
        } else if (cantidad<0) {
            diesel = 0;
        }
        System.out.println("Estado combustible: " + diesel);
    }

    @Override
    public int estadoCombustible() {
        diesel = (int)(Math.random()*100+1);
        return diesel;
    }
}
