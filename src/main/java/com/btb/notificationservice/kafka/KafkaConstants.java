package com.btb.notificationservice.kafka;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.NONE)
public final class KafkaConstants {

    public static final String SEPARATOR = ".";

    public static final String NOTIFICATIONS_TOPIC = "notifications";

    public static final String UNIT_AVAILABLE = "unit_available";

}
