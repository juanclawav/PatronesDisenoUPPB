package Mediator;

public class Main {
    public static void main(String[] args) {
        SkypeChat skype = new SkypeChat();

        // Adding QA, DEV and SM to the chat
        QA qa1 = new QA("John", 123, "Junior", skype);
        QA qa2 = new QA("Mary", 456, "Senior", skype);
        QA qa3 = new QA("David", 789, "Intermediate", skype);
        skype.addColega("QA",qa1);
        skype.addColega("QA",qa2);

        DEV dev1 = new DEV("Sarah", 321, "Java", skype);
        DEV dev2 = new DEV("Tom", 654, "Python", skype);
        DEV dev3 = new DEV("Emily", 987, "C#", skype);
        skype.addColega("DEV",dev1);
        skype.addColega("DEV",dev2);

        SM sm1 = new SM("Alex", 111, "Agile", skype);
        SM sm2 = new SM("Grace", 222, "Scrum", skype);
        SM sm3 = new SM("Mike", 333, "Kanban", skype);
        skype.addColega("SM",sm1);

        // Sending messages
        qa1.enviar("Hello everyone!");
        sm1.enviar( "How is everyone doing?");
        dev2.enviar("Can someone help me with this bug?");
    }
}

