/*package com.example.practica.controller;

import com.example.practica.dto.UsuarioRequest;
import com.example.practica.entity.Rol;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("api/usuarios")
public class UsuarioWebController {


    @GetMapping("/nuevo")
    public String mostrarFormulario(Model model) {
        model.addAttribute("usuario", new UsuarioRequest());
        return "usuarios/form";
    }

   /* @PostMapping("/guardar")
    public String guardarUsuario(@ModelAttribute("usuario") UsuarioRequest request) {

        Rol r = new Rol();
        r.setNombre(request.getNombre());
        service.crearUsuario(r);

        return "redirect:/usuarios/nuevo";

}
*/
