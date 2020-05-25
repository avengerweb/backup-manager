package dev.carrot.backupmanager.entities;

public enum AuthorityType {
    ROLE_ADMIN(Permission.ADMIN),
    ROLE_USER(Permission.USER);

    private final String roleId;

    AuthorityType(String roleId) {
        this.roleId = roleId;
    }

    public static class Permission {
        public static final String ADMIN = "ROLE_ADMIN";
        public static final String USER = "ROLE_USER";
    }
}