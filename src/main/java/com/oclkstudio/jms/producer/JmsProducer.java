package com.oclkstudio.jms.producer;

import com.oclkstudio.jms.entity.Simeranya;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class JmsProducer {
    @Autowired
    private JmsTemplate jmsTemplate;

    @Value("${jms.queue.destination}")
    private String destinationQueue;

    private static final Logger logger = LoggerFactory.getLogger(JmsProducer.class);

    public void send(Simeranya simeranya) {
        logger.info("sent message='{}'", simeranya.toString());
        jmsTemplate.convertAndSend(destinationQueue, castToMap(simeranya));
    }

    private Map castToMap(Simeranya simeranya) {
        Map map = new HashMap();
        map.put("id", simeranya.getId());
        map.put("name", simeranya.getName());
        map.put("description", simeranya.getDescription());
        return map;
    }
}
