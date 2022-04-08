# 방학 동아리 멘토링 - 채팅 프로그램 만들기
- 멘토: 정서연, 최선아
- 멘티: 모정빈, 염재현

노션 링크: https://earthy-walleye-835.notion.site/294cd5a069054d4caff3d302f876d052
---

# 1주차
# 완성본
![image](https://user-images.githubusercontent.com/70794506/162482075-60a2ab0b-13d9-4eaf-a877-031448607599.png)
## JAVA의 GUI 클래스 : Swing

**GUI란?** 

- 그래픽 사용자 인터페이스(graphical user interface, GUI)
- 입출력 등의 기능을 알기 쉬운 아이콘 같은 그래픽으로 나타낸 것
- HTML과 같은 화면 구현을 해놓은것

**GUI를 구현하기 위한 도구 Swing**

- Java Swing은 운영체제에 영향을 받지 않고 플랫폼이 독립적이며 가벼운 구성 요소를 제공

클래스 : 변수와 메서드를 정의해놓은 틀 

✨**JFrame이란?**

- 모든 요소를 화면에 띄우는 컨테이너
- 밑바탕 , 틀

✨**JPanel 이란?**

- 조각난 프레임으로 생각하면 됨
- 레이아웃 적용과 UI 배치들을 모두 할 수 있음
- 쉽게말해 HTML의 div 태그 같은 역할

✨**JLabel 이란?**

- 실습을 통해 알아보겠습니다!

### 실습

- 새로운 프로젝트 생성
- Create project from template 체크
- 프로젝트 name : chatFive1
- Base Packeage : com.daelim.five1

- 새로운 패키지 Panel 생성 ( com.daelim.five1.Panel )
- 새로운 클래스 LoginPanel 생성
- extends 키워드 사용 // 다른 클래스 파일을 상속 받음
    - 상속의 주체 = 부모클래스 // 상속받는 클래스 = 자식클래스
    - 자식 클래스는 부모 클래스의 기능을 마음대로 사용할 수 있음
- JPanel 을 상속받음

### 실습2

- 먼저 가벼운 변수 선언으로 시작
    - public String line = "";
    - 접근제어자 : 접근권한, public은 변수를 사용하는 패키지,클래스,메서드 어디에서나 직접 접근할 수 있는 권한을 부여하는것과 같음
    - 변수 타입: 문자열을 담는다
    - 변수명
    - 변수값
- JFrame객체 생성
- public  JFrame f= new JFrame();
    - JFrame은 JPanel의 바탕이 되는 것으로 JPanel이 화면에 표시될 수 있도록 해주는 것
    - 🎉객체를 생성한다는것은 기억장소에 객체의 요소를 저장할 공간이 배정됐다는 뜻 !🎉
    - 이론은 2학년 올라가서 배울테니 지금은 자주 쓰면서 감을 잡아보아요!
    - 객체 생성 기본 형식

    ```jsx
    Class명 참조변수명 = new 생성자 ();
    ```

- 기본 생성자 만들기
    - 생성자란 객체를 생성할 때 항상 실행되는 것으로, 객체를 초기화해주기 위해 맨 처음 실행되는것
- 생성자 채우기

    ```jsx
    public LoginPanel() {
           
            f.getContentPane().setBackground(Color.ORANGE);
            f.setSize(500, 500);
            f.setLayout(null);
            f.setVisible(true);
        }
    ```

    [JFrame](https://www.notion.so/df8f3911c1d5414da6ec9ea21af22f97)

    ### 실습3

    **1.**

    - 메서드 setView() 생성
        - 접근제어자- private / 반환형-void / 매개변수 - 없음

        ---

    - idField라는 이름으로 JTextField 객체 생성

        🍊 JTextField 는 HTML의 form 태그중 input 태그와 같은것

    - idField.setBounds(x,y,w,h)를 사용하여 입력창의 위치와 크기를 조정
    - add() 메서드로 설정된 객체를 화면창에 추가합니다

    ```jsx
    JTextField idField = new JTextField();
            idField.setBounds(150, 100, 200, 30);
            f.add(idField);
    ```

    **2.**

    ---

    - JTextField 위에  JLabel 객체를 생성할겁니다
    - label_id 라는 이름으로 JLabel 객체 생성
        - JLabel은 입력창의 이름을 지정 > 매개변수값 "아이디:"
    - label_id.setBounds() 를 사용하여 위치와 크기를 조정
    - add() 사용

    ```jsx
    JLabel label_id = new JLabel("아이디:");
            label_id.setBounds(100, 100, 50, 30);
            f.add(label_id);
    ```

    ---

    **3.**

    - 생성자에 setView() 호출
    - main클래스에 new LoginPanel() 호출
    - [ ]  실행해서 확인 OK
    - 1. 2.의 실습을 복붙
    - 위치와 Label의 이름만 바꾼다

    ```java
    JLabel label_pw = new JLabel("비밀번호:");
            label_pw.setBounds(85, 150, 60, 30);
            f.add(label_pw);
            JTextField pwField = new JTextField();
            pwField.setBounds(150, 150, 200, 30);
            f.add(pwField);
    ```

    - [ ]  실행해서 확인 OK

    ---

    ### 실습4

    - button 만들기
    - bt_login 이름으로 JButton 객체 선언 > 버튼 이름값  "로그인"
    - 마찬가지로 setBounds() 사용 버튼의 크기와 위치를 조정합니다

    ```jsx
    JButton bt_login = new JButton("로그인");
            bt_login.setBounds(120, 250, 260, 30);
    ```

    ---

    - addActionListener 로 버튼을 눌렀을때 이벤트가 일어나도록 할것입니다
    - 어려우니 일단은 무언가 활동이 일어난다는것만 아시고 넘어가셔도 좋습니다
    - 이벤트 내용(활동 내용) - "로그인을 요청했습니다" 라고 출력해보기
    - 이벤트 형식

    ```jsx
    bt_login.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                }
                });
    ```

    - 출력 방법
        - System.out.println("로그인을 요청했습니다");
        - 자주 나오니 외워두시길 바랍니당

        ---

    - 이벤트형식 + 출력

    ```jsx

    bt_login.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("로그인 요청");
                }
                });
    ```
    
    ---
    # 2주차
    🖐수정하고 가기🖐

> 저번 시간에는 비밀번호 입력 칸을 JTextField를 이용하였습니다. 하지만 비밀번호를 입력할 시에는 아래 사진과 같이 입력하고 있는 글자가 안 보이게 하기 위해 JPasswordField를 사용합니다.

![image](https://user-images.githubusercontent.com/70794506/162482388-eb58a417-bd55-4478-9e90-806fdd95f316.png)

## 중복된 코드를 줄이기 위해 정리하기

- ✨LoginPanel
    - 전역변수 선언

    ```java

    ```

    - 전역변수? 지역변수?

        전체에서 **어디서든 호출**하면 사용할수 있는 변수는 **전역변수**

        **특정한 구역({ })안**에 생성되어 그 지역에만 사용할수 있는 변수는 **지역변수**

    - private, public

        클래스의 모든 정보를 손쉽게 바꿀 수 있으면 안되겠죠~!
        왜냐하면 클래스는 고객의 비밀번호/결제정보와 같이 민감한 정보들도 담고 있기 때문입니다.

        그래서 자바의 클래스는, 밖에 드러내도 되는 것들을 public, 함부로 바꾸면 안되는 것들을 private 으로 구분해서 나타낸답니다. 😎

    ```java
    idField = new JTextField();
    pwField = new JPasswordField();
    ```

    위의 코드를 합친 형태가 이전 시간에 했던 JPasswordField pwField = new JPasswordField(); 와 같은 의미 입니다.

- ✨Main
    - LoginPanel 클래스에 있던 public JFrame f= new JFrame(); 을
    Main 클래스에 public static JFrame f; 
                             f = new JFrame(); 형태로 옮겨줍니다!

    Main 클래스에서 f라는 JFrame 객체를 만들어줬기 때문에 이젠 LoginPanel 클래스에서 f. 없이 바로 add해줘도 됩니다.

    - Main 클래스에서 호출하는 LoginPanel 클래스도 다음과 같이 바꿔줍니다.

        ```java
        public class Main {
            public static JFrame f;
            private static LoginPanel loginPage;

            public static void main(String[] args) {
                f = new JFrame();

                loginPage = new LoginPanel();
                f.add(loginPage);

                f.setSize(500, 500);
                f.setLayout(null);
                f.setVisible(true);
            }
        }
        ```

💥여기서 잠깐!

JFrame으로 창을 띄웠다가 우측 상단에 X표를 누르면 우리 눈에는 창이 닫히는 것처럼 보이지만 실제로는 작업관리자 프로세스를 보면 아직 가동 중인 프로세스를 발견할 수 있습니다.

f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 을 하면 윈도우창 종료 시 프로세스까지 깔끔하게 닫을 수 있습니다. (이제는 ⏹버튼을 따로 눌러주지 않아도 됩니다.)

- 생성자

    ```java
    public LoginPanel() {
        setView();

        setBackground(Color.ORANGE);
        setSize(500,500);
        setLayout(null);
    }
    ```

## 회원가입 화면 만들기

- ✔ JoinPanel 클래스 만들기
    1. Panel 패키지를 우클릭하고 New > Java Class 를 클릭합니다.
    2. JoinPanel 이라고 입력하고 엔터를 누릅니다.
    3. extends 키워드를 사용하여 JPanel을 상속 받습니다. 

- ✔ JoinPanel 기본 생성자 만들기

    ```java
    public JoinPanel(){
            setBackground(Color.LIGHT_GRAY);
            setSize(500,500);
            setLayout(null);
        }
    ```

    - 1주차 시간에 배웠던 JFrame 메서드 참고!

        [JFrame](https://www.notion.so/5fea7f92e8da4e689f8ad50b2a44efe1)

- ✔ main 클래스에 JoinPanel 클래스 호출하기
    - 전역변수 joinPage 선언

        ```java
        private static JoinPanel joinPage;
        ```

    - JoinPanel 객체 생성 후 JFrame에 추가

        ```java
        joinPage= new JoinPanel();
        f.add(joinPage);

        f.setVisible(true); //가장 아래로 옮겨주세요
        ```

- ✔ JoinPanel 클래스에 전역변수 선언

    ```java
    private JTextField nameField;
    private JTextField emailField;
    ```

- ✔ JoinPanel 클래스에 setView() 메소드 생성하기

    ```java
    private void setView() {

    JLabel label_name = new JLabel("이름");
        label_name.setBounds(120, 50, 60, 30);
        add(label_name);
        nameField = new JTextField();
        nameField.setBounds(180, 50, 200, 30);
        add(nameField);

    JLabel label_email = new JLabel("이메일");
        label_email.setBounds(120, 100, 60, 30);
        add(label_email);
        emailField = new JTextField();
        emailField.setBounds(180, 100, 200, 30);
        add(emailField);

    JButton bt_join = new JButton("가입하기");
        bt_join.setBounds(120, 350, 260, 30);
        bt_join.addActionListener(new ActionListener() {
    		@Override
    		public void actionPerformed(ActionEvente e) {
    		System.out.println("회원가입을 요청했습니다");
    		        }
    		    });
        add(bt_join);

    JButton bt_back = new JButton("<"); //로그인 화면으로 이동
        bt_back.setBounds(10,10,50,30);
        add(bt_back);
    }
    ```

✔ 생성자에 setView() 메소드 호출

## 화면 이동

- 실행시 로그인 화면과 회원가입 화면이 동시에 나오는 문제를 해결하려 합니다
- 로그인 창에서 회원 가입 버튼을 누를 시에만 회원가입 창이 열리도록하는 기능 구현이 목표입니다

## 화면 이동 실습

- ✔ main 클래스에 movePage 메소드 만들기
    - ✨조건문 - swith문


    ```java
    public static void movePage(int index) {
    loginPage.setVisible(false);//화면을 끕니다
    joinPage.setVisible(false);//화면을 끕니다

        switch (index) {
            case 1:
    						f.setTitle("Chat - 로그인 화면");
    						loginPage.setVisible(true);
                break;
            case 2:
    						f.setTitle("Chat - 회원가입 화면");
    						joinPage.setVisible(true);
                break;
        }
    }
    ```

    - 정적(static)은 프로그램 안에서 '공유하는'이라는 의미입니다.

✔ main 메소드에 movePage(1); 설정하고 회원가입 버튼 클릭 시 Main.movePage(2); 설정

- ✔ JoinPanel 클래스에 < 버튼 클릭 시 로그인 페이지로 넘어가도록 하기

    ```java
    bt_back.addActionListener(newActionListener() {
    @Override
    public void actionPerformed(ActionEvente) {
    Main.movePage(1);
    //Main 클래스를 참조하여 movePage 메서드를 호출합니다 
        }
    });
    ```
---
# 3주차
- 오늘의 완성본

![image](https://user-images.githubusercontent.com/70794506/162482508-42d439e4-bb44-4e19-bc87-4da3d0d44ea1.png)

# `JoinPanel` 클래스 추가 구현

- 비밀번호 입력칸의 값과 비밀번호 확인 입력칸의 값이 같은지 검사
- 같다면 '비밀번호 확인이 되었습니다' 를 창에 띄웁니다
- 다르다면 '비밀번호를 다시 확인해주세요' 를 창에 띄웁니다
- 가입하기 버튼 수정

    ```java
    JButton bt_join = new JButton("가입하기");
    bt_join.setBounds(120,350,260,30);
    bt_join.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            String myPass=String.valueOf(pw_field.getPassword()); //하단의 설명 참조
            String myPass2=String.valueOf(check_pw_field.getPassword());

            if (myPass.equals("")||myPass2.equals("")){
                System.out.println("null값이 들어왔습니다");

            }else if (myPass.equals(myPass2)){
                System.out.println("비밀번호 확인이 되었습니다");
            }
            else{
                System.out.println("비밀번호를 다시 확인해주세요");
            }
            /*System.out.println("회원가입을 요청했습니다");*/
        }
    });
    add(bt_join);
    ```

    > valueOf 란?

    **String 객체에서 제공해주는 기능으로 , 매개변수로 들어오는 것을 문자열로 바꿔줍니다**

    > equals란 ?   **두 개의 문자열을 비교하는 기능**

    `**비교대상문자열.equals(비교할 문자열)**`

- 문구 만들기 - FAIL

    ```java
    /*비교 문구 FAIL*/
    JLabel check_pw_FAIL = new JLabel("비밀번호를 다시 확인해주세요");
    check_pw_FAIL.setBounds(200,290,200,30);
    check_pw_FAIL.setForeground(new Color(102,0,153));
    add(check_pw_FAIL);
    check_pw_FAIL.setVisible(false);
    /*비교 문구 END*/
    ```

    - 확인에 실패했을때만 문구가 나와야 하므로 `**setVisible**`을 사용합니다
- 문구 만들기 - OK

    ```java
    /*비교 문구 OK*/
    JLabel check_pw_OK = new JLabel("비밀번호 확인이 되었습니다");
    check_pw_OK.setBounds(200,290,200,30);
    check_pw_OK.setForeground(new Color(0,128,0));
    add(check_pw_OK);
    check_pw_OK.setVisible(false);
    /*비교 문구 END*/
    ```

    - 입력후 성공했을때만 문구가 나와야 하므로 `**setVisible**`을 사용합니다
- 조건문 수정 -1

    ```java
    public void actionPerformed(ActionEvent e) {
        String myPass=String.valueOf(pw_field.getPassword());
        String myPass2=String.valueOf(check_pw_field.getPassword());

        if (myPass.equals("")||myPass2.equals("")){
          
            check_pw_FAIL.setVisible(true);

        }else if (myPass.equals(myPass2)){
           
            check_pw_OK.setVisible(true);
        }
        else{
      
            check_pw_FAIL.setVisible(true);
        }
        /*System.out.println("회원가입을 요청했습니다");*/
    }
    ```

    💥 문제가 있습니다! 

    - 실패했을때 나오는 문구와 성공했을때 나오는 문구가 겹치는 경우가 생깁니다
- 조건문 수정 -2

    ```java
    public void actionPerformed(ActionEvent e) {
        String myPass=String.valueOf(pw_field.getPassword());
        String myPass2=String.valueOf(check_pw_field.getPassword());
        if (myPass.equals("")||myPass2.equals("")){
            check_pw_OK.setVisible(false);
            check_pw_FAIL.setVisible(true);//

        }else if (myPass.equals(myPass2)){
            check_pw_FAIL.setVisible(false);
            check_pw_OK.setVisible(true);//
        }
        else{
            check_pw_OK.setVisible(false);
            check_pw_FAIL.setVisible(true);//
        }
        /*System.out.println("회원가입을 요청했습니다");*/
    }
    ```



# `MainPanel` 클래스 생성

- `JPanel` 상속 받기
- 전역변수 선언

    ```jsx
    static JTextArea textArea;
    ```

    - `JTextArea` 란? 예시 🔽

        [https://digiconfactory.tistory.com/entry/%EC%9E%90%EB%B0%94-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-10-3-Java-Swing-JTextField-%EC%98%88%EC%A0%9C-%EA%B3%84%EC%82%B0%ED%95%98%EA%B8%B0](https://digiconfactory.tistory.com/entry/%EC%9E%90%EB%B0%94-%ED%8A%9C%ED%86%A0%EB%A6%AC%EC%96%BC-10-3-Java-Swing-JTextField-%EC%98%88%EC%A0%9C-%EA%B3%84%EC%82%B0%ED%95%98%EA%B8%B0)

    - **여러 줄의 긴 문장을 입력할 수 있는 양식입니다.**
- 기본 생성자 구현

    ```jsx
    public MainPanel() {
            setView();

            setBackground(Color.pink);
            setSize(500, 500);
            setLayout(null);
        }
    ```

## private void setView() 메서드 생성

- 채팅박스 만들기

    ```jsx
    textArea = new JTextArea();
            JScrollPane scrollPane = new JScrollPane(textArea); //스크롤 기능
            scrollPane.setBounds(3, 10, 480, 300);
            add(scrollPane);
    ```

- 메시지를 보낼 입력칸 생성

    ```jsx
    JTextField text = new JTextField();
            text.setBounds(120, 350, 190, 30);
            add(text);
    ```

- 전송 버튼 생성

    ```jsx
    JButton submit = new JButton("전송");
            submit.setBounds(320, 350, 60, 30);
            submit.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (text.getText().equals("")) {
                        return;
                    } else {
                         textArea.append(text.getText()+"\n");
                         //text.setText(""); //이전에 입력했던 값을 지워줍니다
                         System.out.println("전송됨");
                    }

                }
            });
            add(submit);
    ```

    - get은 '가져오다' '가지다' 라는 의미로써 text_field의 값을 가져온다는 뜻으로 연결됩니다

    👏주석 처리 되어 있는 `**text.setText("")**` 를 활성화 해줘야만 전송 버튼을 눌렀을때 입력되어 있던 값이 초기화 됩니다

    - set은 '어떠한 일이 일어나게 하다' 라는 의미로써 text_field의 값을 괄호의 값으로 변경한다는 뜻으로 연결됩니다

---

- 로그인 화면으로 이동 버튼 만들기

    ```jsx
    JButton bt_back = new JButton("로그인 화면으로 이동");
            bt_back.setBounds(120, 400, 260, 30);
            bt_back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Main.movePage(1);
                }
            });
            add(bt_back);
    ```

- 엔터를 쳤을경우 채팅박스에 전송되도록 만들기

    ```jsx
    			/*엔터키 액션*/
            Action ok = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textArea.append(text.getText()+"\n"); //입력값 전송
                    text.setText("");
                    textArea.setCaretPosition(textArea.getDocument().getLength()); 
    								//마지막에 있는 text 값의 길이를 반환
    								//맨 아래로 스크롤합니다
                    text.setText("");
                }
            };
            KeyStroke enter = KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false);
            text.getInputMap(JTable.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT).put(enter, "ENTER");
            text.getActionMap().put("ENTER", ok);
            /*엔터키 액션 끝*/
    ```

## `MAIN` 클래스에 `MainPanel` 추가

1️⃣전역변수 선언

2️⃣ `private static MainPanel mainPage;`

3️⃣ 객체 생성후 `JFrame` 안에 추가

```java
mainPage = new MainPanel();
    f.add(mainPage);
```

4️⃣ `movePage` 메서드 안에 추가

5️⃣ `mainPage.setVisible(false);`

- switch

    ```java
    case 3:
    f.setTitle("Chat - 채팅 화면");
    mainPage.setVisible(true);
        break;
    ```

## `Login` 이벤트에 `MainPanel` 추가 - 화면 이동

```java
/*로그인 이벤트*/
bt_login.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        Main.movePage(3);
				/*System.out.println("로그인을 요청했습니다");*/
    }
});
---
# 4주차
- 오늘의 완성본

![image](https://user-images.githubusercontent.com/70794506/162482735-34108ba1-1fb0-43e5-b3f3-99cd02ef785d.png)

## 환경설정 페이지 만들기

- 🖐**URL(Uniform Resource Locator)**
    - 인터넷 상의 자원에 대한 주소

    ![https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e3f16616-a9be-467d-9de1-05a2a84fb3fe/Untitled.png](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e3f16616-a9be-467d-9de1-05a2a84fb3fe/Untitled.png)

    http

    - http는 프로토콜(규약) 으로 브라우저가 어떤 통신 규약(약속)을 사용해야 하는지를 나타내는데 보통 웹사이트들을 HTTP 프로토콜이나 HTTPS 프로토콜을 사용합니다.
    - 경우에 따라 메일 전송을 위한 mailto: 또는 파일을 전송하기 위해 ftp: 와 같은 다른 프로토콜을 사용합니다.

    도메인이름

    - www.yundu.co.kr은 도메인이름으로 웹 서버의 주소를 가리키는데 직접 IP address를 사용하는 것도 가능하지만 일반적으로 도메인이름을 사용해서 웹 서버에 접속합니다.

    port

    - :80은 포트라고 하는데 웹 서버의 자원에 접근하기 위해 사용하는 "관문(gate)"역할을 합니다.
    - 웹 서버의 자원의 접근하기 위해 표준 HTTP 포트(80) 또는 HTTPS를 사용한다면 포트(443) 포트번호는 보통 생략하고 다른 포트의 경우에는 필수적으로 작성해주어야합니다.
- SettingPanel 클래스 만들기
    1. Panel 패키지를 우클릭하고 New > Java Class 를 클릭합니다.
    1. SettingPanel 이라고 입력하고 엔터를 누릅니다.
    1. extends 키워드를 사용하여 JPanel을 상속 받습니다. 
- SettingPanel 생성자 만들기

    ```java
    public SettingPanel(){
            setView();

            setBackground(Color.PINK);
            setSize(500,500);
            setLayout(null);
        }
    ```

- setView 메소드 만들기
    - 접근제어자: private, 반환 타입: 없음(void)
    - 도메인 입력창 생성
    - 포트 입력창 생성
    - 저장, 취소 버튼 생성

    ```java
    private void setView() {
            JLabel label_server = new JLabel("SERVER");
            label_server.setBounds(120,100,60,30);
            add(label_server);
            server = new JTextField();
            server.setBounds(180,100,200,30);
            add(server);
            JLabel label_port = new JLabel("PORT");
            label_port.setBounds(120,150,60,30);
            add(label_port);
            port = new JTextField();
            port.setBounds(180,150,200,30);
            add(port);

            JButton bt_save = new JButton("저장");
            bt_save.setBounds(120,220,260,30);
    				bt_save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
    						
    						}
    				});
    				add(bt_save);
            JButton bt_back = new JButton("취소");
            bt_back.setBounds(120,260,260,30);
            bt_back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Main.movePage(1);
                }
            });
            add(bt_back);
        }
    ```

- SettingData 만들기
    - server와 port를 입력하여 저장버튼을 누르면 객체화해서 파일에 저장하도록 해야합니다.
    서버와 포트 정보를 객체화하기 위해서 해당 정보를 담는 SettingData라는 클래스를 만들어봅시다!
    1. com.daelim.five1에 우클릭하여 Data라는 새로운 패키지를 만듭니다.
    2. Data 패키지를 우클릭하고 New > Java Class 를 클릭합니다.
    3. SettingData 라고 입력하고 엔터를 누릅니다.
    4. implements키워드를 사용하여 Serializable을 상속 받습니다. 

    java.io.Serializable 인터페이스
    - Serializable은 구현의 목적이 아닌 마킹의 기능이 있는 인터페이스입니다.
    - 클래스가 [직렬화](https://techblog.woowahan.com/2550/)가 가능하도록 하는데 사용되므로 인스턴스의 저장이 필요한 클래스에 구현해 주어야 합니다.

    ```java
    public class SettingData implements Serializable {
        private String server, port; // 서버와 포트 정보 선언

    /* 기본 생성자 */
        public SettingData() {
            
        }
    /* 서버와 포트의 정보를 받아서 초기화하는 생성자 */
        public SettingData(String ser, String po){
            setServer(ser);
    				setPort(po);
        }
    /* Getter, Setter */
        public String getServer() {
            return server;
        }

        public void setServer(String server) {
            this.server = server;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }

    }
    ```

    **Getter/Setter (단축키: alt+insert)
    외부에서 꺼내서 쓰거나 외부에 있는 값을 입력할 수 있는 메소드**
    정보를 가져오는 메소드를 Getter,
    정보를 바꾸는 메소드를 Setter 라고 부른답니다.

- 저장 버튼 이벤트 추가하기

    ```java
    bt_save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
    								// 입력 받은 서버와 포트값 받아와서 출력하기
                    System.out.println("SERVER : "+server.getText()+", PORT: "+port.getText());
    								
    								// 입력값이 없을 때 팝업창 띄우기
                    if(server.getText().equals("")){
                        JOptionPane.showMessageDialog(Main.f,"서버 정보가 입력되지 않았습니다.");
                        return;  // 더이상 밑의 내용 진행X (저장X)
                    }
                    if(port.getText().equals("")){
                        JOptionPane.showMessageDialog(Main.f,"포트 정보가 입력되지 않았습니다.");
                        return;
                    }
                    [try](https://www.notion.so/4-665b0d8c701f4e2084af659add5455a7) {
    										// 정상적으로 값이 들어오면 서버 정보와 포트 정보를 한번에 넣는 SettingData 객체 만들기(객체화) 
                        SettingData data;
                        data = new SettingData(server.getText(), port.getText());
    										
    										// 파일에 저장
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d://settingData.txt"));
                        String [write_value](https://www.notion.so/4-665b0d8c701f4e2084af659add5455a7) = "ws://" + data.getServer() + ":" + data.getPort();
    										out.writeObject(write_value);
                        out.close();

                        FileInputStream fis = new FileInputStream("d://settingData.txt");
                        ObjectInputStream in = new ObjectInputStream(fis);
                        in.readObject();
                        in.close();
                    }catch (Exception ex){
                        ex.printStackTrace();  // 에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 출력한다.
                        JOptionPane.showMessageDialog(Main.f,"파일이 정상적으로 생성되지 않았습니다.");
                        return;
                    }
                    Main.movePage(1);
                }
            });
    ```

    **try-catch문
    try{
        예외 발생 가능 코드
    } catch(예외클래스 e) {
        예외 처리
    } finally {
        항상 실행
    }**

    그럼, D드라이브에 만들어진 파일을 확인해 봅시다.

- private void setView() 완성 한번에 보기

    ```java
    private void setView() {
       
         JLabel label_server = new JLabel("SERVER");
            label_server.setBounds(120,100,60,30);
            add(label_server);
            server = new JTextField();
            server.setBounds(180,100,200,30);
            add(server);
            JLabel label_port = new JLabel("PORT");
            label_port.setBounds(120,150,60,30);
            add(label_port);
            port = new JTextField();
            port.setBounds(180,150,200,30);
            add(port);

            JButton bt_save = new JButton("저장");
            bt_save.setBounds(120,220,260,30);
            bt_save.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println("SERVER : "+server.getText()+", PORT: "+port.getText());

                    if(server.getText().equals("")){
                        JOptionPane.showMessageDialog(Main.f,"서버 정보가 입력되지 않았습니다.");
                        return;
                    }
                    if(port.getText().equals("")){
                        JOptionPane.showMessageDialog(Main.f,"포트 정보가 입력되지 않았습니다.");
                        return;
                    }
                    try {
                        SettingData data;
                        data = new SettingData(server.getText(), port.getText());

    										/*파일 쓰기 시작*/
                        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("d://settingData.txt"));
                        String write_value = "ws://" + data.getServer() + ":" + data.getPort();
    										out.writeObject(write_value);
                        out.close();
    										/*파일 쓰기 끝*/

    										/*파일읽기_start*/
                        FileInputStream fis = new FileInputStream("d://settingData.txt");
                        ObjectInputStream in = new ObjectInputStream(fis);
                        in.readObject();
                        in.close();
    										/*파일읽기_end*/

                    }catch (Exception ex){
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(Main.f,"파일이 정상적으로 생성되지 않았습니다.");
                        return;
                    }
                    Main.movePage(1);
                }
            });
            add(bt_save);
            JButton bt_back = new JButton("취소");
            bt_back.setBounds(120,260,260,30);
            bt_back.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    Main.movePage(1);
                }
            });
            add(bt_back);
        }
    ```

---

## 마무리1 🖐 메인 페이지에 환경설정 페이지 넣기

---

- 1️⃣ 전역변수 선언하기

    `private static SettingPanel settingPage;`

- 2️⃣ 객체 생성

    `settingPage = new SettingPanel();`

- 3️⃣ `JFrame` 에 추가

    `f.add(settingPage);`

- 4️⃣ `movePage` 메서드에 추가

    `settingPage.setVisible(false);`

- 5️⃣ `switch` 문에 추가

    ```jsx
    case 4:
    	f.setTitle("Chat - 환경설정 화면");
    	settingPage.setVisible(true);
    	break;
    ```

### Main 최종 완성 코드

- 한번에 보기

    ```jsx
    public class Main {

        public static JFrame f;
        private static LoginPanel loginPage;
        private static MainPanel mainPage;
        private static JoinPanel joinPage;
        private static SettingPanel settingPage;
     
    public static void main(String[] args) {
            f = new JFrame();

            loginPage = new LoginPanel();
            f.add(loginPage);
            mainPage = new MainPanel();
            f.add(mainPage);
            joinPage = new JoinPanel();
            f.add(joinPage);
            settingPage = new SettingPanel();
            f.add(settingPage);

            f.setSize(500, 500);
            f.setLayout(null);
            f.setVisible(true);

            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            movePage(1);
        }

        public static void movePage(int index) {
            loginPage.setVisible(false);
            mainPage.setVisible(false);
            joinPage.setVisible(false);
            settingPage.setVisible(false);

            switch (index) {
                case 1:
                    f.setTitle("Chat - 로그인 화면");
                    loginPage.setVisible(true);
                    break;
                case 2:
                    f.setTitle("Chat - 체팅 화면");
                    mainPage.setVisible(true);
                    break;
                case 3:
                    f.setTitle("Chat - 회원가입 화면");
                    joinPage.setVisible(true);
                    break;
                case 4:
                    f.setTitle("Chat - 환경설정 화면");
                    settingPage.setVisible(true);
                    break;
            }
    }
    ```

---

## 마무리2 🖐

✔ 실행해 봅시다!

- **SERVER** 부분에 아래의 값을 입력 해주세요
    - `echo.websocket.org`
- **PORT** 부분에 아래의 값을 입력해주세요
    - `443`

✔ D드라이브에 파일을 열어서 아래의 값과 같은지 확인해보세요

- `wss://echo.websocket.org:443`

---

마지막으로 3주차에 숙제 잊지 마세용 ‼️

---

[최종 완성본 - LoginPanel](https://www.notion.so/LoginPanel-59999258bc7f4de9a4fd3566b64ddaa8)

[최종 완성본 - JoinPanel](https://www.notion.so/JoinPanel-2da44605da774107a80420e65bc1f678)

[최종 완성본 - MainPanel](https://www.notion.so/MainPanel-738d5ed879324787983f412629462f23)

[최종 완성본 - Main.class](https://www.notion.so/Main-class-de15f8cf4f044f10ab263e10e2727031)

[최종 완성본 - SettingPanel](https://www.notion.so/SettingPanel-0e7c3f9d71e242db9558e75359402a31)
---
# 5주차
- 오늘의 완성본

![image](https://user-images.githubusercontent.com/70794506/162482802-961c00e6-9c04-4f2a-8e9b-799ff5a7e77d.png)

## 직렬화란?

[간단한 설명](https://www.notion.so/7e0e5fcde44645e09264c260af636c08)

---

## `websoket` 이란?

- **INTRO**
    - 웹 애플리케이션(브라우저)과 서버 간의 양방향 통신 기능을 제공합니다.
    - 채팅에 사용되는 구체적 이유

        ![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/e52727c9-b46f-40d6-a66a-21af808d0086/Untitled.png)

        보통의 웹 서비스는 주고받고를 반복하지만 websoket은 한쪽이 여러번 보내고 받을 수 있다 - 채팅에 사용가능

    - WebSocketServer  , WebSocketClient 로 나뉩니다
    - client 부분은 저희가 구현하고
    - server 부분은 WebSocket테스트 페이지를 이용하겠습니다
- **라이브러리 추가**

    🎵 ~다운을 받아요~ 🎵 ⬇️

    [lib.zip](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/cd4b5a53-df3c-4bc9-b700-3e830dad566b/lib.zip)

    - File 메뉴탭을 선택해요
    - Project Structure 를 선택해요
    - Libraries 메뉴를 선택해요
    - 플라스 눌러요
    - JAVA를 선택해요
    - 다운받은 파일들을 불러와요~🎵
- **구현과정 <`Main.class`>**
    - 1️⃣ 전역변수 선언
        - 선언
            - 접근 제어자는 없습니다
            - 모두 static을 사용하여 선언합니다
            1. WebSocketClient 자료형으로 변수 ws 선언
            2. String 타입으로 변수 user  선언 후 빈값 할당
            3. String 타입으로 변수 s_s  선언

            ---

    - 2️⃣ connect 메서드 생성
        - 설정
            1. 퍼블릭
            2. 리턴 없음
            3. static 사용
            4. 매개변수 → String 타입 ID

        1. try catch 문 생성후 `**WebSocketClient**` 객체를 생성합니다 (! 중괄호 끝에 세미콜론)
        2. 생성된 객체 안에 new 키워드로 `**URI**` 객체를 겹쳐 불러옵니다

        ---

     —  setting 판넬에서 생성된 파일의 값을 / Main에서 받아 / URI 안에 넣어줄겁니다

    - 3️⃣ setting 판넬로 이동합니다
        1. 파일에서 원하는 문자열을 추출하도록 구현합니다
            - 사전 설명

                [`substring`, `indexOf` 설명](https://www.notion.so/substring-indexOf-093ac4f0a0b04187ae4430936364054a)

            - 추출 과정
                1. readObject() 는 반환형이 Object 입니다
                2. toString을 사용하여 문자열 변수에 담아둡니다

                     `String f_line = in.readObject().toString();`

                3. indexOf("ws://") 을 사용하여 반환된 인덱스 값을 int형 변수에 담습니다 
                4. subString() 메서드를 호출합니다
                5. 섭스트링의 매개변수로 index 값을 넣어줍니다
                6. 최종 코드

                ```jsx
                /*파일 읽기 start*/
                FileInputStream fis = new FileInputStream("d://settingData.txt");
                ObjectInputStream in = new ObjectInputStream(fis);

                String f_line = in.readObject().toString();
                int first = f_line.indexOf("ws://");
                String e_line = f_line.substring(first);
                Main.uri(e_line);
                in.close();
                /*파일 읽기 end*/
                ```

    - 4️⃣ 추출된 문자열을 Main으로 보내도록 구현합니다
        - Main에 받는 역할을 하는 메서드를 만듭니다

            public static void uri(String uri) { 

            URI = uri;

            }

            - 받는 메서드가 있다면 받는 변수도 필요하겠죠?
            - 전역 변수로 `private static String URI;` 를 선언합니다

            ---

        — `settingPanel` 에서 `**Main.uri()**` 를 소환합니다

        ---

    - 5️⃣ Main.class로 이동합니다

         `URI` 객체 안에 `URI` 변수를 소환합니다

        [WebSocetClient - Override](https://www.notion.so/WebSocetClient-Override-83c6ed19711c4da5be198dbd6c5c315f)

        [sendMessage() 구현](https://www.notion.so/sendMessage-91cd6786bfd848f4a7ac37711f3f49e5)

---

## `settingPanel`을 통해 테스트 해봅시다!

---

- **SERVER** 부분에 아래의 값을 입력 해주세요
    - `demo.piesocket.com/v3/channel_1?api_key=oCdCMcMPQpbvNjUIzqtvF1d2X2okWpDQj4AwARJuAgtjhzKxVEjQU6IdCjwm&notify_self`
    - port 번호 원래 넣어야 하는데 도메인에 이미 추가되어 버려서 포트 번호는 필요 없습니다
    - settingPanel에 포트정보관련 코드를 지우겠습니다

        ```jsx
        /*if(port.getText().equals("")){
               JOptionPane.showMessageDialog(Main.f,"포트 정보가 입력되지 않았습니다");
               return;
        }*/
        ```

        ```jsx
        String write_value = "ws://" + data.getServer() + ":"; //+ data.getPort();
        ```

---

— 해당 도메인을 얻을 수 있는 테스트 사이트 입니다

[https://www.piesocket.com/websocket-tester#](https://www.piesocket.com/websocket-tester#)

---

- **로그인에 로직 추가**

    세팅창을 거치지 않고 실행해봅시다 오류가 뜨지요?

    ---

    세팅창에서는 파일을 불러와 Main에 전달하는 기능이 있지만

    로그인 창에는 없기 때문입니다

    ---

    로그인 액션 버튼에 파일 읽는 부분을 추가해줍시다

    try{ Ctrl+c v 으하하ㅏ}catch(){ 야바다브라드바다 } 

# 끝
