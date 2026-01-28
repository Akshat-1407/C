const form = document.getElementById('myForm');
const emailInput = document.getElementById('email');
const phoneInput = document.getElementById('phone');

form.addEventListener('submit', function(event) {
    event.preventDefault(); 
    
    // Phone Number Validation
    let isPhoneValid = true;
    const phoneValue = phoneInput.value.trim();
    
    if (phoneValue.length !== 10) {
        alert("Phone Number must contain exactly 10 digits.");
        isPhoneValid = false;
    }

    if (isPhoneValid) {
        const allowedDigits = '0123456789';

        for (let i = 0; i < phoneValue.length; i++) {
            if (!allowedDigits.includes(phoneValue[i])) {
                alert("Phone Number should contain only digits (0-9).");
                isPhoneValid = false;
                break;
            }
        }
    }

    // Email Validation
    let isEmailValid = true;
    const emailValue = emailInput.value.trim();

    const emailRegex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[A-Za-z]{2,}$/;
    
    if (!emailRegex.test(emailValue)) {
        alert("Please enter a valid E-mail ID (e.g. name@domain.com).");
        isEmailValid = false;
    }

    if (isPhoneValid && isEmailValid) {
        alert("Form Submitted Successfully!");
    }
});
