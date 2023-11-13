package serveur;


import Service.Banqueservice;
import jakarta.xml.ws.Endpoint;
public class ServeurJWS
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String url="http://localhost:8080/";

        Endpoint.publish(url, new Banqueservice());
        System.out.println("service web publié avec succés à l'url:"+url);
    }

}