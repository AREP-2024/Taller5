package edu.escuelaing.arep.ASE.app;

import static spark.Spark.port;
import static spark.Spark.staticFileLocation;
import static spark.Spark.get;



public class SparkWebServer {

    
    public static void main(String... args){
        Calculadora calculadora = new Calculadora();
        Palindrome palindrome = new Palindrome();
        port(getPort());
        staticFileLocation("/public");
        get("/hello", (req,res) -> "Hello Docker!");

        get("/sin", (req,res)->{
            return calculadora.operar("sin", Double.parseDouble(req.queryParams("num")));

        });

        get("/cos", (req, res)->{
            return calculadora.operar("cos", Double.parseDouble(req.queryParams("num")));
        });

        get("/palindrome", (req,res)->{
            return palindrome.esPalindrome(req.queryParams("cadena"))?"Es palindrome":"No es palindrome";
        });

        get("/magnitud",(req,res)->{
            return calculadora.magnitudVectorial(
                    Double.parseDouble(req.queryParams("x")), 
                    Double.parseDouble(req.queryParams("y"))
            );
        });
  }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 4567;
  }
}
