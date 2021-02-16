/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




var path = window.location.pathname;
console.log(path);
if (path.includes("find-us")) {
    document.getElementById("find-us").classList.add("active");
} else if (path.includes("menu")) {
    document.getElementById("menu").classList.add("active");
} else {
    document.getElementById("home").classList.add("active");
}

