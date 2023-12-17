package com.btb.notificationservice.kafka;

import com.btb.notificationservice.dto.SendNotificationDTO;
import com.btb.notificationservice.service.NotificationService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class KafkaClassListener {

    @Autowired
    private NotificationService notificationService;

    @KafkaListener(topics = KafkaConstants.NOTIFICATIONS_TOPIC + KafkaConstants.SEPARATOR + KafkaConstants.UNIT_AVAILABLE, groupId = "notifications")
    void sendNotification(SendNotificationDTO sendNotificationDTO) {
        log.trace("KafkaClassListener.sendNotification email: {}", sendNotificationDTO.getEmail());

        log.info("WarningEvent: Send notification by mail for user: {}", sendNotificationDTO.getEmail());
        notificationService.sendNotification();
    }

}
