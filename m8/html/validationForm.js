
/* 
	Mike Gomes Camara
   	ID: 32783992
   	Date: 12/April/2016
   	Creating a validation form in JS 
*/

function funcValidateForm()  
{  	
	var name = document.registrationForm.name;  
	var surname = document.registrationForm.surname;  
	var email = document.registrationForm.email;  
	var dob = document.registrationForm.dob;  
	var sport = document.registrationForm.sport;  
	

	if(onlyLetter(name))  
	{  
		if(onlyLetterSur(surname))  
		{ 
			if(ValidateEmail(email))  
			{
				if(alphanumeric(dob))  
				{    
					if(selectSport(sport))  
					{  
	 
 
					}  
				}   
			}  
		}   
	}  
  
return false;  
  
}

/* Validate if field name contains only letters */
function onlyLetter(name)  
{   
	var letters = /^[A-Za-z]+$/;  
	if(name.value.match(letters))  
	{	  
		return true;  
	}  
	else  
	{  
		alert('Insert a valid name');  
		name.focus();  
		return false;  
	}  
}  

/* Validate if field surname contains only letters an numbers */
function onlyLetterSur(surname)  
{   
	var letters = /^[0-9a-zA-Z]+$/;  
	if(surname.value.match(letters))  
	{  
		return true;  
	}  
	else  
	{  
		alert('Insert a valid surname');  
		surname.focus();  
		return false;  
	}  
}

/* Validate if field email contains only letters, numbers,
   and other characteres that must have in a email field */
function ValidateEmail(email)  
{  
	var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;  
	if(email.value.match(mailformat))  
	{  
		return true;  
	}  
	else  
	{  
		alert("Enter a valid email address");  
		email.focus();  
		return false;  
	}  
} 

/* Validate if field DOB contains only letters, numbers or the charcters "/" "." "-"  */
function alphanumeric(dob)  
{   
	var letters = /^[0-9a-zA-Z \/ \. \-'_]+$/;   
	if(dob.value.match(letters))  
	{  
		return true;  
	}  
	else  
	{  
		alert('Enter a valid date');  
		dob.focus();  
		return false;  
	}  
}  

/* Validate if field sport contains is selected or different of default */
function selectSport(sport)  
{  
	if(sport.value == "Default")  
	{  
		alert('Select your favourite sport from the list');  
		sport.focus();  
		return false;  
	}  
	else  
	{  
		alert('Form submitted');  
		window.open(www.it.murdoch.edu.au/cgi-bin/reply1.pl);
		window.location.reload();

		return true;  
	}  
}  
  
  