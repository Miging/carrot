package com.migi.carrot.controller;

import com.migi.carrot.dto.BoardDTO;
import com.migi.carrot.service.BoardService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
class Response{
    private String msg="연결 실패";
    private boolean success=false;
    private ArrayList<BoardDTO> data=new ArrayList<>();
}
@RestController
@RequiredArgsConstructor
public class HomeController {
    private final BoardService boardService;
    ArrayList<BoardDTO> boardDTOS= new ArrayList<>();
    @GetMapping("/")
    Response responseData()  {
        Response response=new Response();
        response.setSuccess(true);
        response.setMsg("연결 성공");
        response.getData().add(new BoardDTO(1,"문화 상품권 팔아요","상도동",18000,10,32));
        response.getData().add(new BoardDTO(2,"의자 싸게 판매합니다","흑석동",2000,0,30));
        return  response;
    }

    //id값을 통해 게시글 데이터 가져오기
//    @GetMapping("/{id}")
//    public BoardDTO findById(@PathVariable int id){
//        boardService.updateHits(id);
//        BoardDTO boardDTO=boardService.findById(id);
//        return boardDTO;
//    }


}
