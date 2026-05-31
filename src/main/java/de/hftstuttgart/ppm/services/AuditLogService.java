package de.hftstuttgart.ppm.services;

import de.hftstuttgart.ppm.dao.AuditLogDAO;

public class AuditLogService {

    private final AuditLogDAO auditLogDAO =
            new AuditLogDAO();

    public void logAction(
            Long userId,
            String actionType,
            String entityType,
            Long entityId,
            String description) {

        auditLogDAO.createAuditLog(
                userId,
                actionType,
                entityType,
                entityId,
                description);
    }
}