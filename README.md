# PROJECT START

---

    형상관리 : github
    java version : 17
    OS : mac,windows

---
### Git Commit Convention

* [init] : 포르젝트 시작
* [feat] : 새로운 기능 추가
* [fix] : 버그 수정
* [docs] : 문서 수정
* [style] : 코드 포맷팅,세미콜론 누락,코드변경이 없는 경우
* [test] : 테스트 코드, 리팩토링 테스트 코드 추가
* [chore] :  빌드 업무 수정, 패키지 매니저 수정, 
             production code와 무관한 부분들
* [comment] : 주석 추가 및 변경
* [remove] : 파일, 폴더 삭제
* [rename] : 파일, 폴더명 수정

##### commit message 작성 규칙
* Add : 추가
* Remove : 삭제
* Simplify : 단순화
* Update : 보완
* Implement : 구현
* Prevent : 방지
* Move : 이동
* Rename : 이름 변경


# 패키지 구조

* application
  * Application.java :실행하는 메인
  * menu : 메뉴판
  * program : 각 메뉴의 프로그램
    * school : 책 마지막 페이지 프로그램 패키지화
      * data : 객체에 데이터를 만들어내는 클래스
      * model : 학생,과목,점수 클래스
      * report : 콘솔창에 이쁘게 프린트 해주는 클래스
      * service : 비지니스 로직
      * serviceimpkl : service를 implements 받아 구현한 구현체 (필수과목과 기본과목의 각각에 맞춰 재정의)
      * util : 전역에 사용할 변수들 선언. 
      * School 클래서 : 싱글톤으로 구현한 School class
    * travel : 윤단아님 프로젝트
    * parking :금천구 주차장 정보
      * data : 원본 csv 파일 읽어오기.
      * dto : rawData를 담아주는 클래스(이동을 위한)
      * controller : 요청을 받아줄 클래스
      * service : 전반적인 service 로직
  * exception : 예외처리.



### 각각이 개발해야할 항목
  * program 밑에 원하는 클래스 선언하여 작성. (모를시 개인 프로젝트 만들어서 만들어도 됨.)
  * 시간이 가능하다면 상위 클래스의 exception 커스터마이징 및 menu 컨트롤 해보기.
