package de.varoplugin.banapi;

import java.util.function.Consumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.varoplugin.banapi.request.RequestFailedException;

public final class BanApi {

	private static final String DEFAULT_URL = "https://varoplugin.de/banapi/";

	private final String url;
	private final String token;
	private final Consumer<RequestFailedException> exceptionHandler;
	private final Gson gson;

	public BanApi(String url, String token, Consumer<RequestFailedException> exceptionHandler) {
		this.url = url == null ? DEFAULT_URL : url;
		this.token = token;
		this.exceptionHandler = exceptionHandler;
		this.gson = new GsonBuilder().setPrettyPrinting().create();
	}

	public BanApi(Consumer<RequestFailedException> exceptionHandler) {
		this(null, null, exceptionHandler);
	}

	public BanApi() {
		this(null, null, null);
	}

	public String getURL() {
		return url;
	}

	public String getToken() {
		return token;
	}

	public Consumer<RequestFailedException> getExceptionHandler() {
		return exceptionHandler;
	}

	public Gson getGson() {
		return gson;
	}
}