package com.backend.Notify.controller;


import com.backend.Notify.model.NotificationMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class NotificationController {

    @MessageMapping("/notify") // It Goes to ../app/notify
    @SendTo("/topic/notifications") // Goes To All Subscription
    public NotificationMessage notify(NotificationMessage notificationMessage) {
        notificationMessage.setTimestamp(LocalDateTime.now());
        return notificationMessage;
    }
}
