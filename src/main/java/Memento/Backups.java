package Memento;

import java.util.ArrayList;
import java.util.List;

class Backups {
    private List<Memento> backups;

    public Backups() {
        backups = new ArrayList<>();
    }

    public void addBackup(Memento memento) {
        if (backups.size() == 5) {
            backups.remove(0);
        }
        backups.add(memento);
    }

    public Memento getBackup(int index) {
        return backups.get(index);
    }
}
