package org.example;

import org.example.calci.Calculator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /**
         * When you buid a project using Maven, there are 2 directories created, one is main, another one is test
         * In main, you write all your source code, and in test directory, you should write all your test cases
         */

        /**
         * What's the need for Maven ?
         * How Maven resolves all the dependencies, i.e what all repositories exist in Maven
         * Lifecycle / Phases of Maven -  all the phases or lifecycles are sequential i.e if you run mvn test, all the phases starting from validate till test will run
         *  1. clean - deletes the target folder
         *  2. validate - validates the pom.xml file whether it has he groupId, artifactId etc.
         *  3. compile - compiles all the code written in the main directory, downloads any dependency if needed
         *  4. test - compiles all the code written in the test directory, it also runs all the unit test cases in your test directory
         *  5. package - generates a jar / war file in the target folder which can be used for deployment purposes or
         *               can be used for making the current project a dependency in some other project
         *  6. verify - validates whether a jar file is present in the target folder or not
         *  7. install - installs / copies the project in your local m2 repository
         *  8. site - this is used to generate the documentation of your project, under target/site folder
         *  9. deploy - this is used to deploy / push your artifact (your project's jar) in a remote repo
         */

        /**
         * When you install intellij, maven comes pre-bundled with the IDE, i.e you can run any mvn command inside the IDE
         */

        /**
         * Plugin is an entity which does the actual work
         * Every plugin has some goals to achieve.
         * for example clean plugin has 2 goals
         * 1. clean:clean
         * 2. clean:help
         *
         * Direct relationship b/w a lifecycle and a plugin.
         * For example: for clean phase, a clean plugin would be executed.
         */

        /**
         * Archetype is a combination of groupId, artifactId and version
         */


        Calculator calculator = new Calculator();
        System.out.println(calculator.add(3, 4));
        System.out.println(calculator.pow(2, 10));
    }
}