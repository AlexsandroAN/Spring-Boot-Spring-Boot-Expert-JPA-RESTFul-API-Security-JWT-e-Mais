package io.github.alex;

import io.github.alex.domain.entity.Cliente;
import io.github.alex.domain.entity.Pedido;
import io.github.alex.domain.repository.Clientes;
import io.github.alex.domain.repository.Pedidos;
import java.math.BigDecimal;
import java.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication {

    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);
    }

}
