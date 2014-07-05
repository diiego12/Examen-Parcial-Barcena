package com.diego.model;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

public class ControladorExamen {

@Controller
@RequestMapping("/servicio-calificaciones")
public class Controller{

 @RequestMapping(value="/calificaciones", method=RequestMethod.GET, headers=("Accept=Annotation/json"))  

@ResponseBody ArrayList<Evaluacion> exam(){
    return ArrayList<Evaluacion>.generarCalificaciones();
    
                }
        }

}

