package ipl;

public class Censorship {
    public static String maskTeam(String teamName) {
        String[] parts = teamName.split(" ");
        if (parts.length > 1) {
            return parts[0] + " ***";
        }
        return "***";
    }

    public static String redactPlayer() {
        return "REDACTED";
    }
}

