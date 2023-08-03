package hr.main;

import hr.personnel.ServiceLicenseAgreement;
import hr.personnel.Subcontractor;

import java.util.List;

public class ApproveSLAMain {
    public static void main(String[] args) {
        // Define SLA
        int minTimeOffPercent = 98;
        int maxResolutionDays = 2;
        ServiceLicenseAgreement companySla = new ServiceLicenseAgreement(
                minTimeOffPercent,
                maxResolutionDays);

        // Grab subcontractors
        Subcontractor subcontractor1 = new Subcontractor("Rebekah Jackson", "rebekeh-jackson@abc.com", 3000, 15);
        Subcontractor subcontractor2 = new Subcontractor("Harry Fitz", "harryfitz@def.com", 3000, 15);

        List<Subcontractor> subcontractors = List.of(subcontractor1, subcontractor2);

        for (Subcontractor subcontractor : subcontractors) {
            subcontractor.approveSLA(companySla);
        }
    }
}
