package com.food.food.di.notificacao;

import com.food.food.di.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
