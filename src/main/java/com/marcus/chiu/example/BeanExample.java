package com.marcus.chiu.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Random;

/**
 * Created by marcus.chiu on 10/3/16.
 */
public class BeanExample {

    private SmallBeanExample_1 smallBeanExample1;
    private SmallBeanExample_2 smallBeanExample2;
    private SmallBeanExample_3 smallBeanExample3;

    /**
     * @Autowired on properties - replaces setter methods.
     * Spring will automatically assign SmallBeanExample_4 with the passed values or references
     */
    @Autowired
    private SmallBeanExample_4 smallBeanExample_4;

    /**
     * this will be initialized by setter method, if there is a bean definition of type 'SmallBeanExample_5'
     */
    private SmallBeanExample_5 smallBeanExample_5;

    /**
     * just like for smallBeanzexmaple_5
     * If there is a bean definition of type 'SmallBeanExample_6' then Spring will automatically assign
     * this instance variable to that bean.
     * If there is no bean definition of this type, then do nothing.
     */
    @Autowired(required = false)
    private SmallBeanExample_6 smallBeanExample_6;

    /**
     * When more then one bean definition of the same type, use the
     * @Qualifier along with @Autowired to specify which bean you are using by 'id'
     */
    @Autowired
    @Qualifier("bean a") //specifies SmallBeanExample_7 with id = 'bean a'
    private SmallBeanExample_7 smallBeanExample_7a;
    @Autowired
    @Qualifier("bean b") //specifies SmallBeanExample_7 with id = 'bean b'
    private SmallBeanExample_7 smallBeanExample_7b;

    private int randomNumber;
    private String name;

    /**
     * @PostConstruct
     */
    @PostConstruct
    public void init(){
        System.out.println("BeanExample: @PostConstruct method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("BeanExample: @PreDestroy method");
    }

    /**
     * callback method from -servlet.xml bean configuration file
     * called before all the @Autowire stuff
     */
    public void initMethod() {
        System.out.println("BeanExample: " + name + " initMethod");
    }

    /**
     * callback method from -servlet.xml bean configuration file
     */
    public void destroyMethod() {
        System.out.println("BeanExample: " + name + " destroyMethod");
    }

    /**
     * default constructor
     */
    public BeanExample() {
        System.out.println("BeanExample: " + name + " default constructor");
    }

    /**
     *
     * @param smallBeanExample1
     * @param smallBeanExample2
     */
    public BeanExample(SmallBeanExample_1 smallBeanExample1, SmallBeanExample_2 smallBeanExample2) {
        System.out.println("BeanExample: " + name + " constructor");
        this.smallBeanExample1 = smallBeanExample1;
        this.smallBeanExample2 = smallBeanExample2;
    }

    public void setSmallBeanExample1(SmallBeanExample_1 smallBeanExample1) {
        this.smallBeanExample1 = smallBeanExample1;
    }

    public void setSmallBeanExample2(SmallBeanExample_2 smallBeanExample2) {
        this.smallBeanExample2 = smallBeanExample2;
    }

    /**
     * @Autowired on Setter methods - simply replaces and get rids of the
     * <property> or <constructor-arg> element in the XML configuration.
     * Spring will perform 'byType' autowiring.
     * If no bean definition of type 'SmallBeanExample_3' then error will be thrown
     * @param smallBeanExample3
     */
    @Autowired
    public void setSmallBeanExample3(SmallBeanExample_3 smallBeanExample3) {
        System.out.println("BeanExample: " + name + " setSmallBeanExample 3");
        this.smallBeanExample3 = smallBeanExample3;
    }

    /**
     * @Autowired with (required=false) option - do not need to pass any smallBeanExample_5
     * property. default value is true.
     * Spring will not auto call this setter method if there is no bean definition of that
     * type 'SmallBeanExample_5'.
     * @param smallBeanExample_5
     */
    @Autowired(required = false)
    public void setSmallBeanExample_5(SmallBeanExample_5 smallBeanExample_5) {
        System.out.println("BeanExample: " + name + " setSmallBeanExample 5");
        this.smallBeanExample_5 = smallBeanExample_5;
    }

    /**
     * @Required - indicates that the specified bean property must be populated in the xml configuration
     * in this case the 'name' property must be set in xml file if it defines this class as a bean
     * @Required - applies to bean setter methods
     * @param name
     */
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public void setRandomNumber(int randomNumber) {
        Random rand = new Random();
        this.randomNumber = randomNumber;
    }

    public int getRandomNumber() {
        return randomNumber;
    }
}
