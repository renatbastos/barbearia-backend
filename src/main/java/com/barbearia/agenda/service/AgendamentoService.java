package com.barbearia.agenda.service;

import com.barbearia.agenda.model.Agendamento;
import com.barbearia.agenda.repository.AgendamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {
    @Autowired
    private AgendamentoRepository agendamentoRepository;

    public List<Agendamento> listarTodos() {
       return agendamentoRepository.findAll();
    }

    public Agendamento agendar(Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }
}
