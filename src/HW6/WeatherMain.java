package HW6;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import java.io.IOException;
import java.util.Objects;

public class WeatherMain {
    public static void main(String[] args) throws IOException {
         OkHttpClient client = new OkHttpClient();

        // Построение URL по частям
        HttpUrl url = new HttpUrl.Builder()
                .scheme("http")
                .host("dataservice.accuweather.com")
                .addPathSegment("forecasts")
                .addPathSegment("v1")
                .addPathSegment("daily")
                .addPathSegment("5day")
                .addPathSegment("474212_PC")
                .addQueryParameter("apikey", "WpT1CUOAi8DTAo1CLQggYRukcDhMQMdp")
                .addQueryParameter("language", "ru-ru")
                .addQueryParameter("metric", "true")
                .build();

        // Создаем экземпляр запроса
        Request requesthttp = new Request.Builder()
                .url(url)
                .build();
        // Обрабатываем ответ
        String jsonResponse = Objects.requireNonNull(client.newCall(requesthttp).execute().body()).string();
        System.out.println(jsonResponse);
    }
}
