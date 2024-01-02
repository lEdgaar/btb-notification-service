package com.btb.notificationservice.service;

import com.btb.notificationservice.dto.SendNotificationDTO;

public interface NotificationService {

    void sendNotification(SendNotificationDTO sendNotificationDTO);

}
