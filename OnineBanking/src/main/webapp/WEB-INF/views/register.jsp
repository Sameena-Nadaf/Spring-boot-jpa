<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<!-- Created By CodingLab - www.codinglabweb.com -->
<html>
  <head>
    <meta charset="ISO-8859-1">
    
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <style >
       @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.container{
  max-width: 700px;
  width: 100%;
  background-color: #fff;
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
  font-size: 25px;
  font-weight: 500;
  position: relative;
}
.container .title::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 30px;
  border-radius: 5px;
  background: linear-gradient(135deg, #71b7e6, #9b59b6);
}
.content form .user-details{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 20px 0 12px 0;
}
form .user-details .input-box{
  margin-bottom: 15px;
  width: calc(100% / 2 - 20px);
}
form .input-box span.details{
  display: block;
  font-weight: 500;
  margin-bottom: 5px;
}
.user-details .input-box input{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 16px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #ccc;
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}
.user-details .input-box input:focus,
.user-details .input-box input:valid{
  border-color: #9b59b6;
}
 
  
 form input[type="radio"]{
   display: none;
 }
 form .button{
   height: 45px;
   margin: 20px 0
 }
 form .button input{
   height: 100%;
   width: 100%;
   border-radius: 5px;
   border: none;
   color: #fff;
   font-size: 18px;
   font-weight: 500;
   letter-spacing: 1px;
   cursor: pointer;
   transition: all 0.3s ease;
   background: linear-gradient(135deg, #71b7e6, #9b59b6);
 }
 form .button input:hover{
  /* transform: scale(0.99); */
  background: linear-gradient(-135deg, #71b7e6, #9b59b6);
  }
 @media(max-width: 584px){
 .container{
  max-width: 100%;
}
form .user-details .input-box{
    margin-bottom: 15px;
    width: 100%;
  }
 
  }
  .content form .user-details{
    max-height: 300px;
    overflow-y: scroll;
  }
  .user-details::-webkit-scrollbar{
    width: 5px;
  }
  }
  @media(max-width: 459px){
  .container .content .category{
    flex-direction: column;
  }
}


     </style>
   </head>
<body>
  <div class="container">
    <div class="title">Digital Banking Registration</div>
    <div class="content">
      <form:form action="/register" modelAttribute="user" method="POST">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <form:input path="name" placeholder="Enter your name" />
            <form:errors path="name" style="color:red"/>
          </div>
          <div class="input-box">
            <span class="details">Username</span>
            <form:input path="userName" placeholder="Enter your username" />
            <form:errors path="userName" style="color:red" />
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <form:input path="email" placeholder="Enter your email" />
            <form:errors path="email" style="color:red"/>
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <form:input path="phoneNumber" placeholder="Enter your number" />
            <form:errors path="phoneNumber" style="color:red" />
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <form:input path="password" placeholder="Enter your password" />
            <form:errors path="password" style="color:red" />
          </div>
         
        </div>
        
        <div class="button">
          <input type="submit" value="Register">
        </div>
      </form:form>
    </div>
  </div>

</body>
</html>
