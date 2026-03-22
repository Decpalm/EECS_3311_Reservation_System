package observer;

public interface EquipmentSubject {
    void attach(EquipmentObserver observer);
    void detach(EquipmentObserver observer);
    void notifyObservers();
}