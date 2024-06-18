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

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 16/06/2024
 * @brief Class ordenarPosicoes
 */
public class ordenarPosicoes {

     public ArrayList<Double> ordenarPibPerCapita(String[] pibPerCapita) {
        ArrayList<Double> pibPerCapitas = new ArrayList<>();
        for (String valor : pibPerCapita) {
            double pib = Double.parseDouble(valor);
            pibPerCapitas.add(pib);
        }
        Collections.sort(pibPerCapitas);
        return pibPerCapitas;
    }

    public ArrayList<Integer> calcularPosicoes(String[] pibPerCapita, ArrayList<Double> pibPerCapitasOrdenados) {
        ArrayList<Integer> posicoes = new ArrayList<>();
        for (String valor : pibPerCapita) {
            double pib = Double.parseDouble(valor);
            int posicao = pibPerCapitasOrdenados.indexOf(pib) + 1;
            posicoes.add(posicao);
        }
        return posicoes;
    }
    
}
