import java.util.Scanner;

abstract class EducationBoard {
    private String name;
    private String establishedDate;
    private String resolutionNumber;
    private String gazetteNotificationDate;

    public EducationBoard(String name, String establishedDate, String resolutionNumber,
            String gazetteNotificationDate) {
        this.name = name;
        this.establishedDate = establishedDate;
        this.resolutionNumber = resolutionNumber;
        this.gazetteNotificationDate = gazetteNotificationDate;
    }

    public String getName() {
        return name;
    }

    public String getEstablishedDate() {
        return establishedDate;
    }

    public String getResolutionNumber() {
        return resolutionNumber;
    }

    public String getGazetteNotificationDate() {
        return gazetteNotificationDate;
    }

    public void getBoardInfo() {
        System.out.println("Board Name: " + name);
        System.out.println("Established Date: " + establishedDate);
        System.out.println("Resolution Number: " + resolutionNumber);
        System.out.println("Gazette Notification Date: " + gazetteNotificationDate);
    }
}

// Derived class: NationalBoard
class NationalBoard extends EducationBoard {
    private String recognitionDate;
    private String approvedBy;

    public NationalBoard(String name, String establishedDate, String resolutionNumber, String gazetteNotificationDate,
            String recognitionDate, String approvedBy) {
        super(name, establishedDate, resolutionNumber, gazetteNotificationDate);
        this.recognitionDate = recognitionDate;
        this.approvedBy = approvedBy;
    }

    public String getRecognitionDate() {
        return recognitionDate;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void getNationalBoardInfo() {
        super.getBoardInfo();
        System.out.println("Recognition Date: " + recognitionDate);
        System.out.println("Approved By: " + approvedBy);
    }
}

// Derived class: SchoolBoard
class SchoolBoard extends EducationBoard {
    private String associatedMinistry;
    private String rules;

    public SchoolBoard(String name, String establishedDate, String resolutionNumber, String gazetteNotificationDate,
            String associatedMinistry, String rules) {
        super(name, establishedDate, resolutionNumber, gazetteNotificationDate);
        this.associatedMinistry = associatedMinistry;
        this.rules = rules;
    }

    public String getAssociatedMinistry() {
        return associatedMinistry;
    }

    public String getRules() {
        return rules;
    }

    public void getSchoolBoardInfo() {
        super.getBoardInfo();
        System.out.println("Associated Ministry: " + associatedMinistry);
        System.out.println("Rules: " + rules);
    }
}

public class Education {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an education board:");
        System.out.println("1. National Board");
        System.out.println("2. School Board");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                NationalBoard cbse = new NationalBoard("Central Board of Secondary Education (CBSE)", "01.07.1929",
                        "F-115-R/28", "11.11.1929", "20.10.1990", "Ministry of Education");
                cbse.getNationalBoardInfo();
                break;
            case 2:
                SchoolBoard msrvvp = new SchoolBoard("Maharshi Sandipani Rashtriya Veda Sanskrit Shiksha Board, Ujjain",
                        "08.08.2022", "Rule 14(iv) (f)", "25.01.2023", "Department of Higher Education",
                        "MoA of MSRVVP");
                msrvvp.getSchoolBoardInfo();
                break;
            default:
                System.out.println("Invalid choice. Please enter either 1 or 2.");
        }

        scanner.close();
    }
}
