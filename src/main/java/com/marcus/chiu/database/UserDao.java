package com.marcus.chiu.database;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by marcus.chiu on 9/29/16.
 */
public interface UserDao {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);
    /**
     * This is the method to be used to create
     * a record in the User table.
     */
    public void create(String name, Integer age);
    /**
     * This is the method to be used to list down
     * a record from the Student table corresponding
     * to a passed user id.
     */
    public User getUser(Integer id);
    /**
     * This is the method to be used to list down
     * all the records from the User table.
     */
    public List<User> listUsers();
    /**
     * This is the method to be used to delete
     * a record from the User table corresponding
     * to a passed student id.
     */
    public void delete(Integer id);
    /**
     * This is the method to be used to update
     * a record into the User table.
     */
    public void update(Integer id, Integer age);
}
