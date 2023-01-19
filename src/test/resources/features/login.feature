Feature: Login page 

  Scenario: Login with different scenario of INVALID inputs  
  
    Given user open the browser 
    And   navigate to the "https://www.kupujemprodajem.com"
    And   user click button which navigate them to the login form  
    When  user enters un as "bojka.bg@gmail.com" and pwd as "Javolimgrafiku1"						 
    And   user click on the login button
    Then text should contains "Pogrešna lozinka" 
    And   browser close
		
  Scenario Outline: Login Data Driven
  
    Given user open the browser 
    And   navigate to the "https://www.kupujemprodajem.com"
    And   user click button which navigate them to the login form  
    When  user enters un as "<email>" and pwd as "<password>"
    And   user click on the login button
    Then text should contains "<expectedMsg>" 
    And browser close

		Examples:
		
			|         email	       |	 password	    |		    expectedMsg		                 |													
			|   bojka.bg@gmail.com |			    |	Polje ne može biti prazno.			 |								
			|   bojka.bg@gmail.com | netacna lozinka            |	Pogrešna lozinka				 |																			   													    								 						
			|   ivanS89@gmail.com  | Javolimgrafiku123	    |	Nalog sa ovom e-mail adresom nije pronađen	 |							
			|		       | !@$FDSFGEFK     	    |	Polje ne može biti prazno.			 |
			|   Bojana             | Javolimgrafiku123          |	Niste uneli ispravan format e-mail adrese.	 |												    								
			|   bojka.bg@gmail.com | fhltrelcot67ljjk788@%^^&)  | 	Lozinka treba da ima između 6 i 20 karatera. 	 |
			|   bojka.bg@gmail.com |  123			    | 	Lozinka treba da ima između 6 i 20 karatera.	 |																							
		
		
