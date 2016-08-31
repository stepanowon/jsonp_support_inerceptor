## RESTful Service의 JSONP 를 지원하는 MVC interceptor 예제입니다.
----------------------------------------
* Spring 설정 파일에 다음과 같은 내용을 추가합니다.

&lt;mvc:interceptors&gt;
     	&lt;mvc:interceptor&gt;
     		&lt;mvc:mapping path="[적절한 경로]" /&gt;
     		&lt;bean id="jsonpHandler" 
     			class="com.multi.contacts.view.controller.JsonpHandler"&gt;&lt;/bean&gt;
     	&lt;/mvc:interceptor&gt;
&lt;/mvc:interceptors&gt;

