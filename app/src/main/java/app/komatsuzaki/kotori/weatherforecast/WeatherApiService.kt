package app.komatsuzaki.kotori.weatherforecast

import retrofit2.http.GET
import retrofit2.http.Path

interface WeatherApiService {
    @GET("city/{cityId}")
    suspend fun getCityWeather(@Path("cityId") cityId: String): WeatherResponse
}