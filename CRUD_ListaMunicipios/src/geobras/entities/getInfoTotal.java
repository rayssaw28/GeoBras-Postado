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


import static geobras.GeoBras.locaisInfo;
import java.text.DecimalFormat;

/**
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 14/06/2024
 * @brief Class getInfoTotal
 */

public class getInfoTotal {
    
    Locais locais = new Locais();
    Create create = new Create();
    
    public static String getInfoForCodigo(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[0]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForMicrorregiao(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[2]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForEstado(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[3]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }

    public static String getInfoForRegiao(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[4]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForArea(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[5]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForPopulacao(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[6]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForDomicilios(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[7]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForPibTotal(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[8]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForIDH(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[9]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForRendaMedia(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[10]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForRendaNominal(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[11]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForPEA(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[12]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForIDHeducacional(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[13]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
    public static String getInfoForIDHlongevidade(String municipio) {
        for (String[] info : locaisInfo) {
            if (info.length > 1 && info[1].equals(municipio)) {
                StringBuilder sb = new StringBuilder();
                sb.append(" ").append(info[14]).append("\n");
                return sb.toString();
            }
        }
        return "Informações não encontradas para " + municipio;
    }
    
   public static String getInfoForDensidade(String municipio) {
    for (String[] info : locaisInfo) {
        if (info.length > 1 && info[1].equals(municipio)) {
            String densidadeString = info[15];
            double densidade = Double.parseDouble(densidadeString);
            DecimalFormat df = new DecimalFormat("#.##");
            String densidadeFormatada = df.format(densidade);
            StringBuilder sb = new StringBuilder();
            sb.append(" ").append(densidadeFormatada).append("\n");
            return sb.toString();
        }
    }
    return "Informações não encontradas para " + municipio;
}
   
   public static String getInfoForPibPerCapita(String municipio) {
    for (String[] info : locaisInfo) {
        if (info.length > 1 && info[1].equals(municipio)) {
            String pibPerCapitaString = info[16];
            double pibPerCapita = Double.parseDouble(pibPerCapitaString);
            DecimalFormat df = new DecimalFormat("#.##");
            String pibPerCapitaFormatado = df.format(pibPerCapita);
            StringBuilder sb = new StringBuilder();
            sb.append(" ").append(pibPerCapitaFormatado).append("\n");
            return sb.toString();
        }
    }
    return "Informações não encontradas para " + municipio;
}
    
}
