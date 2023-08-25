package com.migi.carrot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BoardDTO {
    private int board_id;
    //user id가 pk 역할로, 해당 게시글의 유저 데이터를 찾는 키의 역할을 함.
    private int user_id;
    private String boardTitle;
    private String boardLocation;
    private String boardImage;
    private int boardPrice;
    private int boardChats;
    private int boardHearts;

}
