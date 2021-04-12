package Adaptadores;

import Tomadas.TomadaDoisPinos;
import Tomadas.TomadaTresPinos;

public class AdaptadorTomada extends TomadaDoisPinos {
    private TomadaTresPinos tomadaTresPinos;

    public AdaptadorTomada(TomadaTresPinos tomadaTresPinos){

        this.tomadaTresPinos = tomadaTresPinos;
    }

    public void ligarTomadaDoisPinos(){
        tomadaTresPinos.ligarTomadaTresPinos();
    }
}
