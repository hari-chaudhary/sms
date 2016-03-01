 
function makeAjaxCall(){
   	var sendToSend = JSON.stringify(serializeObject($('#studentForm')));
	$.ajax({
		url: '/SchoolManagementSystem/student/add',
		type: 'POST',
//		dataType: "json",           // Accepts
 		data:sendToSend,
 		contentType: 'application/json',   // Sends
		success: function(student){
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> New Student Information <H3>');                
			$('#formInput').append("<H4 align='center'>First Name:  " + student.firstName + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " + student.lastName  + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " + student.email  + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'studentForm\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			make_hidden('errors');
		},

		error: function(jqXHR,  textStatus,  exception ){	
			
			if (jqXHR.responseJSON.errorType == "ValidationError") {
	 			$('#errors').html("");
	 			$("#errors").append( '<H3 align="center"> Error(s)!! <H3>');                
	  			    $("#errors").append( '<p>');
	  	
	  			    var errorList = jqXHR.responseJSON.errors;
	 	 	        $.each(errorList,  function(i,error) {			   
	 		    		$("#errors").append( error.message + '<br>');
			    	});
	 	 	        $("#errors").append( '</p>');
	 	 	      make_visible('errors');
			}
			else {
				alert(jqXHR.responseJSON.message);
			}
		}
	
	});
}

toggle_visibility = function(id) {
    var e = document.getElementById(id);
    if(e.style.display == 'block')
       e.style.display = 'none';
    else
       e.style.display = 'block';
 }	

make_hidden = function(id) {
    var e = document.getElementById(id);
        e.style.display = 'none';
        }	   

make_visible = function(id) {
    var e = document.getElementById(id);
    e.style.display = 'block';
 }	   

resetForm = function(id) {
    var e = document.getElementById(id);
    $(e)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
 function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
	    });
	return jsonObject;

};

