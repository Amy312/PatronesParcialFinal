package parcialFinal.adapter1;

public class AGasolinaEspecial implements IAutomovil{
    private int gEspecial;

    @Override
    public void llenarGasolina(int cantidad) {
        gEspecial = cantidad;
        if(cantidad>=100){
            gEspecial = 100;
        } else if (cantidad<0) {
            gEspecial = 0;
        }
        System.out.println("Estado combustible: " + gEspecial);

    }

    @Override
    public int estadoCombustible() {
        gEspecial = (int)(Math.random()*100+1);
        return gEspecial;
    }
}
