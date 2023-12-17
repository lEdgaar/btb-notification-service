package com.btb.notificationservice.service;

import com.btb.notificationservice.dto.SendNotificationDTO;

public interface EmailService {

    void sendEmail(SendNotificationDTO sendNotificationDTO);

}
