package com.oclkstudio.jms.service;

import com.oclkstudio.jms.consumer.JmsConsumer;
import com.oclkstudio.jms.entity.Simeranya;
import com.oclkstudio.jms.producer.JmsProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JmsServiceImp implements JmsService {
    @Autowired
    private JmsProducer jmsProducer;

    @Autowired
    private JmsConsumer jmsConsumer;

    @Override
    public void send(Simeranya simeranya) {
        jmsProducer.send(simeranya);
    }

    @Override
    public Simeranya receive() {
        return jmsConsumer.receive();
    }
}
