public class Planpremium implements PlanSuscripcion {
    public double calcularCosto(int meses){
        return (meses*14)+3;
    }
}
