# 미션 - 자동차 경주 게임
## 🚀 프로젝트 개요
- 사용자가 입력한 횟수동안 n대의 자동차가 전진/멈춤을 반복하며 우승자를 가리는 경주 게임이다.
- 전진/멈춤 값은 랜덤수이며 전진 조건은 4~9, 멈춤 조건은 0~3이다.

---
## ✔️ 구현 기능 목록
1. 사용자가 경주할 자동차이름과 경주 시도 횟수를 입력한다.
   - 잘못된 값 입력시 IllegalArgumentException를 발생시키고, 
   - "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
   - [예외 사항] : 이름 입력 
      - 쉼표를 기준으로 이름을 1개 이상 입력해야 한다.
      - 5자 이하여야 한다.
   - [예외 사항] : 시도 횟수
     - 숫자인지 확인
2. 전진/멈춤 값을 생성한다.
   - 범위는 0~9
   - 전진 조건 : 4~9, 멈춤 조건 : 0~3
3. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
4. 경주 시도 회수만큼 2~3을 반복한다.
5. 완료하면 우승자를 판별하고 출력한다.
---

