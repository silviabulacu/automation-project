function myAlert() {
    window.alert("This is a pop-up!");
}

 function validateForm() {
    var userInput = document.getElementById("usernameInput").value;

    if (userInput.length < 8 || userInput.length > 30) {
        alert("Username must be between 8 and 30");
        return false;
    }

    if(termsCheckbox.checked === false) {
        alert("You must agree to the terms and conditions");
            return false;
    }

    return true;
}