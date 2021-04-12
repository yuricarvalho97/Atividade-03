import Adaptadores.AdaptadorTomada;
import Tomadas.TomadaTresPinos;

public class App {
    public static void main(String[] args) throws Exception {
        TomadaTresPinos t3 = new TomadaTresPinos();

        AdaptadorTomada adap = new AdaptadorTomada(t3);
        adap.ligarTomadaDoisPinos();
    }
}
