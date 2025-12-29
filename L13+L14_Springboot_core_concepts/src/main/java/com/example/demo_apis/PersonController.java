package com.example.demo_apis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@RestController
//@Component
public class PersonController {

    /**
     * These are the 2 pillars of spring boot.
     * IOC - Inversion of Control
     * Phenomenon in which spring boot creates an object for you instead of you creating it by yourself
     * Spring boot doesn't create objects for all the classes, it will create objects for only those classes which have
     * @Component annotation on top of it either directly or indirectly
     *
     * Bean - Java object created by spring boot and not by the programmer / user.
     * Singleton bean - Single object created by spring boot
     * Shared instance - the object created by the spring boot will be used across all the other classes in case there's a need
     *
     * RestController --> Controller  --> Component
     *                    ResponseBody

     * SpringbootApplication --> SpringBootConfiguration --> Configuration --> Component

     * Creating shared instance of singleton bean 'demoApisApplication'
     *
     * @Component - it's a class level annotation which is defined on top of a class denoting spring boot that this
     *              should be a bean on application startup
     * @Bean - it's a method level annotation which is defined on top of a function that returns a specific type of object
     *         again denoting spring boot to create a bean of that on application startup

     * Note: beans which are having singleton scope are created during the application startup.

     * DI - Dependency Injection
     * Phenomenon of injecting / using an already created bean's reference in some other class where it is needed
     * Dependency Injection means getting the reference of an object of some other in your current class' parameter

     * It is incorrect to assume that Spring boot always use the default constructor to create beans.
     * Different ways of autowiring/injection
     * 1. Field injection - use it only for those scenarios when you don't have to work on these fields inside the constructor
     * 2. constructor injection - this can be used in any scenario
     * 3. setter injection - this type of injection is not very useful because it needs a manual push as the setter methods
     *                       are not called implicitly by the constructor or any other entity


     * Sonar Qube / Sonar lint - smells your code and identifies the vulnerabilities, minor and major bugs in the code and creates a report
     *

     * Beans -
     * IOC container -
     * Annotation parsing -
     */

//    @Autowired
    private Person p1;

    private Person p2 = new Person("Jim", "Laker");

    private HashMap<String, Person> persons = new HashMap<>();

    public PersonController() {
        System.out.println("Inside personcontroller default constructor... p1 = " + this.p1);
    }

    public PersonController(Person p1) {

        System.out.println("Inside PersonController constructor.. local p1 = " + p1 + ", global p1 = " + this.p1);
        this.p1 = p1;
        System.out.println("Inside PersonController constructor.. local p1 = " + p1 + ", global p1 = " + this.p1);


        this.persons = new HashMap<>();
//        this.persons.put("1", new Person("Piyush", "Aggarwal"));
//        this.persons.put("2", new Person("Aditya", "Patil"));

    }


    public PersonController(@Value("${dummy.prop}") int a) { // Integer a = new Integer(10)
        System.out.println("Inside 2nd parametrized constructor a = " + a + ", p1 = " + this.p1 + ", p2 = " + this.p2);
//        p1.setFirstName("Piyush");
    }

    public void setPerson(Person person){
        this.p1 = person;
    }

    @GetMapping("/person/all")
    public List<Person> getAll(){
        System.out.println("Inside all method, thread - " + Thread.currentThread());
        System.out.println("Person p1 = " + this.p1 + ", person p2 = " + this.p2);
        return persons.values().stream().collect(Collectors.toList());
    }

    // com.example.demo_apis.Person@5a2f016d
    // com.example.demo_apis.Person@5a2f016d

    /**
     * 2025-12-27 21:04:50.573 DEBUG 27222 --- [           main] _.s.web.servlet.HandlerMapping.Mappings  :
     * 	c.e.d.PersonController:
     * 	    {GET [/person/all]}: getAll()
     * 2025-12-27 21:04:50.590 DEBUG 27222 --- [           main] _.s.web.servlet.HandlerMapping.Mappings  :
     * 	o.s.b.a.w.s.e.BasicErrorController:
     *    { [/error], produces [text/html]}: errorHtml(HttpServletRequest,HttpServletResponse)
     *    { [/error]}: error(HttpServletRequest)
     */

}
