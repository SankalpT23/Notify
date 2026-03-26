package com.backend.Notify.model;

import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NotificationMessage {
    private String message;
    private String sender;
    private LocalDateTime timestamp;
}
