package fr.ekito.myweatherlibrary.json.geocode

fun Geocode.getLocation() = results.firstOrNull()?.geometry?.location
