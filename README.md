# 🍃 Alpine.js + Spring Boot Integration Demo

Spring Boot(Thymeleaf) 환경에서 가벼운 자바스크립트 프레임워크인 **Alpine.js**를 도입하여, 복잡한 빌드 과정 없이 **반응형 프론트엔드(Reactive Frontend)**를 구현한 학습용 프로젝트입니다.

## 🛠 Tech Stack

- **Backend**: Java 17, Spring Boot 3.x
- **Template Engine**: Thymeleaf
- **Frontend**: Alpine.js (v3, CDN), HTML5, CSS3
- **Build Tool**: Maven (or Gradle)

## 📚 Features (학습 내용)

이 프로젝트는 Alpine.js의 핵심 디렉티브를 활용하여 다음 기능들을 구현했습니다.

### 1. State Management (`x-data`, `x-text`)
- 별도의 JS 파일 없이 HTML 마크업 내에서 로컬 상태(State) 관리
- 서버 사이드 데이터(Thymeleaf Variable)를 Alpine.js 상태로 초기화 및 바인딩

### 2. Event Handling (`@click`)
- 버튼 클릭 이벤트를 통한 상태 변경 및 UI 즉시 업데이트
- 토글(Toggle) 기능 구현

### 3. Two-way Binding (`x-model`)
- Input 입력 값과 데이터 상태의 실시간 양방향 동기화
- 입력 폼 제어 실습

### 4. List Rendering (`x-for`)
- 자바스크립트 배열 데이터를 기반으로 한 동적 목록 렌더링
- **To-Do List 구현**: 할 일 추가, 완료 상태 토글(UI 스타일 변경)

### 5. Transition & Effects (`x-show`, `x-transition`)
- 조건부 렌더링 시 부드러운 애니메이션 효과 적용
- 모달(Modal) 창 및 드롭다운 UI 인터랙션 구현
