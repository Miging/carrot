# 당근마켓 
하드코딩으로 구현.

## 1. 홈 (/)
    - 가져오는 정보들
        - 글 id
        - 게시한 user id(pk로써 사용)
        - 글 제목
        - 위치
        - 가격
        - 사진
        - 채팅 수
        - 하트 수
### Response 형식
```
[
    {
        "msg": "연결 성공",
        "success": true
    },
    [
        {
            "board_id": 1,
            "user_id": 2,
            "boardTitle": "문화 상품권 팔아요",
            "boardLocation": "상도동",
            "boardImage": "image1",
            "boardPrice": 18000,
            "boardChats": 10,
            "boardHearts": 32
        },
        {
            "board_id": 2,
            "user_id": 1,
            "boardTitle": "의자 싸게 판매합니다",
            "boardLocation": "흑석동",
            "boardImage": "image2",
            "boardPrice": 2000,
            "boardChats": 0,
            "boardHearts": 30
        }
    ]
]
```
## 2. 상세페이지 조회(/{board_id})
    - 상세페이지 가져와야할 정보들
        - 사용자
            - 사용자 고유 id
            -  이름
            -  매너온도
        - 글
          - 글 id
          - 글 제목
          - 위치
          - 가격
          - 사진
          - 채팅 수
          - 하트 수 
          
### Response 형식 
```
[
    {
        "msg": "연결 성공",
        "success": true
    },
    {
        "board_id": 1,
        "user_id": 2,
        "boardTitle": "문화 상품권 팔아요",
        "boardLocation": "상도동",
        "boardImage": "image1",
        "boardPrice": 18000,
        "boardChats": 10,
        "boardHearts": 32
    },
    {
        "user_id": 2,
        "userName": "migi",
        "userManner": 32.4
    }
]
```