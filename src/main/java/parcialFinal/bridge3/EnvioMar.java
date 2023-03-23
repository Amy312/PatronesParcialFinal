package parcialFinal.bridge3;

public class EnvioMar implements IEnvio{
    private float extra = 0.25F;
    @Override
    public float agregarCosto() {
        return extra;
    }
    @Override
    public String tipo() {
        return "Mar";
    }

}
