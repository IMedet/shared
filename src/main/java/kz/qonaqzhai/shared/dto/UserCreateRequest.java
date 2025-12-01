package kz.qonaqzhai.shared.dto;

import kz.qonaqzhai.shared.dto.enums.ERole;
import lombok.Data;
import java.util.Set;

@Data
public class UserCreateRequest {
    private String username;
    private String password;
    private String iin;
    private ERole role;
    private Set<ERole> roleNames; // Изменяем на Set<ERole> вместо Set<Role>
    private String phoneNumber;
    private String fio;
}
