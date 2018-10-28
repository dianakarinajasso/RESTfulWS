package me.jmll.utm.service;

import java.util.List;

import me.jmll.utm.model.Notification;

public interface NotificationService {
	public List<Notification> getNotifications();
	public Notification notify(String subject, String message, List<String> toAddress, List<String> ccAddress);

	
}
