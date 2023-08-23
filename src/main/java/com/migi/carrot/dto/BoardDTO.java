package com.migi.carrot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDTO {
    private int id;
    private String boardTitle;
    private String boardLocation;
    private int boardPrice;
    private int boardChats;
    private int boardHearts;

}
