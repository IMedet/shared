package kz.qonaqzhai.shared.dto;

import kz.qonaqzhai.shared.dto.enums.ERole;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class UserResponseDTO {
    private Long id;
    private String username;
    private String iin;
    private ERole role;
    private List<ERole> roles;
    private String phoneNumber;
    private String fio;
}
