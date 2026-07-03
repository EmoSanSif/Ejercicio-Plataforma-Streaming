public class Planpremium implements PlanSuscripcion {
    public double calcularCosto(int meses){
        return (double) (meses*14)+3;
    }
}
