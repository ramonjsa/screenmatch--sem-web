package br.gov.serpro.ScrenMatch2;

import br.gov.serpro.ScrenMatch2.model.DadosSerie;
import br.gov.serpro.ScrenMatch2.service.ConsumoApi;
import br.gov.serpro.ScrenMatch2.service.ConverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScrenMatch2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScrenMatch2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("funfou");
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=6585022c");
		System.out.println(json);
		ConverteDados conversor = new ConverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		System.out.println(dados);
	}
}
