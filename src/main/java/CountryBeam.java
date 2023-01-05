import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Named
@RequestScoped
public class CountryBeam {

    public List<Country> getCountries() {

        try (
                Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/gapminder?user=root&password=");
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM gapminder")
        ) {
            ArrayList<Country> countries = new ArrayList<>();

            while (resultSet.next()) {
                countries.add(new Country(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getInt(4),
                        resultSet.getDouble(5),
                        resultSet.getInt(6)
                ));
            }
            return countries;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
