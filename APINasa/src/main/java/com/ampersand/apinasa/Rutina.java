package com.ampersand.apinasa;

import java.util.TimerTask;
import com.ampersand.apinasa.servs.RegistroNasaServs;
import com.ampersand.apinasa.beans.RegistroNasa;

public class Rutina extends TimerTask {
	private RegistroNasaServs RegistroNasaServs;

    public Rutina(RegistroNasaServs RegistroNasaServs) {
        this.RegistroNasaServs = RegistroNasaServs;
    }

    public void run() {
        RegistroNasa regs = new RegistroNasa();
        regs.setHref("");
        regs.setCenter("");
		regs.setText("");

        myAPODService.saveInfoNasa(regs);
        
    }
	

}