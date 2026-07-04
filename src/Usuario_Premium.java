public class Usuario_Premium extends Cuenta_Usuario{
    public Usuario_Premium(String correoElectronico, int mesesActivo, PlanSuscripcion planSeleccionado) {
        PlanSuscripcion PM = new Planpremium();
        super(correoElectronico, mesesActivo, PM);
    }
}
