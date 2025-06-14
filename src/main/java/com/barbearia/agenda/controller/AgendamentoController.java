package com.barbearia.agenda.controller;

import com.barbearia.agenda.model.Agendamento;
import com.barbearia.agenda.service.AgendamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {
    @Autowired
    private AgendamentoService agendamentoService;

    @GetMapping
    public List<Agendamento> listarTodos() {
       return agendamentoService.listarTodos();
    }

    @PostMapping
    public Agendamento agendar(@RequestBody Agendamento agendamento) {
        System.out.println("Data recebida no backend: " + agendamento.getData());
        System.out.println("Horário recebido no backend: " + agendamento.getHorario());
        return agendamentoService.agendar(agendamento);
    }
}
