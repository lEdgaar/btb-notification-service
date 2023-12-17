package com.btb.notificationservice.controller;

import com.btb.notificationservice.dto.SendNotificationDTO;
import com.btb.notificationservice.service.NotificationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Log4j2
@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping("/send")
    public void sendNotification(@RequestBody SendNotificationDTO sendNotificationDTO) {
        log.trace("POST /notifications/send email: {}" );

        log.info("WarningEvent: Send notification via mail for user: {}", sendNotificationDTO.getEmail());
        notificationService.sendNotification();
    }

}
