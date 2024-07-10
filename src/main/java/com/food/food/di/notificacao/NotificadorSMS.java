package com.food.food.di.notificacao;
import com.food.food.di.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {

        System.out.println("Notificando: " + cliente.getNome() + " - " + mensagem);
    }
}
