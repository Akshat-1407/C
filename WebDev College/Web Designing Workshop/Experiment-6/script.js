const form = document.getElementById('myForm');
const nameInput = document.getElementById('name');
const passInput = document.getElementById('pass');

form.addEventListener('submit', function (event) {
    event.preventDefault();

    // Name Validation
    let isNameValid = true;
    const nameValue = nameInput.value;

    if (nameValue.length <= 6) {
        alert("Name length must be more than 6 characters.");
        isNameValid = false;
    }

    if (isNameValid) {
        const allowedChars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ';

        for (let i = 0; i < nameValue.length; i++) {
            if (!allowedChars.includes(nameValue[i])) {
                alert("Name should contain only alphabets.");
                isNameValid = false;
                break;
            }
        }
    }

    // Password Validation
    let isPassValid = true;
    const passValue = passInput.value;

    if (passValue.length <= 6) {
        alert("Password length must be more than 6 characters.");
        isPassValid = false;
    }

    if (isNameValid && isPassValid) {
        alert("Form Submitted Successfully!");
    }
});
