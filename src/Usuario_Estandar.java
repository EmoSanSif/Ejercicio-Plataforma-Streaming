public class Usuario_Estandar extends Cuenta_Usuario{
    public Usuario_Estandar(String correoElectronico, int mesesActivo, PlanSuscripcion planSeleccionado) {
        PlanSuscripcion PE = new Planestandar();
        super(correoElectronico, mesesActivo, PE);
    }
}
