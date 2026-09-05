package day14;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class HikariConnectionPoolMarch2026 {
	private static HikariDataSource dataSource;

    static {
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl( "jdbc:mysql://localhost:3306/itpmarch2026db");
        config.setUsername("root");
        config.setPassword("");

        config.setMaximumPoolSize(10);  // Max connections at a time
        config.setMinimumIdle(3);       // Keep 2 idle connections ready
        config.setConnectionTimeout(30000); // Wait 30 seconds for a connection

        dataSource = new HikariDataSource(config);
    }

    public static HikariDataSource getDataSource() {
        return dataSource;
    }
}
