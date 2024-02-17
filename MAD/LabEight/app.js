localStorage.setItem("username","rvce");
localStorage.setItem("pass","rvce");

function verify(){

let username = document.getElementById("username").value;
let password = document.getElementById("password").value;
let un = localStorage.getItem("username");
let pas = localStorage.getItem("pass");

if( username==un && password==pas){
alert("Authentication Completed. Initiating Registration");
register();
}else{
alert("authentication failure");
}

}




function register(){
if ('serviceWorker' in navigator) {
	navigator.serviceWorker
	.register("sw.js")
	.then((reg)=>console.log("registered",reg))
	.catch((err)=>console.log("err",err));
} else {
	console.log('No service worker support in this browser');
}
}



function unregister() {
    if ('serviceWorker' in navigator) {
        navigator.serviceWorker
        .getRegistrations()
        .then((registrations) => {
                registrations.forEach((registration) => {
                    registration.unregister()
                        .then(() => console.log("Service Worker unregistered"))
                        .catch((err) => console.error("Service Worker unregistration failed:", err));
                });
            });
    }
}