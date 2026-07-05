import java.util.ArrayList;

public class PlataformaStreaming {
    ArrayList<Cuenta_Usuario> cuentasAlmacenadas= new ArrayList<>();

    public void addUsuarios(Cuenta_Usuario us){
        cuentasAlmacenadas.add(us);
    }

    public PlataformaStreaming() {
    }
    public void CalcularCostoPorCuenta(){
        for (Cuenta_Usuario cu : cuentasAlmacenadas){
            double costoTotal = cu.obtenerTotalaPagar();
            System.out.println("el usuario: " + cu + " tiene un total para pagar de: " + costoTotal);
        }
    }

    public void mostrarUsuarios(){
        for (Cuenta_Usuario cu : cuentasAlmacenadas){
            System.out.println(cu.toString());
        }
    }

}
