package br.gov.serpro.ScrenMatch2.service;

public interface IconverteDados {
    <T> T obterDados(String json,Class <T> classe);
}
