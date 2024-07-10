package com.food.food.di.service;

import com.food.food.di.modelo.Cliente;
import com.food.food.di.notificacao.NivelUrgencia;
import com.food.food.di.notificacao.Notificador;
import com.food.food.di.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    @TipoDoNotificador(NivelUrgencia.NORMAL)
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente) {
        cliente.setAtivo(true);
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo");
    }
}
