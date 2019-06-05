package ua.kpi.bogdan.airline.entity;

public enum UserRole {
    ADMIN, DISPATCHER;

    public static UserRole getRole(User user) {
        return values()[user.getRoleId()];
    }

    public String getName() {
        return name().toLowerCase();
    }


}
