package org.example;

import notification.EmailService;
import notification.NotificationService;
import notification.PopupNotificationService;
import notification.SmsService;

public class OrderService {
   NotificationService notification;

   public OrderService(NotificationService notification) {
       this.notification = notification;
   }

    public void placeOrder() {
        System.out.println("Order Placed");
        notification.sendNotification();
    }
}

