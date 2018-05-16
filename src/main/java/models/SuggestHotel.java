package models;

import java.util.ArrayList;
import java.util.List;

/**
 * Модель ответов запроса suggestRequest
 * @author Oksana Nezlobina <nez_oksana@mail.ru>
 */
public class SuggestHotel {

    private String error;
    private List<Result> result;

    public SuggestHotel(){
    }

    public SuggestHotel(String error, List<Result> result) {
        this.error = error;
        this.result = result;
    }

    @Override
    public String toString() {
        return "SuggestHotel{" +
                "error='" + error + '\'' +
                ", result=" + result +
                '}';
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static  class Result {

        private Integer id;
        private Integer city_id;
        private String timezone;
        private Integer timezone_gmt;
        private String name;
        private String name_orig;
        private String name_ascii;
        private String city_slug;
        private Integer lat;
        private Integer lng;
        private Integer hotels;
        private Integer population;
        private String fcode;
        private String type;
        private String country_code;
        private String country_slug;
        private String currency;
        private String stars;
        private String country;
        private String admin1code;
        private String admin2code;
        private ArrayList<Integer> map_view;
        private String city_img;
        private String src;
        private Integer rel;
        private String iata;

        public Result(Integer id, Integer city_id, String timezone, Integer timezone_gmt, String name, String name_orig, String name_ascii, String city_slug, Integer lat, Integer lng, Integer hotels, Integer population, String fcode, String type, String country_code, String country_slug, String currency, String stars, String country, String admin1code, String admin2code, ArrayList<Integer> map_view, String city_img, String src, Integer rel, String iata) {
            this.id = id;
            this.city_id = city_id;
            this.timezone = timezone;
            this.timezone_gmt = timezone_gmt;
            this.name = name;
            this.name_orig = name_orig;
            this.name_ascii = name_ascii;
            this.city_slug = city_slug;
            this.lat = lat;
            this.lng = lng;
            this.hotels = hotels;
            this.population = population;
            this.fcode = fcode;
            this.type = type;
            this.country_code = country_code;
            this.country_slug = country_slug;
            this.currency = currency;
            this.stars = stars;
            this.country = country;
            this.admin1code = admin1code;
            this.admin2code = admin2code;
            this.map_view = map_view;
            this.city_img = city_img;
            this.src = src;
            this.rel = rel;
            this.iata = iata;
        }

        public Result(){
        }

        @Override
        public String toString() {
            return "Result{" +
                    "id=" + id +
                    ", city_id=" + city_id +
                    ", timezone='" + timezone + '\'' +
                    ", timezone_gmt=" + timezone_gmt +
                    ", name='" + name + '\'' +
                    ", name_orig='" + name_orig + '\'' +
                    ", name_ascii='" + name_ascii + '\'' +
                    ", city_slug='" + city_slug + '\'' +
                    ", lat=" + lat +
                    ", lng=" + lng +
                    ", hotels=" + hotels +
                    ", population=" + population +
                    ", fcode='" + fcode + '\'' +
                    ", type='" + type + '\'' +
                    ", country_code='" + country_code + '\'' +
                    ", country_slug='" + country_slug + '\'' +
                    ", currency='" + currency + '\'' +
                    ", stars='" + stars + '\'' +
                    ", country='" + country + '\'' +
                    ", admin1code='" + admin1code + '\'' +
                    ", admin2code='" + admin2code + '\'' +
                    ", map_view=" + map_view +
                    ", city_img='" + city_img + '\'' +
                    ", src='" + src + '\'' +
                    ", rel=" + rel +
                    ", iata='" + iata + '\'' +
                    '}';
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public Integer getCity_id() {
            return city_id;
        }

        public void setCity_id(Integer city_id) {
            this.city_id = city_id;
        }

        public String getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = timezone;
        }

        public Integer getTimezone_gmt() {
            return timezone_gmt;
        }

        public void setTimezone_gmt(Integer timezone_gmt) {
            this.timezone_gmt = timezone_gmt;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName_orig() {
            return name_orig;
        }

        public void setName_orig(String name_orig) {
            this.name_orig = name_orig;
        }

        public String getName_ascii() {
            return name_ascii;
        }

        public void setName_ascii(String name_ascii) {
            this.name_ascii = name_ascii;
        }

        public String getCity_slug() {
            return city_slug;
        }

        public void setCity_slug(String city_slug) {
            this.city_slug = city_slug;
        }

        public Integer getLat() {
            return lat;
        }

        public void setLat(Integer lat) {
            this.lat = lat;
        }

        public Integer getLng() {
            return lng;
        }

        public void setLng(Integer lng) {
            this.lng = lng;
        }

        public Integer getHotels() {
            return hotels;
        }

        public void setHotels(Integer hotels) {
            this.hotels = hotels;
        }

        public Integer getPopulation() {
            return population;
        }

        public void setPopulation(Integer population) {
            this.population = population;
        }

        public String getFcode() {
            return fcode;
        }

        public void setFcode(String fcode) {
            this.fcode = fcode;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCountry_code() {
            return country_code;
        }

        public void setCountry_code(String country_code) {
            this.country_code = country_code;
        }

        public String getCountry_slug() {
            return country_slug;
        }

        public void setCountry_slug(String country_slug) {
            this.country_slug = country_slug;
        }

        public String getCurrency() {
            return currency;
        }

        public void setCurrency(String currency) {
            this.currency = currency;
        }

        public String getStars() {
            return stars;
        }

        public void setStars(String stars) {
            this.stars = stars;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getAdmin1code() {
            return admin1code;
        }

        public void setAdmin1code(String admin1code) {
            this.admin1code = admin1code;
        }

        public String getAdmin2code() {
            return admin2code;
        }

        public void setAdmin2code(String admin2code) {
            this.admin2code = admin2code;
        }

        public ArrayList<Integer> getMap_view() {
            return map_view;
        }

        public void setMap_view(ArrayList<Integer> map_view) {
            this.map_view = map_view;
        }

        public String getCity_img() {
            return city_img;
        }

        public void setCity_img(String city_img) {
            this.city_img = city_img;
        }

        public String getSrc() {
            return src;
        }

        public void setSrc(String src) {
            this.src = src;
        }

        public Integer getRel() {
            return rel;
        }

        public void setRel(Integer rel) {
            this.rel = rel;
        }

        public String getIata() {
            return iata;
        }

        public void setIata(String iata) {
            this.iata = iata;
        }
    }
}
