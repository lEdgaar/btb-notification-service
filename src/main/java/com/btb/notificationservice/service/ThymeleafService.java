package com.btb.notificationservice.service;

import java.util.Map;

public interface ThymeleafService {

    String createContent(String template, Map<String, Object> variables);

}
