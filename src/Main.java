void main() {
    ArrayList<PlanSuscripcion> planesAlmacenados = new ArrayList<>();

    PlanSuscripcion PlanEstandar = new Planestandar();
    PlanSuscripcion PlanBasico = new Planbasico();
    PlanSuscripcion PlanPremium = new Planpremium();

    PlataformaStreaming Netflix = new PlataformaStreaming();

    Cuenta_Usuario U1 = new Usuario_Basico("aa@bb.com", 12, PlanBasico);
    Cuenta_Usuario U2 = new Usuario_Basico("aa1@bb.com", 12, PlanBasico);
    Cuenta_Usuario U3 = new Usuario_Basico("aa2@bb.com", 12, PlanBasico);

    Netflix.addUsuarios(U1);
    Netflix.addUsuarios(U2);
    Netflix.addUsuarios(U3);

    planesAlmacenados.add(PlanBasico);
    planesAlmacenados.add(PlanEstandar);
    planesAlmacenados.add(PlanPremium);

    desplegarLista(planesAlmacenados);

    Netflix.CalcularCostoPorCuenta();


}
public void desplegarLista(ArrayList<PlanSuscripcion> ps){
    for (PlanSuscripcion p : ps){
        int indice = ps.indexOf(p);
        System.out.println((indice+1) + "--" + p);
    }
}
