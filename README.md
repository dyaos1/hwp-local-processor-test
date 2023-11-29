# hwp-local-processor-test

### 프로젝트 정의

보고서 작성 프로그램을 최소한의 Local프로그램에 격리하고
최대한의 기능은 api서버에 올려둠으로써 재사용성과 유지보수성을 높인 플랫폼을 만들기 위한 
모의 프로젝트.

### 프로젝트의 목표
 - 협업 프로젝트 : Git, Git Project, Draw.io 등 프로젝트 지원 도구를 활용함으로써 장차 협업을 위한 기틀을 마련한다.
 - 프로그램 구조 테스트 : DB, api서버, UI on server, Local UI, Local hwp module 등으로 구성된 복잡한 프로그램 집합을 미리 테스트 함으로써 시행착오 및 리스크에 대비한다.
 - 기술탐색 : electron, React에서의 파일 저장, 복수 지령문 stack을 통한 순차적 실행 등 의 기술 과제를 미리 탐색한다.

### 구현 계획
 - Oracle서버에 있는 내용을 불러와서 JSON 지령문 형태로 변환해주는 API 서버 작성 ( JAVA Spring )
 - API로부터 지령문을 전달받는 GUI 인터페이스 구현 ( React )
 - GUI인터페이스를 Local PC용 프로그램으로 변환 && 지령문을 JSON파일로 저장 ( electron )
 - 저장된 JSON파일을 hwp문서로 작성하는 프로그램을 exe형태로 구현 ( python )
