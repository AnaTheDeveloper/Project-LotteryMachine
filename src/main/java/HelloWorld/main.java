package HelloWorld;

public class main {

  public static void main(String[] args) {
  String poopFace = "Ana";

  // You could manually write Ana each time below but here we saved y name to a new variable which we could then use elsewhere.


    HelloWorldCaller helloWorldCallerAna = new HelloWorldCaller(poopFace);
    helloWorldCallerAna.callsHelloWorld();


    HelloWorldCaller helloWorldCallerLuke = new HelloWorldCaller("Luke");
    helloWorldCallerLuke.callsHelloWorld();
  }

}
