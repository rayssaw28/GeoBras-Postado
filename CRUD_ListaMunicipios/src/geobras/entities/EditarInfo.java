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
import java.util.*;
import javafx.fxml.FXML;

/**
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 06/06/2024
 * @brief Class EditarInfo
 */

public class EditarInfo {
    
    Scanner sc = new Scanner(System.in);
    Locais locais = new Locais();
    
    public void editarPopulacao() {     
        locais.setPopulacao(sc.nextDouble());
}
    public void editarDomicilios() {     
        locais.setDomicilios(sc.nextDouble());
}
    public void editarPIBtotal() {     
        locais.setPIBtotal(sc.nextDouble());
}
    public void editarIDH() {     
        locais.setIDH(sc.nextDouble());
}
    public void editarRendaMedia() {     
        locais.setRendaMedia(sc.nextDouble());
} 
    public void editarRendaNominal() {     
        locais.setRendaNominal(sc.nextDouble());
}
    public void editarPEA() {     
        locais.setPEA(sc.nextDouble());
}
    public void editarIDHeducacional() {     
        locais.setIDHeducacional(sc.nextDouble());
}
    public void editarIDHlongevidade() {     
        locais.setIDHlongevidade(sc.nextDouble());
}
}