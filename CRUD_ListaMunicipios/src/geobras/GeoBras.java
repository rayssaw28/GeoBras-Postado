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

package geobras;

import geobras.entities.Create;
import geobras.entities.DataHora;
import geobras.entities.getInfoTotal;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import geobras.entities.Locais;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 06/06/2024
 * @brief Class GeoBras
 */

public class GeoBras extends Application {

    public static List<String[]> locaisInfo = new ArrayList<>();
    private static List<String> municipiosInfo = new ArrayList<>();
    
    

    @Override
    public void start(Stage stage) throws Exception {
            Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        
        stage.setScene(scene);
        stage.show();
    }

    public static List<String> getMunicipiosInfo() {
        return municipiosInfo;
    }
    

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String pathIn = "C:\\ProjetoIntegrador\\In\\01.ProjetoIntegrador_BaseMunicipios_In.csv";
        Locais locais = new Locais();
        Create create = new Create();
        
        FXMLDocumentController fxml = new FXMLDocumentController();
        
        

        try (BufferedReader br = new BufferedReader(new FileReader(pathIn))) {

            String line;
            br.readLine();
            
            while ((line = br.readLine()) != null) {

                locais = new Locais();
                String[] info = line.split(";");
                
                locais.setCodigo(Integer.parseInt(info[0]));
                locais.setMunicipio(info[1]);
                locais.setMicrorregiao(info[2]);
                locais.setEstado(info[3]);
                locais.setRegiao(info[4]);
                locais.setArea(Double.parseDouble(info[5].replace(".", "").replace(",", ".")));
                locais.setPopulacao(Double.parseDouble(info[6].replace(".", "").replace(",", ".")));
                locais.setDomicilios(Double.parseDouble(info[7].replace(".", "").replace(",", ".")));
                locais.setPIBtotal(Double.parseDouble(info[8].replace(".", "").replace(",", ".")));
                locais.setIDH(Double.parseDouble(info[9].replace(".", "").replace(",", ".")));
                locais.setRendaMedia(Double.parseDouble(info[10].replace(".", "").replace(",", ".")));
                locais.setRendaNominal(Double.parseDouble(info[11].replace(".", "").replace(",", ".")));
                locais.setPEA(Double.parseDouble(info[12].replace(".", "").replace(",", ".")));
                locais.setIDHeducacional(Double.parseDouble(info[13].replace(".", "").replace(",", ".")));
                locais.setIDHlongevidade(Double.parseDouble(info[14].replace(".", "").replace(",", ".")));
                
                
                
                create.calcularDensidade(locais);
                create.calcularPIBperCapita(locais);

                
                locaisInfo.add(info);
                municipiosInfo.add(info[1]);
                
            }
            
           for (String[] info : locaisInfo) {
        double area = Double.parseDouble(info[5].replace(".", "").replace(",", "."));
        double populacao = Double.parseDouble(info[6].replace(".", "").replace(",", "."));
        double densidade = populacao / area;

        String[] novoInfo = new String[info.length + 1];
        System.arraycopy(info, 0, novoInfo, 0, info.length);
        novoInfo[info.length] = String.valueOf(densidade);

        locaisInfo.set(locaisInfo.indexOf(info), novoInfo);
    }
           
           for (String[] info : locaisInfo) {
        double pibTotal = (Double.parseDouble(info[8].replace(".", "").replace(",", ".")));
        double populacao = Double.parseDouble(info[6].replace(".", "").replace(",", "."));
        double pibPerCapita = pibTotal / populacao;

        String[] novoInfo = new String[info.length + 1];
        System.arraycopy(info, 0, novoInfo, 0, info.length);
        novoInfo[info.length] = String.valueOf(pibPerCapita);

        locaisInfo.set(locaisInfo.indexOf(info), novoInfo);
    }

        } catch (IOException e) {
            System.out.print("Erro!" + e.getMessage());
        }
        
        
        
        
        salvarInfo();
        
        for (String municipio : municipiosInfo) {
            System.out.println(municipio);
        }    
        
        launch(args);
    }
    
    

    public static void salvarInfo() {

        String pathOut = "C:\\ProjetoIntegrador\\Out\\01.ProjetoIntegrador_BaseMunicipios_Out.csv";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathOut))) {

            for (String[] info : locaisInfo) {
                
                Locais locais = new Locais();
                
                String line = String.join(";", info);
                bw.write(line);
                bw.newLine();
                     
            }

        } catch (IOException e) {
            System.out.print("Erro!" + e.getMessage());
        }
    }
    
}
