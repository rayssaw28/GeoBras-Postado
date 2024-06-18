package geobras;

import static geobras.GeoBras.locaisInfo;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import geobras.entities.Create;
import geobras.entities.EditarInfo;
import geobras.entities.Locais;
import geobras.entities.getInfoTotal;
import geobras.entities.ordenarPosicoes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

    


/**
 *
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 */
public class FXMLDocumentController implements Initializable {

    Create create = new Create();
    Locais locais = new Locais();
    GeoBras geobras = new GeoBras();
    EditarInfo editarInfo = new EditarInfo();

    @FXML
    private Label label;
    
     @FXML
    private Label resultadoPib;

    @FXML
    private ComboBox<String> caixaPesquisa;

    @FXML
    private TextField codigoPesquisa;

    @FXML
    private Label infoLabel;

    @FXML
    private Label labelHoraAtual;

    @FXML
    private Label codigoMunicipio;

    @FXML
    private TextField microrregiao;

    @FXML
    private TextField estado;

    @FXML
    private TextField regiao;

    @FXML
    private TextField area;

    @FXML
    private TextField populacao;

    @FXML
    private TextField domicilios;

    @FXML
    private TextField pibTotal;

    @FXML
    private TextField idh;

    @FXML
    private TextField rendaMedia;

    @FXML
    private TextField rendaNominal;

    @FXML
    private TextField pea;

    @FXML
    private TextField idhEducacional;

    @FXML
    private TextField idhLongevidade;

    @FXML
    private TextField densidadeDemografica;

    @FXML
    private TextField pibPerCapita;

    @FXML
    private BarChart<String, Number> barChart;

    @FXML
    private void btnClassificacaoIdhEducacional(ActionEvent event) {
        create.ClassificacaoIdhEducacional();
    }

    @FXML
    private void handleEditarPopulacao(ActionEvent event) {
        editarInfo.editarPopulacao();
    }

    @FXML
    private void handleGetMunicipio() {
        String municipio = locais.getMunicipio();
    }

    @FXML
    public void handleAtualizarHora() {
        LocalDateTime instante = LocalDateTime.now();
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String horaAtual = instante.format(fmt);

        if (horaAtual != null) {
            labelHoraAtual.setText("Última atualização: " + horaAtual);
        } else {
            labelHoraAtual.setText("Hora da última atualização não encontrada.");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        caixaPesquisa.getItems().addAll(GeoBras.getMunicipiosInfo());
        caixaPesquisa.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                barChart.getData().clear();
                System.out.println("Selecionado: " + newValue);
                String infoCodigo = getInfoTotal.getInfoForCodigo(newValue);
                String infoMicrorregiao = getInfoTotal.getInfoForMicrorregiao(newValue);
                String infoEstado = getInfoTotal.getInfoForEstado(newValue);
                String infoRegiao = getInfoTotal.getInfoForRegiao(newValue);
                String infoArea = getInfoTotal.getInfoForArea(newValue);
                String infoPopulacao = getInfoTotal.getInfoForPopulacao(newValue);
                String infoDomicilios = getInfoTotal.getInfoForDomicilios(newValue);
                String infoPIB = getInfoTotal.getInfoForPibTotal(newValue);
                String infoIDH = getInfoTotal.getInfoForIDH(newValue);
                String infoRendaMedia = getInfoTotal.getInfoForRendaMedia(newValue);
                String infoRendaNominal = getInfoTotal.getInfoForRendaNominal(newValue);
                String infoPEA = getInfoTotal.getInfoForPEA(newValue);
                String infoIDHeducacional = getInfoTotal.getInfoForIDHeducacional(newValue);
                String infoIDHlongevidade = getInfoTotal.getInfoForIDHlongevidade(newValue);
                String infoDensidade = getInfoTotal.getInfoForDensidade(newValue);
                String infoPibPerCapita = getInfoTotal.getInfoForPibPerCapita(newValue);

                codigoMunicipio.setText(infoCodigo);
                microrregiao.setText(infoMicrorregiao);
                estado.setText(infoEstado);
                regiao.setText(infoRegiao);
                area.setText(infoArea);
                populacao.setText(infoPopulacao);
                domicilios.setText(infoDomicilios);
                pibTotal.setText(infoPIB);
                rendaMedia.setText(infoRendaMedia);
                rendaNominal.setText(infoRendaNominal);
                pea.setText(infoPEA);
                densidadeDemografica.setText(infoDensidade);
                pibPerCapita.setText(infoPibPerCapita);
               
                

                double idhValue = Double.parseDouble(infoIDH.replace(",", "."));
                double idhEducacionalValue = Double.parseDouble(infoIDHeducacional.replace(",", "."));
                double idhLongevidadeValue = Double.parseDouble(infoIDHlongevidade.replace(",", "."));
                
                try {
                    atualizarGraficoIDH(idhValue, idhEducacionalValue, idhLongevidadeValue);
                } catch (NumberFormatException e) {
                    System.out.println("Erro ao converter os valores: " + e.getMessage());
                }
            }
        });
    }
    
     public static void setTextFieldDouble(TextField txt) {
        txt.textProperty().addListener((obs, oldValue, newValue) -> {
            if (newValue != null && !newValue.matches("\\d*(\\.\\d*)?")) {
                txt.setText(oldValue);
            }
        });
     }

    private void atualizarGraficoIDH(double idhValue, double idhEducacionalValue, double idhLongevidadeValue) {
        XYChart.Series<String, Number> series = new XYChart.Series<>();
        

        series.getData().add(new XYChart.Data<>("IDH", idhValue));
        series.getData().add(new XYChart.Data<>("IDH Educacional", idhEducacionalValue));
        series.getData().add(new XYChart.Data<>("IDH Longevidade", idhLongevidadeValue));

    
        barChart.getData().addAll(series);

        for (XYChart.Data<String, Number> data : series.getData()) {
            String categoria = data.getXValue();
            double valor = data.getYValue().doubleValue();
            String cor = getColorForValue(categoria, valor);
            data.getNode().setStyle("-fx-bar-fill: " + cor + ";");
        }
    }

    private String getColorForValue(String categoria, double valor) {
        if (categoria.equals("IDH")) {
            if (valor < 0.55) {
                return "#BB0600";
            } else if (valor >= 0.55 && valor < 0.70) {
                return "#F5F101";
            } else if (valor >= 0.70 && valor < 0.80) {
                return "#22C936";
            } else if (valor >= 0.80) {
                return "#0093F5";
            }
        } else if (categoria.equals("IDH Educacional") || categoria.equals("IDH Longevidade")) {
            if (valor < 0.55) {
                return "#BB0600";
            } else if (valor >= 0.55 && valor < 0.70) {
                return "#F5F101";
            } else if (valor >= 0.70 && valor < 0.80) {
                return "#22C936";
            } else if (valor >= 0.80) {
                return "#0093F5";
            }
        }
        return "#808080";
    }
}
