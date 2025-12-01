package kz.qonaqzhai.shared.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

import kz.qonaqzhai.shared.dto.enums.ERole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class UserDto implements Serializable{
    
    @Serial
    private final static Long serialVersionUID = -8341932667100350516L;

    private Long id;
    private String username;
    private String iin;
    private ERole role;
    private List<ERole> roles;
    private String phoneNumber;
    private String fio;

}
