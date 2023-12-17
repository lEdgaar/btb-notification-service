package com.btb.notificationservice.dto;

import com.btb.notificationservice.common.validation.annotations.NotNullOrEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SendNotificationDTO {

    @NotNullOrEmpty
    private String email;

    @NotNullOrEmpty
    private String subject;

    @NotNullOrEmpty
    private String message;

}
