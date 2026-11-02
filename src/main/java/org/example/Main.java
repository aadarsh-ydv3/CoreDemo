package org.example;

import notification.EmailService;
import notification.NotificationService;
import notification.SmsService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
        NotificationService notification = new SmsService();
        OrderService order = new OrderService(notification);
        order.placeOrder();
    }
}
