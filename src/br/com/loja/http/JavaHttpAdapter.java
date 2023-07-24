package br.com.loja.http;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpAdapter implements HttpAdapter{

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlApi = new URL(url);
            URLConnection openConnection = urlApi.openConnection();
            openConnection.connect();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisição HTTP", e);
        }
    }
}
