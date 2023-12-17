package com.btb.notificationservice.service.impl;

import com.btb.notificationservice.dto.SendNotificationDTO;
import com.btb.notificationservice.service.EmailService;
import com.btb.notificationservice.service.ThymeleafService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Log4j2
@Service
public class EmailServiceImpl implements EmailService {

    private final String mailFrom;

    private final JavaMailSender javaMailSender;

    @Autowired
    private ThymeleafService thymeleafService;

    public EmailServiceImpl(JavaMailSender javaMailSender,  @Value("${spring.mail.username}") String mailFrom) {
        this.javaMailSender = javaMailSender;
        this.mailFrom = mailFrom;
    }

    @Override
    public void sendEmail(SendNotificationDTO sendNotificationDTO) {
        try {
            MimeMessage email = createMessage(sendNotificationDTO);
            javaMailSender.send(email);
        } catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private MimeMessage createMessage(SendNotificationDTO sendNotificationDTO) throws MessagingException, UnsupportedEncodingException {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "utf-8");

        Map<String, Object> variables = new HashMap<>();
        variables.put("message", sendNotificationDTO.getMessage());

        helper.setTo(sendNotificationDTO.getEmail());
        helper.setSubject(sendNotificationDTO.getSubject());
        helper.setFrom(mailFrom,"BTB Trading");
        helper.setTo(sendNotificationDTO.getEmail());
        helper.setText(thymeleafService.createContent("mailTemplate.html", variables), true);

        return mimeMessage;
    }


}
