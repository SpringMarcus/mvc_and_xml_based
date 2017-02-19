package com.marcus.chiu.database;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by marcus.chiu on 9/29/16.
 */
public class UserDaoJdbc implements UserDao {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplateObject;

    public void initMethod() {
        System.out.println("UserDaoJdbc: initMethod");
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
        System.out.println("UserDaoJdbc: assigned JdbcTemplate");
    }

    public void setDataSource(DataSource ds) {
        this.dataSource = ds;
        this.jdbcTemplateObject = new JdbcTemplate(dataSource);
    }

    public void create(String name, Integer age) {
        String stmt = "insert into User (name, age) values (? , ?)";

        jdbcTemplateObject.update(stmt, name, age);
        System.out.println("created record name = " + name + " age = " + age);
        return;
    }

    public User getUser(Integer id) {
        String query = "select * from User where id = ?";
        User user = jdbcTemplateObject.queryForObject(query, new Object[]{id}, new UserMapper());

        return user;
    }

    public List<User> listUsers() {
        String query = "select * from User";
        List <User> users = jdbcTemplateObject.query(query, new UserMapper());
        return users;
    }

    public void delete(Integer id) {
        String stmt = "delete from Student where id = ?";
        jdbcTemplateObject.update(stmt, id);
        System.out.println("deleted record with id = " + id);
        return;
    }

    public void update(Integer id, Integer age) {
        String stmt = "update Student set age = ? where id = ?";
        jdbcTemplateObject.update(stmt, age, id);
        System.out.println("Update record with id = " + id);
    }
}
