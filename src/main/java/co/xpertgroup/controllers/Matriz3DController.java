package co.xpertgroup.controllers;


import co.xpertgroup.services.Matriz3DService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class Matriz3DController {

    @RequestMapping(value = "/matriz-3d/update", method = RequestMethod.POST)
    public String update(@RequestBody Map<String, String> body) {

        int x = Integer.parseInt(body.get("x"));
        int y = Integer.parseInt(body.get("y"));
        int z = Integer.parseInt(body.get("z"));
        int value = Integer.parseInt(body.get("value"));



        Matriz3DService objMatriz = new Matriz3DService();

        try {
            if (objMatriz.updateMatriz(x,y,z,value)) {
                return "Update Successfully";

            } else {
                return "Update Error";
            }

        }
        catch(Exception e) {
            return "Update Error";
        }
    }


    @RequestMapping(value = "/matriz-3d/query", method = RequestMethod.POST)
    public String query(@RequestBody Map<String, String> body) {

        int x = Integer.parseInt(body.get("x"));
        int y = Integer.parseInt(body.get("y"));
        int z = Integer.parseInt(body.get("z"));
        int x2 = Integer.parseInt(body.get("x2"));
        int y2 = Integer.parseInt(body.get("y2"));
        int z2 = Integer.parseInt(body.get("z2"));

        Matriz3DService objMatriz = new Matriz3DService();

        try {
            int sumTotal = objMatriz.queryMatriz(x,y,z,x2,y2,z2);

            return "la suma toltal es: " +sumTotal;

        }
        catch(Exception e) {
            return "Update Error";
        }
    }

}