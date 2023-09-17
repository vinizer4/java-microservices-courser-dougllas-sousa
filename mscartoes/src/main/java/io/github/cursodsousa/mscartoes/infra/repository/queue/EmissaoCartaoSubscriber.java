package io.github.cursodsousa.mscartoes.infra.repository.queue;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
public class EmissaoCartaoSubscriber {

    @RabbitListener(queues = {"${mq.queues.emissao-cartoes}"})
    public void receberSolicitacaoEmissao(@Payload String payload){
        System.out.println("Recebendo solicitação de emissão de cartão: " + payload);
    }
}
