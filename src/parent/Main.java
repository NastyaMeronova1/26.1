package parent;
import childs.*;

public class Main {

 public static void main(String[] args) {
     Specialist first = new Specialist("Steave Mark", 25, 3620.2, 5);
     Specialist second = new Specialist("Amanda Jonson", 34, 5230.2, 3);
     Specialist third = new Specialist("Marcus Jackson", 44, 56324.25, 4);

     Developer markZuckerberg = new Developer("Mark Zuckerberg", 36, 2000.5, "Junior", DeveloperGrade.JUNIOR);
     Developer billGates = new Developer("Bill Gates", 50, 5000.5, "Middle", DeveloperGrade.MIDDLE);
     Developer adaLovelace = new Developer("Ada Lovelace", 30, 3000.4, "Senior", DeveloperGrade.SENIOR);
     Developer dennisRitchie = new Developer("Dennis Ritchie", 30, 5500.4, "Teamlead", DeveloperGrade.TEAMLEAD);

     Manager aliceDjon = new Manager("Alice Djon", 20, 1000.5, true);
     Manager kennLary = new Manager("Kenn Lary", 50, 200.3, true);

     CEO alexaChack = new CEO("Alexsander Chack", 35, 5000.6, true);

//     first.print();
//     first.workWithClients();
//     second.print();
//     second.workWithClients();
//     third.print();
//     third.workWithClients();
//     markZuckerberg.print();
//     billGates.print();
//     adaLovelace.print();
//     dennisRitchie.print();
//     aliceDjon.writeProcedures();
//     aliceDjon.print();
//     kennLary.writeProcedures();
//     kennLary.print();
//     alexaChack.isHasCompanyCar();
//     alexaChack.print();
//     System.out.println();
//     first.goToDayOff();
//     markZuckerberg.goToDayOff();
//     aliceDjon.goToDayOff();
    printDeveloperGrade(markZuckerberg);
    printDeveloperGrade(billGates);
    printDeveloperGrade(adaLovelace);
    printDeveloperGrade(dennisRitchie);
    }
    public static void printDeveloperGrade(Developer developer){
switch(developer.getDeveloperGrade()){
    case JUNIOR:
        System.out.println("I am junior developer");
        break;
    case MIDDLE:
        System.out.println("I am middle developer");
        break;
    case SENIOR:
        System.out.println("I am senior developer");
        break;
    case TEAMLEAD:
        System.out.println("I am teamlead of company");
        break;
    default:
        System.out.println("I do not work in IT company");
      }
     }
    }

