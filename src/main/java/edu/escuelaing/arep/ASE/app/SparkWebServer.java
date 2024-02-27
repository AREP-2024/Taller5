package edu.escuelaing.arep.ASE.app;

import static spark.Spark.port;
import static spark.Spark.get;



public class SparkWebServer {

    Calculadora calculadora = new Calculadora();
    public static void main(String... args){
        port(getPort());
        get("hello", (req,res) -> "Hello Docker!");

        get("sin", (req,res)->{
            return calculadora.operar("sin", Double.parseDouble(req.queryParams("num")));

        });

        get("cos", (req, res)->{
        

        });
  }

  private static int getPort() {
      if (System.getenv("PORT") != null) {
          return Integer.parseInt(System.getenv("PORT"));
      }
      return 4567;
  }
}
