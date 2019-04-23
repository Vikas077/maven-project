/*This is sample package*/

package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
  System.out.println("Welcome");

  }

  //TODO: Add javadoc comment
  public final String greet(String someone) {
    System.out.println("My Job : Jenkins BUILD");
    return String.format("Hello, %s!", someone);
  }
}
