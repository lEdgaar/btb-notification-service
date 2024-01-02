package com.btb.notificationservice.service.impl;

import com.btb.notificationservice.dto.SendNotificationDTO;
import com.btb.notificationservice.service.EmailService;
import com.btb.notificationservice.service.NotificationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class NotificationServiceImpl implements NotificationService {

    private EmailService emailService;

    @Autowired
    public NotificationServiceImpl(EmailService emailService) {
        this.emailService = emailService;
    }


    @Override
    public void sendNotification(SendNotificationDTO sendNotificationDTO) {
        emailService.sendEmail(sendNotificationDTO);
    }

}
