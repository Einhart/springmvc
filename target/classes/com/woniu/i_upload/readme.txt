1、导入依赖
	fileupload

2、制作表单
	<form action="" method="post" enctype="multipart/form-data">
		photo:<input type="image" name="photo" /><br />
		<button>go</button>
	</form>

3、交由spring管理
	<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver"/>

4、编写controller方法