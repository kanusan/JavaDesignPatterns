package com.kanu.factory;

public class Factory {
	public static void main(String[] args)
    {
        Notification notification1 = NotificationFactory.createNotification("EMAIL");
        notification1.notifyUser();
        
        Notification notification2 = NotificationFactory.createNotification("SMS");
        notification2.notifyUser();
    }
}
