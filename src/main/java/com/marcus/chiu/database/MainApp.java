package com.marcus.chiu.database;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by marcus.chiu on 9/29/16.
 */
public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringModule.xml");

        UserDaoJdbc userDaoJdbc = (UserDaoJdbc) context.getBean("userDaoJdbc");

        /*System.out.println("------Records Creation--------" );
        userDaoJdbc.create("Zara", 11);
        userDaoJdbc.create("Nuha", 2);
        userDaoJdbc.create("Ayan", 15);*/

        System.out.println("------Listing Multiple Records--------" );
        List<User> users = userDaoJdbc.listUsers();
        for (User userRecord : users) {
            System.out.print("ID : " + userRecord.getId() );
            System.out.print(", Name : " + userRecord.getName() );
            System.out.println(", Age : " + userRecord.getAge());
        }

        System.out.println("----Updating Record with ID = 2 -----" );
        userDaoJdbc.update(2, 20);

        System.out.println("----Listing Record with ID = 2 -----" );
        User user = userDaoJdbc.getUser(2);
        System.out.print("ID : " + user.getId() );
        System.out.print(", Name : " + user.getName() );
        System.out.println(", Age : " + user.getAge());
    }
}
