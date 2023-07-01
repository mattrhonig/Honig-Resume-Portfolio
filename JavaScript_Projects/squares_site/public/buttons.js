document.addEventListener("DOMContentLoaded", function () {
    var buttons = document.getElementById("buttons");
    var buttonElements = buttons.getElementsByTagName("a");
  
    for (var i = 0; i < buttonElements.length; i++) {
        var button = buttonElements[i];
        button.addEventListener("mouseover", function () {
            this.classList.add("hover");
        });
        button.addEventListener("mouseout", function () {
            this.classList.remove("hover");
        });
    }
});
