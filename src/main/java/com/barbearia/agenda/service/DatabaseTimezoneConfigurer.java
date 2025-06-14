package com.barbearia.agenda.service;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class DatabaseTimezoneConfigurer {

        @Autowired
        private JdbcTemplate jdbcTemplate;

        @PostConstruct
        public void setTimeZone() {
            jdbcTemplate.execute("SET time_zone = 'America/Sao_Paulo'");
        }
}
