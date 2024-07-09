package com.food.food.di.service;

import com.food.food.di.modelo.Cliente;
import com.food.food.di.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    private final Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }


    public void ativar(Cliente cliente) {
        cliente.setAtivo(true);
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
