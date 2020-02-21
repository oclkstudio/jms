package com.oclkstudio.jms.service;

import com.oclkstudio.jms.entity.Simeranya;

public interface JmsService {
    public void send(Simeranya simeranya);

    public Simeranya receive();
}
