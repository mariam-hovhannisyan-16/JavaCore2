package homework.homework10.medicalCenter;

public interface Commands {

        String EXIT = "EXIT";
        String ADD_DOCTOR = "1";
        String SEARCH_DOCTOR = "2";
        String DELETE_DOCTOR = "3";
        String CHANGE_DOCTOR = "4";
        String ADD_PATIENT = "5";
        String PRINT_PATIENTS_BY_DOCTOR = "6";
        String PRINT_ALL_PATIENTS = "7";

        static void printCommands() {
            String[] commands = {
                    ADD_DOCTOR + " - Add Doctor",
                    SEARCH_DOCTOR + " - Search Doctor by Profession",
                    DELETE_DOCTOR + " - Delete Doctor",
                    CHANGE_DOCTOR + " - Change Doctor",
                    ADD_PATIENT + " - Add Patient",
                    PRINT_PATIENTS_BY_DOCTOR + " - Print Patients by Doctor",
                    PRINT_ALL_PATIENTS + " - Print All Patients",
                    EXIT + " - Exit"
            };

            for (String cmd : commands) {
                System.out.println(cmd);
            }
        }
    }
