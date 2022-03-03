let defUrl = "http://192.168.2.32:4000/test";


function promisePrendiDati(method, url) {
    return new Promise((resolve, reject) => {
        let xhreq = new XMLHttpRequest(); //instanzio una richiesta http
        xhreq.open(method, url); /*apro la richiesta http utilizzando 
        get o post su un determinato url*/
        xhreq.send(); // invio la richiesta
        xhreq.onload = () => {
            resolve(xhreq.response); // se la richiesta è inviata con successo risolvo la promise
        };
    });
}

function invioDati(method, url) {
    let data = {
        email: "themaster@ilveromaestro.chad",
        numero: 100200300,
    };
    let xhreq = new XMLHttpRequest();
    xhreq.open(method, url);
    xhreq.setRequestHeader('Content-Type', 'application/json');
    xhreq.responseType = "json";

    xhreq.send(JSON.stringify(data));
    xhreq.onload = () => {
        if (xhreq.status >= 400) {
            console.log("Hai sbagliato qualcosa");
        }
        else {
            console.log("Tutto ok");
        }
    }
}

function promiseInvioDati(method, url) {

    var email = document.getElementById("email").value;
    var numero = document.getElementById("numero").value;
    var indirizzo = document.getElementById("indirizzo").value;
    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var descrizione = document.getElementById("descrizione").value;

    var data = {
        email: email,
        numero: numero,
        indirizzo: indirizzo,
        nome: nome,
        cognome: cognome,
        descrizione: descrizione

    };

    return new Promise((resolve, reject) => {

        let xhreq = new XMLHttpRequest(); //instanzio una richiesta http
        xhreq.open(method, url);
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";

        xhreq.send(JSON.stringify(data));
        xhreq.onload = () => {
            if (xhreq.status >= 400) {
                console.log("Hai sbagliato qualcosa");
                reject(xhreq.reject);
            }
            else {
                resolve(xhreq.response);
                console.log("Tutto ok");
            }
        };
        xhreq.onerror = () => {
            console.log("caosjfjoijgf");
        }

    });

}

//invioDati('POST', defUrl);
//promiseInvioDati('POST',defUrl)
console.log(promisePrendiDati("GET", defUrl));

