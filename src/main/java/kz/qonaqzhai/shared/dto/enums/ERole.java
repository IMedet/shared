package kz.qonaqzhai.shared.dto.enums;

public enum ERole {
    ROLE_ADMIN("ROLE_ADMIN", "Админ со всеми доступами"),
    ROLE_CLIENT("ROLE_CLIENT","Клиент");

    private final String authority;
    private final String translation;

    ERole(String authority, String translation) {
        this.authority = authority;
        this.translation = translation;
    }
}
