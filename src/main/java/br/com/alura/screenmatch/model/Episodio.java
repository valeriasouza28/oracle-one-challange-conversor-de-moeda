package br.com.alura.screenmatch.model;

import br.com.alura.screenmatch.calculos.Classificavel;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Episodio {
    private Integer numeroEpisodio;
    private String titulo;
    private Integer temporada;
    private Double avaliacao;
    private LocalDate dataLancamento;

    public Episodio (Integer numeroTemporada, DadosEpisodio dadosEpisodio) {
        this.temporada = numeroTemporada;
        this.titulo = titulo;
        this.numeroEpisodio = dadosEpisodio.numero();

        try{
            this.dataLancamento = Double.valueOf(dadosEpisodio.dataLancamento());
        }catch(DateTimeParseException ex){
            this.dataLancamento = null;
        }

        try{
            this.avaliacao = Double.valueOf(dadosEpisodio.avaliacao());
        }catch (NumberFormatException ex){
            this.avaliacao = 0.0;
        }
    }

    public Integer getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(Integer numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getTemporada() {
        return temporada;
    }

    public void setTemporada(Integer temporada) {
        this.temporada = temporada;
    }

    public Double getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Double avaliacao) {
        this.avaliacao = avaliacao;
    }

    public LocalDate getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(LocalDate dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    @Override
    public String toString() {
        return "Episodio{" +
                "numeroEpisodio=" + numeroEpisodio +
                ", titulo='" + titulo + '\'' +
                ", temporada=" + temporada +
                ", avaliacao=" + avaliacao +
                ", dataLancamento=" + dataLancamento +
                '}';
    }
}
