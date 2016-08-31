/**
 * 
 */

$(function(){
    $("#newUser").click(function(){
        $("#form").load("resources/Forms.html #SignUpForm", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#regUser").click(function(){
        $("#form").load("resources/Forms.html #SignInForm", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#home").click(function(){
        $("#mainDataUnsigned").load("resources/contentUnsigned.html #mainHome", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#aboutUs").click(function(){
        $("#mainDataUnsigned").load("resources/contentUnsigned.html #mainAboutUs", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#ourPrices").click(function(){
        $("#mainDataUnsigned").load("resources/contentUnsigned.html #mainOurPrices", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#imageGallery").click(function(){
        $("#mainDataUnsigned").load("resources/contentUnsigned.html #mainImageGallery", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#contactUs").click(function(){
        $("#mainDataUnsigned").load("resources/contentUnsigned.html #mainContactUs", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    
    $("#dashBoard").click(function(){
        $("#mainDataSigned").load("resources/contentSigned.html #mainDashBoard", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#bookACab").click(function(){
        $("#mainDataSigned").load("resources/contentSigned.html #mainBookACab", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#bookedHistory").click(function(){
        $("#mainDataSigned").load("resources/contentSigned.html #mainBookedHistory", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
    
    $("#rateCard").click(function(){
        $("#mainDataSigned").load("resources/contentSigned.html #mainRateCard", function(responseTxt, statusTxt, jqXHR){
            if(statusTxt == "success"){
            }
            if(statusTxt == "error"){
                alert("Error: " + jqXHR.status + " " + jqXHR.statusText);
            }
        });
    });
});
