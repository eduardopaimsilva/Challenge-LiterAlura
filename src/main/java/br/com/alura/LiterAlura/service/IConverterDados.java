package br.com.alura.LiterAlura.service;

public interface IConverterDados {

    <T> T obterDados(String json, Class<T> classe);

}
