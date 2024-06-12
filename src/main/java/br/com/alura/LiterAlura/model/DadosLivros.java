package br.com.alura.LiterAlura.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public record DadosLivros(@JsonAlias("title") String titulo,
                          @JsonAlias("authors")  String autor,
                          @JsonAlias("languages") String idioma,
                          @JsonAlias("download_count") Integer numeroDownloads) {
}
