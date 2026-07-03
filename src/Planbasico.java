public class Planbasico implements PlanSuscripcion {
    public double calcularCosto(int meses){
        return (double) meses*5;
    }
}
