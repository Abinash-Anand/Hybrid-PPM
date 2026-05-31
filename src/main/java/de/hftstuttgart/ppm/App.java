package de.hftstuttgart.ppm;

import de.hftstuttgart.ppm.services.AuditLogService;

public class App {

        public static void main(String[] args) {
AuditLogService auditLogService =
        new AuditLogService();

auditLogService.logAction(
        3L,
        "APPROVED",
        "PROJECT",
        2L,
        "AI Portfolio Dashboard approved");
        }

}