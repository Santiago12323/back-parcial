# back-parcial


## este back implementa 

http://api.weatherapi.com/v1/current.json?key=83ec500b1d684130b61144058252207&q=Colombia&aqi=yes


## la cual es una api de clima

utilizamos retrofit para traer la peticiones 

en un json 

{
"last_updated_epoch": 1753199100,
"last_updated": "2025-07-22 10:45",
"temp_c": 16.4,
"temp_f": 61.5,
"is_day": 1,
"condition": {
"text": "Partly cloudy",
"icon": "//cdn.weatherapi.com/weather/64x64/day/116.png",
"code": 1003
},
"wind_mph": 2.7,
"wind_kph": 4.3,
"wind_degree": 120,
"wind_dir": "ESE",
"pressure_mb": 1028.0,
"pressure_in": 30.36,
"precip_mm": 0.25,
"precip_in": 0.01,
"humidity": 77,
"cloud": 50,
"feelslike_c": 16.4,
"feelslike_f": 61.5,
"windchill_c": 15.2,
"windchill_f": 59.3,
"heatindex_c": 15.2,
"heatindex_f": 59.3,
"dewpoint_c": 10.4,
"dewpoint_f": 50.7,
"vis_km": 10.0,
"vis_miles": 6.0,
"uv": 3.8,
"gust_mph": 3.2,
"gust_kph": 5.1
}


y por eso ya mapeamos todo para que veamos bien este maneja una arquiitectura 
hexagonal y hacer bien todo por los principios solid 

al hacer la peticion

![img_1.png](img_1.png)

sale

![img.png](img.png)

y en el front 

![img_2.png](img_2.png) se ve todo y asi trae la peticion



