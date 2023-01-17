package ufv.extraordinaria.dis.ptb.Controllers;

import org.springframework.web.bind.annotation.*;
import ufv.extraordinaria.dis.ptb.Clases.DatosTwitter;
import ufv.extraordinaria.dis.ptb.DBtwitter;
import ufv.extraordinaria.dis.ptb.DBtwitterManager;

import java.util.ArrayList;

public class DatosTwitterController {

    private final String path = "/twitter"; // ruta para acceder a los datos de las zonas básicas de salud
    private DBtwitter db = new DBtwitter(); //creo un objeto de la clase DBtwitter

    @GetMapping(path)
    //método para leer los datos de las zonas básicas de salud de la base de datos y devolverlos al Frontend
    public ArrayList<DatosTwitter> readDatos() { //Devuelve la lista de twitter
        DBtwitterManager dbmgr = new DBtwitterManager(); // creo un objeto de la clase DBtwitterManger
        db = dbmgr.readDB(); // leo la base de datos
        return db.getDatos(); // devuelvo los datos
    }
/*
    @PostMapping(path)
    public String crearZona(@RequestBody DatosTwitter dz) {
        DBtwitterManager dbmgr = new DBtwitterManager(); //  creo un objeto de la clase DBtwitterManger
        db = dbmgr.readDB(); // leo la base de datos
        try {
            for (int i = 0; i < db.getDatos().size(); i++) { // recorro la lista de datos de los tweets
                if (db.getDatos().get(i).getId().equals(dz.getId())) { // si el código de ID ya existe en la base de datos
                    return "Error! \n Código ID ya existe.";
                }
            }
        } catch (Exception exception) {
        }

        String id = db.getDatos().get(db.getDatos().size() - 1).getId(); // obtengo el id del último elemento de la lista
        int idInt = Integer.parseInt(id); // lo convierto a entero
        idInt++; // le sumo 1
        id = idInt; // lo convierto a String
        int count = countDigits(idInt); // cuento los dígitos del código de geometría
        while (count < 1) { // mientras el número de dígitos sea menor que 3
            id = "0" + id; // le añado un 0 delante
            count++; // incremento el contador
        }
        dz.setId(id); // le asigno el nuevo id al objeto dz

        db.getDatos().add(dz); // añado el objeto dz a la lista de datos de twitter
        dbmgr.saveDB(db); // guardo la base de datos
        return "Zona básica con código " + dz.getId() + " añadido a la base de datos";
    }

    public static int countDigits(int number) {
        int count = 0; // creo un contador
        while (number != 0) { // mientras el número sea distinto de 0
            number /= 10; // divido el número entre 10
            count++; // incremento el contador
        }
        return count; // devuelvo el contador
    }

    @DeleteMapping(path)
    public String eliminar(@RequestBody String id) {
        DBtwitterManager dbmgr = new DBtwitterManager(); // creo un objeto de la clase DBtwitterManager
        db = dbmgr.readDB(); // leo la base de datos
        for (int i = 0; i < db.getDatos().size(); i++) {
            //Escribe por consola que no encuentra el id
            System.out.println("El id que recibe es: " + id);
            System.out.println("El id de la base de datos es: " + db.getDatos().get(i).getId());
            // if que compare el id que recibe con el id de la base de datos
            if (db.getDatos().get(i).getId().equals(id)) { //comparo los datos
                // Imprime el dato que se va a eliminar
                System.out.println("El dato que se va a eliminar es: " + db.getDatos().get(i).getFecha());
                db.getDatos().remove(i); // elimino el dato con ese id
                dbmgr.saveDB(db); // guardo la base de datos
                break;
            }
        }
        return "Error! \n Zona básica con código geometría " + id + " no existe.";
    }
*/
}


