## RESTful Service의 JSONP 를 지원하는 MVC interceptor 예제입니다.
----------------------------------------
* Spring 설정 파일에 다음과 같은 내용을 추가합니다.
**markdown**
<mvc:interceptors>
     	<mvc:interceptor>
     		<mvc:mapping path="[적절한 경로]" />
     		<bean id="jsonpHandler" 
     			class="com.multi.contacts.view.controller.JsonpHandler"></bean>
     	</mvc:interceptor>
</mvc:interceptors>
**markdown**
