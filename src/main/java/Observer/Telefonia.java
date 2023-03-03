package Observer;

import java.util.*;

class Telefonia implements ISubject {
    private List<IObserver> observers;
    private Map<String, List<IObserver>> subscriptions;

    public Telefonia() {
        observers = new ArrayList<>();
        subscriptions = new HashMap<>();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String notificationType, String message) {
        List<IObserver> observersToNotify = subscriptions.get(notificationType);
        if (observersToNotify != null) {
            for (IObserver observer : observersToNotify) {
                observer.update(notificationType, message);
            }
        }
    }

    public void sendNotification(String notificationType, String message) {
        System.out.println("Enviando notificación: " + notificationType + " - " + message);
        notifyObservers(notificationType, message);
    }

    public void subscribe(String notificationType, IObserver observer) {
        List<IObserver> subscribers = subscriptions.get(notificationType);
        if (subscribers == null) {
            subscribers = new ArrayList<>();
            subscriptions.put(notificationType, subscribers);
        }
        subscribers.add(observer);
    }

    public void unsubscribe(String notificationType, IObserver observer) {
        List<IObserver> subscribers = subscriptions.get(notificationType);
        if (subscribers != null) {
            subscribers.remove(observer);
        }
    }
}

