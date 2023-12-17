package com.btb.notificationservice.dto;

import com.btb.notificationservice.common.validation.annotations.NotNullOrEmpty;
import lombok.*;

@ToString
@Getter
@Setter
@EqualsAndHashCode
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SendNotificationDTO {

    @NotNullOrEmpty
    private String email;

    @NotNullOrEmpty
    private String subject;

    @NotNullOrEmpty
    private String message;

}
