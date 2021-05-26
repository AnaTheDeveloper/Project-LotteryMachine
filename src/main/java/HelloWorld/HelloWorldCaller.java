package HelloWorld;

public class HelloWorldCaller {

String name;

  public HelloWorldCaller(String name) {
    this.name = name;
  }

  public void callsHelloWorld() {

    System.out.println("Hello world " + name);
  }

}
