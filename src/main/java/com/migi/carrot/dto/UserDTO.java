package com.migi.carrot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private int user_id;
    private String userName;
    private float userManner;
}
