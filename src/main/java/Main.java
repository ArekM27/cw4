/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int prog = 0;
    Service s = new Service(); 
    
    try {
     
      s.addStudent(new Student("Krzysztof", 20));
      s.addStudent(new Student("Janusz", 40));

      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }

      System.out.println("Wybierz opcje z menu programu: ");
      System.out.println("1. Dodaj studenta");
      System.out.println("2. Wyswietl liste studentow");
      prog = scanner.nextInt();

      switch(prog){
        case 1:
          System.out.println("Podaj imię studenta: ");
          String name = scanner.nextLine();
          name = scanner.nextLine();
          System.out.println("Podaj wiek studenta: ");
          int age = scanner.nextInt();
          s.addStudent(new Student(name, age));
          break;

      }
    } catch (IOException e) {

    }

      }
}