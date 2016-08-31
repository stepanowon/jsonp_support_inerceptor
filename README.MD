## RESTful Service의 JSONP 를 지원하는 MVC interceptor 예제입니다.
----------------------------------------
* Spring 설정 파일에 다음과 같은 내용을 추가합니다.
<pre><code>
&lt;mvc:interceptors&gt;<br />
     	&lt;mvc:interceptor&gt;<br/>
     		&lt;mvc:mapping path="[적절한 경로]" /&gt;<br/>
     		&lt;bean id="jsonpHandler" <br/>
     			class="com.multi.contacts.view.controller.JsonpHandler"&gt;&lt;/bean&gt;<br/>
     	&lt;/mvc:interceptor&gt;<br/>
&lt;/mvc:interceptors&gt;<br/>
</code></pre>

