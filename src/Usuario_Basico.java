public class Usuario_Basico extends Cuenta_Usuario{
    public Usuario_Basico(String correoElectronico, int mesesActivo, PlanSuscripcion planSeleccionado) {
        PlanSuscripcion PB = new Planbasico();
        super(correoElectronico, mesesActivo, PB);
    }
}
