import Imersao_Java.controller.Connection;

/* 
        get data IMDB
        connection HTTP
        extract data interesting
        show and manipulate data   
    */

/**
 * @author Alberto Rocha Pinalli
 */

public class App {

  public static void main(String[] args) throws Exception {
    Connection conn = new Connection();
    conn.connection();
  }
}
