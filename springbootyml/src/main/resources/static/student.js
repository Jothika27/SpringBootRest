const uri = "http://localhost:8080/students/";
let students = [];
let updateIndex = 0;
function getItems() {
    var xhttp = new XMLHttpRequest();
    xhttp.onreadystatechange = function () {
        if (this.readyState == 4 && this.status == 200) {
            students = JSON.parse(xhttp.responseText);
            _displayItems(JSON.parse(xhttp.responseText));
        }
    };
    xhttp.open("GET", uri, true);
    xhttp.send();
}