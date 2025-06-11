package com.barbearia.agenda.repository;

import com.barbearia.agenda.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Integer> {
}
