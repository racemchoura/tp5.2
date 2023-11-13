package Service;
import Métier.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;
@WebService
public class Banqueservice {
    @WebMethod
    public double conversion(@WebParam double montant) {
        return montant*10.6;
    }
    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code, 0, new Date());
    }
    @WebMethod
    public List<Compte>getComptes(List<Compte> c) {
        return List.of(
                new Compte(1,0, new Date()),
                new Compte(2,0, new Date()),
                new Compte(3,0, new Date())
        );
    }
}
