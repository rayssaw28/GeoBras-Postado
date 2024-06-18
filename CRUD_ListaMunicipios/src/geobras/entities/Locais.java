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

/**
 * @author Rayssa Alves <rayssaalves.go@gmail.com>
 * @date 04/06/2024
 * @brief Class Municipios
 */
public class Locais {

private int codigo;
private String municipio, microrregiao, estado, regiao;
private Double area, populacao, domicilios, PIBtotal, IDH, rendaMedia, rendaNominal, PEA, IDHeducacional, IDHlongevidade, densidade, PIBperCapita;

    public Locais() {
    }

    public Locais(int codigo, String municipio, String microrregiao, String estado, String regiao, Double area, Double populacao, Double domicilios, Double PIBtotal, Double IDH, Double rendaMedia, Double rendaNominal, Double PEA, Double IDHeducacional, Double IDHlongevidade, Double densidade, Double PIBperCapita) {
        this.codigo = codigo;
        this.municipio = municipio;
        this.microrregiao = microrregiao;
        this.estado = estado;
        this.regiao = regiao;
        this.area = area;
        this.populacao = populacao;
        this.domicilios = domicilios;
        this.PIBtotal = PIBtotal;
        this.IDH = IDH;
        this.rendaMedia = rendaMedia;
        this.rendaNominal = rendaNominal;
        this.PEA = PEA;
        this.IDHeducacional = IDHeducacional;
        this.IDHlongevidade = IDHlongevidade;
        this.densidade = densidade;
        this.PIBperCapita = PIBperCapita;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getMicrorregiao() {
        return microrregiao;
    }

    public void setMicrorregiao(String microrregiao) {
        this.microrregiao = microrregiao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Double populacao) {
        this.populacao = populacao;
    }

    public Double getDomicilios() {
        return domicilios;
    }

    public void setDomicilios(Double domicilios) {
        this.domicilios = domicilios;
    }

    public Double getPIBtotal() {
        return PIBtotal;
    }

    public void setPIBtotal(Double PIBtotal) {
        this.PIBtotal = PIBtotal;
    }

    public Double getIDH() {
        return IDH;
    }

    public void setIDH(Double IDH) {
        this.IDH = IDH;
    }

    public Double getRendaMedia() {
        return rendaMedia;
    }

    public void setRendaMedia(Double rendaMedia) {
        this.rendaMedia = rendaMedia;
    }

    public Double getRendaNominal() {
        return rendaNominal;
    }

    public void setRendaNominal(Double rendaNominal) {
        this.rendaNominal = rendaNominal;
    }

    public Double getPEA() {
        return PEA;
    }

    public void setPEA(Double PEA) {
        this.PEA = PEA;
    }

    public Double getIDHeducacional() {
        return IDHeducacional;
    }

    public void setIDHeducacional(Double IDHeducacional) {
        this.IDHeducacional = IDHeducacional;
    }

    public Double getIDHlongevidade() {
        return IDHlongevidade;
    }

    public void setIDHlongevidade(Double IDHlongevidade) {
        this.IDHlongevidade = IDHlongevidade;
    }

    public Double getDensidade() {
        return densidade;
    }

    public void setDensidade(Double densidade) {
        this.densidade = densidade;
    }

    public Double getPIBperCapita() {
        return PIBperCapita;
    }

    public void setPIBperCapita(Double PIBperCapita) {
        this.PIBperCapita = PIBperCapita;
    }  
    
    
     @Override
    public String toString() {
        return "Locais{" +
                "codigo=" + codigo +
                ", municipio='" + municipio + '\'' +
                ", microrregiao='" + microrregiao + '\'' +
                ", estado='" + estado + '\'' +
                ", regiao='" + regiao + '\'' +
                ", area=" + area +
                ", populacao=" + populacao +
                ", domicilios=" + domicilios +
                ", PIBtotal=" + PIBtotal +
                ", IDH=" + IDH +
                ", rendaMedia=" + rendaMedia +
                ", rendaNominal=" + rendaNominal +
                ", PEA=" + PEA +
                ", IDHeducacional=" + IDHeducacional +
                ", IDHlongevidade=" + IDHlongevidade +
                '}';
    }
    
}
