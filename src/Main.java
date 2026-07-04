void main() {
    ArrayList<PlanSuscripcion> planesAlmacenados = new ArrayList<>();

    PlanSuscripcion PlanEstandar = new Planestandar();
    PlanSuscripcion PlanBasico = new Planbasico();
    PlanSuscripcion PlanPremium = new Planpremium();

    planesAlmacenados.add(PlanBasico);
    planesAlmacenados.add(PlanEstandar);
    planesAlmacenados.add(PlanPremium);

    desplegarLista(planesAlmacenados);
}
public void desplegarLista(ArrayList<PlanSuscripcion> ps){
    for (PlanSuscripcion p : ps){
        int indice = ps.indexOf(p);
        System.out.println((indice+1) + "--" + p);
    }
}
