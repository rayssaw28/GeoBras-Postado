/*
 * Copyright (C) 2024 Rayssa Alves <rayssaalves.go@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package geobras.entities;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 05/06/2024
 * @brief Class CalculoIndice
 */
public class Create {

    int classe;
    
    Locais locais = new Locais();
    
    public void ClassificacaoIdh(){
    
        double idh = locais.getIDH();
        
        if(idh > 0.8 ){            
            classe = 1;   
            System.out.println(locais.getIDH() + ": " + "Muito Alto");
        } else if(idh > 0.7 && idh >= 0.8) {
            classe = 2;
            System.out.println(locais.getIDH() + ": " + "Alto");
        } else if(idh > 0.55 && idh >= 0.7) {
            classe = 3;
            System.out.println(locais.getIDH() + ": " + "Médio");
        } else if(idh <= 0.55) {
            classe = 4;
            System.out.println(locais.getIDH() + ": " + "Baixo");
        }
      
    
    }
    
    public void ClassificacaoIdhEducacional(){
    
        double idh = locais.getIDHeducacional();
        
        if(idh > 0.8 ){            
            classe = 1;   
            System.out.println(locais.getIDHeducacional() + ": " + "Muito Alto");
        } else if(idh > 0.7 && idh >= 0.8) {
            classe = 2;
            System.out.println(locais.getIDHeducacional() + ": " + "Alto");
        } else if(idh > 0.55 && idh >= 0.7) {
            classe = 3;
            System.out.println(locais.getIDHeducacional() + ": " + "Médio");
        } else if(idh <= 0.55) {
            classe = 4;
            System.out.println(locais.getIDHeducacional() + ": " + "Baixo");
        }
      
    
    }
    
    public void ClassificacaoIdhLongevidade(){
    
        double idh = locais.getIDHlongevidade();
        
        if(idh > 0.8 ){            
            classe = 1;   
            System.out.println(locais.getIDHlongevidade() + ": " + "Muito Alto");
        } else if(idh > 0.7 && idh >= 0.8) {
            classe = 2;
            System.out.println(locais.getIDHlongevidade() + ": " + "Alto");
        } else if(idh > 0.55 && idh >= 0.7) {
            classe = 3;
            System.out.println(locais.getIDHlongevidade() + ": " + "Médio");
        } else if(idh <= 0.55) {
            classe = 4;
            System.out.println(locais.getIDHlongevidade() + ": " + "Baixo");
        }
      
    }
    public static void calcularDensidade(Locais locais) {
        double densidade = locais.getPopulacao() / locais.getArea();
        locais.setDensidade(densidade);
        System.out.println("densidade: " + locais.getDensidade());
    }
    
    public void calcularPIBperCapita(Locais locais) {
        double pibpercapita = locais.getPIBtotal() / locais.getPopulacao();
        locais.setPIBperCapita(pibpercapita);    
       System.out.println("PibPerCapita: " + locais.getPIBperCapita());
        
        
    }
    
    
}
