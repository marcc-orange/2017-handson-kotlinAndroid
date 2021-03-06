package fr.ekito.myweatherapp

data class DailyForecastModel(val forecast: String, val icon: String, val temperatureLow: String, val temperatureHigh: String) {

    /**
     * Business Getter
     */
    val temperatureString = "$temperatureLow°C - $temperatureHigh°C"
}
