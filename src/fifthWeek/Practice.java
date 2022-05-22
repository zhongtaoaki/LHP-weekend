package fifthWeek;

public class Practice {
    public static void main(String[] args) {

        Country[] countries = new Country[4];
        countries[0] = new Country("China", "Beijing");
        countries[1] = new Country("Japan", "Tokyo");
        countries[2] = new Country("USA", "Washington DC");
        countries[3] = new Country("UK", "London");
        for (Country country : countries) {
            System.out.println(country);
            //System.out.println(country.toString());
        }
        // China: Beijing
        // Japan: Tokyo
        // USA: Washington DC
        // UK: London

    }
}

class Country {

    private String country;
    private String capital;

    public Country(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "Country [capital=" + capital + ", country=" + country + "]";
    }

}
