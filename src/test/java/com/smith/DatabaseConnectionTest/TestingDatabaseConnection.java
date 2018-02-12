package com.smith.DatabaseConnectionTest;

import com.smith.DBConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes= DBConfiguration.class)
public class TestingDatabaseConnection {

    @Qualifier("embeddedDatabase")
    @Autowired
    private EmbeddedDatabase dataSource;

    @Test
    public void testFindReagentTable() throws SQLException {
        assertThat(dataSource.getConnection()).isNotNull();
        JdbcTemplate template = new JdbcTemplate(dataSource);
        final List<Map<String, Object>> result = template.queryForList("SELECT * FROM REAGENT");
        assertThat(result).isEmpty();
    }

    @Test
    @Sql("classpath:sql/reagent-test.sql")
    public void testAddReagentToTable() throws SQLException {
        JdbcTemplate template = new JdbcTemplate(dataSource);
        final List<Map<String, Object>> result = template.queryForList("SELECT * FROM REAGENT");
        assertThat(result).isNotEmpty();
    }
}
