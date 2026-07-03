import java.util.ArrayList;

public class PlataformaStreaming {
    ArrayList<Cuenta_Usuario> cuentasAlmacenadas= new ArrayList<>();

    public void addUsuarios(Cuenta_Usuario us){
        cuentasAlmacenadas.add(us);
    }

    public PlataformaStreaming() {
    }
}
