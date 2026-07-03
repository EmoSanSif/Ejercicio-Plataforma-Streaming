abstract class Cuenta_Usuario {
    protected String correoElectronico;
    protected int mesesActivo;
    protected PlanSuscripcion PlanSeleccionado;

    /* CONSTRUCTORES */

    public Cuenta_Usuario(String correoElectronico, int mesesActivo, PlanSuscripcion planSeleccionado) {
        this.correoElectronico = correoElectronico;
        this.mesesActivo = mesesActivo;
        PlanSeleccionado = planSeleccionado;
    }

    /* GETTERS Y SETTERS */

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public int getMesesActivo() {
        return mesesActivo;
    }

    public void setMesesActivo(int mesesActivo) {
        this.mesesActivo = mesesActivo;
    }

    public PlanSuscripcion getPlanSeleccionado() {
        return PlanSeleccionado;
    }

    public void setPlanSeleccionado(PlanSuscripcion planSeleccionado) {
        PlanSeleccionado = planSeleccionado;
    }

    /* METODOSO */

    public double obtenerTotalaPagar(){
       return PlanSeleccionado.calcularCosto(this.mesesActivo); 
    }
}
