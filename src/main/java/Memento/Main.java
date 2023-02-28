package Memento;

public class Main {
    public static void main(String[] args) {
        BDD database = new BDD();
        Backups backups = new Backups();

        database.addPersona(new Persona("Alice", 123456, 25));
        database.addPersona(new Persona("Bob", 234567, 30));
        database.addPersona(new Persona("Charlie", 345678, 35));
        database.addPersona(new Persona("Dave", 456789, 40));
        database.addPersona(new Persona("Eve", 567890, 45));

        backups.addBackup(database.guardar("backupenero"));
        database.addPersona(new Persona("Frank", 678901, 50));
        backups.addBackup(database.guardar("backupfebrero"));
        database.addPersona(new Persona("Grace", 789012, 55));
        backups.addBackup(database.guardar("backupmarzo"));
        database.addPersona(new Persona("Henry", 890123, 60));
        backups.addBackup(database.guardar("backupabril"));
        database.addPersona(new Persona("Isaac", 901234, 65));
        backups.addBackup(database.guardar("backupmayo"));

        Memento secondBackup = backups.getBackup(1);
        database.restaurar(secondBackup);
        database.imprimirPersonas();
    }
}
