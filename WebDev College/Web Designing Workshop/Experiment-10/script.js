let inp = document.querySelector("input");
let btn = document.querySelector("button");
let ul = document.querySelector("ul");

btn.addEventListener("click", function() {
    if (inp.value.trim() === "") 
        return; // Prevent empty tasks

    let task = document.createElement("li");
    task.innerText = inp.value + "          ";
    ul.appendChild(task);
    console.log("task added")
    inp.value = "";

    let delbtn = document.createElement("button");
    delbtn.classList.add("delete");
    delbtn.innerText = "Delete"
    task.appendChild(delbtn);
});

ul.addEventListener("click", function(event) {
    if (event.target.nodeName == "BUTTON") {
        listItem = event.target.parentElement;
        listItem.remove();
        console.log("task deleted")
    }
        
})