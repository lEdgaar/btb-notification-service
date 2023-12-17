package com.btb.notificationservice.service.impl;

import com.btb.notificationservice.dto.SendNotificationDTO;
import com.btb.notificationservice.service.EmailService;
import com.btb.notificationservice.service.NotificationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Log4j2
@Service
public class NotificationServiceImpl implements NotificationService {

    private EmailService emailService;

    @Autowired
    public NotificationServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }


    @Override
    public void sendNotification() {

    }

}
