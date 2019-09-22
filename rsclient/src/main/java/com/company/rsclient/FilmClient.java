package com.company.rsclient;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.client.ClientConfig;

import com.company.xdevcon1.dto.Film;

public class FilmClient {
	
	public String getFilmAsString(Integer id) {

		Client client = ClientBuilder.newClient(new ClientConfig());

		Response entity = client
				.target("http://localhost:8080/")
				.path("xdevcon1/basic4/" + id)
				.request(MediaType.APPLICATION_XML)
				.get();

		return entity.readEntity(String.class);
	}
	
	public Film getFilm(Integer id) {

		Client client = ClientBuilder.newClient(new ClientConfig());

		Film entity = client
				.target("http://localhost:8080/")
				.path("xdevcon1/basic4/" + id)
				.request(MediaType.APPLICATION_XML)
				.get(Film.class);

		return entity;
	}

	public Response deleteFilm(Integer id) {

		Client client = ClientBuilder.newClient(new ClientConfig());

		Response response = client
				.target("http://localhost:8080/")
				.path("xdevcon1/basic4/" + id)
				.request()
				.delete();

		return response;
	}

	public final static void main(String args[]) {
		System.out.println(new FilmClient().getFilmAsString(6));
		
	}
}