void main() {
    Scanner teclado = new Scanner(System.in);

    ArrayList<PlanSuscripcion> planesAlmacenados = new ArrayList<>();

    PlanSuscripcion PlanEstandar = new Planestandar();
    PlanSuscripcion PlanBasico = new Planbasico();
    PlanSuscripcion PlanPremium = new Planpremium();

    PlataformaStreaming Netflix = new PlataformaStreaming("Netflix");

    Cuenta_Usuario U1 = new Usuario_Basico("aa@bb.com", 12, PlanBasico);
    Cuenta_Usuario U2 = new Usuario_Estandar("aa1@bb.com", 12, PlanEstandar);
    Cuenta_Usuario U3 = new Usuario_Premium("aa2@bb.com", 12, PlanPremium);

    Netflix.addUsuarios(U1);
    Netflix.addUsuarios(U2);
    Netflix.addUsuarios(U3);

    planesAlmacenados.add(PlanBasico);
    planesAlmacenados.add(PlanEstandar);
    planesAlmacenados.add(PlanPremium);


    boolean continuar = true;
    int opc = 0;

    System.out.println("Bienvenido al sistema de las meras riatas");
    do {
       try{
           System.out.println("Escoga una opcion");
           System.out.println("1) Asignar una cuenta a la plataforma\n2) Cuentas en ciertos planes\n3) Dinero total en streaming\n4) Salir");
           opc = teclado.nextInt();
       }
       catch(Exception ex){
           teclado.nextLine();
           opc = 0;
           System.out.println("Opcion ingresada incorrectamente");
       }
       teclado.nextLine();
       switch (opc){

           /* ZOE - Creaacion de cuenta y asignacion a la plataforma */
           case 1:

               System.out.println("Ingrese el correo electroico:");
               String correo = teclado.nextLine();
               System.out.println("Ingrese los meses de actividad");
               int actividad = teclado.nextInt();
               System.out.println("Ingrese el Plan:");
               desplegarLista(planesAlmacenados);
               while (!teclado.hasNextInt()){
                   System.out.println("opcion incorrecta!");
                   teclado.next();
                   System.out.println("ingrese otra opcion!");
               }
               int planseleccionado = teclado.nextInt();

             if(planseleccionado < 1 || planseleccionado > planesAlmacenados.size()) {
                 System.out.println("no ta en la lista checalo papi");
                 break;
             }

              if (planesAlmacenados.get(planseleccionado-1) instanceof Planbasico) {
                  Cuenta_Usuario nuevousuario = new Usuario_Basico(correo, actividad, planesAlmacenados.get(planseleccionado - 1));
                  Netflix.addUsuarios(nuevousuario);
              }
               else if (planesAlmacenados.get(planseleccionado-1) instanceof Planestandar) {
                  Cuenta_Usuario nuevousuario= new Usuario_Estandar(correo, actividad, planesAlmacenados.get(planseleccionado-1));
                  Netflix.addUsuarios(nuevousuario);
              } else if(planesAlmacenados.get(planseleccionado-1) instanceof Planpremium) {
                     Cuenta_Usuario nuevousuario = new Usuario_Premium(correo, actividad, planesAlmacenados.get(planseleccionado - 1));
                     Netflix.addUsuarios(nuevousuario);
              }
               System.out.println("Su usuario ha sido agregado exitosamente");
           break;

           /* Emilio - Impresion de cuentas en cierto plan */
           case 2:
               int plan_selec = 0;
               boolean in = false;

               System.out.println("Escoga el tipo de plan del que quiere ver las cuentas ");
               desplegarLista(planesAlmacenados);
               while (!in) {
                   try {
                       //desplegarLista(planesAlmacenados);
                       plan_selec = teclado.nextInt();
                       in = true;
                   } catch (Exception ex) {
                       plan_selec = 0;
                       System.out.println("Opcion ingresada incorrectamente");
                       teclado.next();
                   }
               }

               if (plan_selec < 1 || plan_selec > planesAlmacenados.size()){
                   System.out.println("opcion fuera de la lista!");
                   break;
               }

                   for (Cuenta_Usuario cu : Netflix.cuentasAlmacenadas) {
                       if (planesAlmacenados.get(plan_selec-1) instanceof Planbasico) {
                           if( cu instanceof Usuario_Basico) {
                               System.out.println(cu.toString());
                           }
                       }
                       else if (planesAlmacenados.get(plan_selec-1) instanceof Planestandar) {
                           if( cu instanceof Usuario_Estandar) {
                               System.out.println(cu.toString());
                           }
                       }
                       else if(planesAlmacenados.get(plan_selec-1) instanceof Planpremium) {
                           if( cu instanceof Usuario_Premium) {
                               System.out.println(cu.toString());
                           }
                       }
                   }
           break;
           /* CARLOS - Impresion total de dinero de cada tipo de plan y el total */
           case 3:

               if (!Netflix.cuentasAlmacenadas.isEmpty()) {
                   Netflix.CalcularCostoPorCuenta();
               }
               else {
                   System.out.println("la lista no tiene nada papi");
               }


           break;

           /* Salir */
           case 4:
               System.out.println("Saliendo... Gracias!");
               continuar = false;
           break;
           default:
               System.out.println("Opcion ingresada incorrectamente");
           break;
       }
    }while(continuar);
    //holaaa!!!

}

public void desplegarLista(ArrayList<PlanSuscripcion> ps){
    for (PlanSuscripcion p : ps){
        int indice = ps.indexOf(p);
        System.out.println((indice+1) + "--" + p);
    }
}

public PlataformaStreaming crearPlataforma(Scanner teclado) {

    System.out.println("Ingrese el nombre de la plataforma");
    String nombre = teclado.next();

    PlataformaStreaming nuevaPlataforma = new PlataformaStreaming(nombre);

    return nuevaPlataforma;
}