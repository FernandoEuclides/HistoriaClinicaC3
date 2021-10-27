package co.edu.unab_g47_2.webapp.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab_g47_2.webapp.services.PacienteService;
import co.edu.unab_g47_2.webapp.models.PacienteModel;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE })
@RequestMapping("/paciente")
public class PacienteController {
    @Autowired
    PacienteService pacienteService;

    @GetMapping()
    public ArrayList<PacienteModel> obtenerPaciente() {
        return pacienteService.obtenerPacientes();
    }

    @PostMapping()
    public PacienteModel guardarPaciente(@RequestBody PacienteModel paciente) {
        return this.pacienteService.guardarPaciente(paciente);
    }

    @GetMapping(path = "/{id}")
    public Optional<PacienteModel> obtenerPacientePorId(@PathVariable("id") Long id) {
        return this.pacienteService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<PacienteModel> obtenerPacientePorPrioridad(@RequestParam("prioridad") Integer prioridad) {
        return this.pacienteService.obtenerPorPrioridad(prioridad);

    }

    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
        boolean ok = this.pacienteService.eliminarPaciente(id);
        if (ok) {
            return "Se eliminó el paciente con id: " + id;
        } else {
            return "No se pudo eliminar el paciente con id: " + id;
        }

    }

}
