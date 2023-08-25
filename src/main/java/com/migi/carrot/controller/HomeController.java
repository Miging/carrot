package com.migi.carrot.controller;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.migi.carrot.dto.BoardDTO;
import com.migi.carrot.dto.UserDTO;
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

import java.util.*;

@Getter
@Setter
@RequiredArgsConstructor
class Response{
    private String msg="연결 실패";
    private boolean success=false;
}

@RestController
@RequiredArgsConstructor
public class HomeController {
    private final BoardService boardService;
    private final ArrayList<BoardDTO> boarddata=new ArrayList<>(Arrays.asList(new BoardDTO(1,2,"문화 상품권 팔아요","상도동","image1",18000,10,32),new BoardDTO(2,1,"의자 싸게 판매합니다","흑석동","image2",2000,0,30)));
    private final ArrayList<UserDTO> userdata=new ArrayList<>(Arrays.asList(new UserDTO(1,"clug2023",12.1f),new UserDTO(2,"migi",32.4f)));
    @GetMapping("/")
    public ResponseEntity<List<Object>> responseData()  {
        List<Object> list=new ArrayList<>();
        Response response=new Response();
        list.add(response);
        list.add(boarddata);
        response.setSuccess(true);
        response.setMsg("연결 성공");
        return ResponseEntity.ok(list);
    }
    //id값을 통해 게시글 데이터 가져오기
    @GetMapping("/{id}")
    public List<Object> findById (@PathVariable int id){
//        boardService.updateHits(id);
//        BoardDTO boardDTO=boardService.findById(id);
        List<Object> list=new ArrayList<>();
        Response response=new Response();
        try {
            list.add(response);
            list.add(boarddata.get(id-1));
            //board의 작성자 얻기
            list.add(userdata.get(boarddata.get(id-1).getUser_id()-1));
            response.setSuccess(true);
            response.setMsg("연결 성공");
            return list;
        }catch (IndexOutOfBoundsException e){
            return Collections.singletonList(response);
        }
    }

}
