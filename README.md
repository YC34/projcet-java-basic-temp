# PROJECT START

---
    형상관리 : github
    java version : 17
    OS : mac,windows
---

# 패키지 구조

* application
  * Application.java :실행하는 메인
  * menu : 메뉴판
    * common : 공통으로 구현할 interface, enumType의 메뉴 이름.
    * firstmenu : 첫번쨰 깊이의 메뉴.
      * secondmenu : 두번쨰 깊이의 메뉴
      * thirdmenu : 세번째 깊이의 메뉴
  * program : 각 메뉴의 프로그램
    * school : 책 마지막 페이지 프로그램 패키지화
      * data : 객체에 데이터를 만들어내는 클래스
      * model : 학생,과목,점수 클래스
      * report : 콘솔창에 이쁘게 프린트 해주는 클래스
      * service : 비지니스 로직
      * serviceimpkl : service를 implements 받아 구현한 구현체 (필수과목과 기본과목의 각각에 맞춰 재정의)
      * util : 전역에 사용할 변수들 선언. 
      * School 클래서 : 싱글톤으로 구현한 School class
    * travelagency : 윤단아님 프로젝트
    * travel : 임동규,윤지훈님 프로젝트
      * model :
    * parking :금천구 주차장 정보
      * data : 원본 csv 파일 읽어오기.
      * dto : rawData를 담아주는 클래스(이동을 위한)
      * controller : 요청을 받아줄 클래스
      * service : 전반적인 service 로직
  * exception : 예외처리.



### 각각이 개발해야할 항목
  * program 밑에 원하는 클래스 선언하여 작성. (모를시 개인 프로젝트 만들어서 만들어도 됨.)
  * 시간이 가능하다면 상위 클래스의 exception 커스터마이징 및 menu 컨트롤 해보기.
