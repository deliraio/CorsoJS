var urlSet = "http://192.168.2.32:4000/setUserData";
var urlGet = "http://192.168.2.32:4000/getUserData";
var urlUpp = "http://192.168.2.32:4000/updateUserData";
var urlDel = "http://192.168.2.32:4000/deleteUserData";

function getRadioValue() {
    for (var i = 0; i < document.getElementsByName('sesso').length; i++) {
        if (document.getElementsByName('sesso')[i].checked) {
            return document.getElementsByName('sesso')[i].value;
        }
    }
}

function promiseInvioDati(method, url) {

    var conferma = document.getElementById("confermapsw").value;
    var password = document.getElementById("psw").value;
    var email = document.getElementById("email").value;
    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var eta = document.getElementById("eta").value;
    var sesso = getRadioValue();
    var regione = document.getElementById("regione").value;
    if (password == conferma) {
        var data = {
            email: email,
            password: password,
            nome: nome,
            cognome: cognome,
            eta: eta,
            sesso: sesso,
            regione: regione
        };
        console.log(email, password, nome, cognome, eta, sesso, regione);
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
                if (xhreq.status == 200) {
                    console.log("Ok")
                    resolve(xhreq.response);
                    document.getElementById("demo").innerHTML = "Inserimento Completato";
                }
                if (xhreq.status == 201) {
                    resolve(xhreq.response);
                    console.log("Tutto ok");
                    document.getElementById("demo").innerHTML = "Inserimento Completato";
                }
            };
            xhreq.onerror = () => {
                console.log("errore");
            }

        });

    } else {
        document.getElementById("demo").innerHTML = "Password NON Corrispondente";
    }
}

function promisePrendiDati(method, url) {
    var data1 = {
        email: document.getElementById("email").value,
        password: document.getElementById("psw").value
    }
    return new Promise((resolve, reject) => {
        let xhreq = new XMLHttpRequest(); //instanzio una richiesta http
        xhreq.open(method, url); /*apro la richiesta http utilizzando 
        get o post su un determinato url*/
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";
        xhreq.send(JSON.stringify(data1)); // invio la richiesta
        xhreq.onload = () => {
            if (xhreq.status <= 201) {
                document.getElementById("demo").innerHTML = "Ricerca Avvenuta";
                console.log("Ok trovato");
                resolve(xhreq.response);
            }
            if(xhreq.status == 403){
                document.getElementById("demo").innerHTML = "Ricerca Avvenuta, Password ERRATA!";
                reject(xhreq.reject);
            }
            if(xhreq.status == 404){
                document.getElementById("demo").innerHTML = "NON TROVATO";
                reject(xhreq.reject);
            }
            // se la richiesta è inviata con successo risolvo la promise
        };
    });
}

function promiseAggiornaDati(method, url) {

    var password = document.getElementById("psw").value;
    var email = document.getElementById("email").value;
    var nome = document.getElementById("nome").value;
    var cognome = document.getElementById("cognome").value;
    var eta = document.getElementById("eta").value;
    var sesso = getRadioValue();
    var regione = document.getElementById("regione").value;
    var data = {
        email: email,
        password: password,
        nome: nome,
        cognome: cognome,
        eta: eta,
        sesso: sesso,
        regione: regione

    };
    console.log(email, password, nome, cognome, eta, sesso, regione);
    return new Promise((resolve, reject) => {

        let xhreq = new XMLHttpRequest(); //instanzio una richiesta http
        xhreq.open(method, url);
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";

        xhreq.send(JSON.stringify(data));
        xhreq.onload = () => {
            if (xhreq.status == 403) {
                document.getElementById("demo").innerHTML = "Aggiornamento Fallito, Password ERRATA!";
                reject(xhreq.reject);
            }
            if (xhreq.status == 404) {
                document.getElementById("demo").innerHTML = "NON TROVATO";
                reject(xhreq.reject);
            }
            if (xhreq.status <= 201){
                document.getElementById("demo").innerHTML = "Aggiornamento Riuscito";
                resolve(xhreq.response);
                console.log("Tutto ok");
            }
            /*  if (xhreq.status == 200){
                  console.log("Ok")
                  resolve(xhreq.response);
              }
              if (xhreq.status == 201){
                  resolve(xhreq.response);
                  console.log("Tutto ok");
              }*/
        };
        xhreq.onerror = () => {
            console.log("errore");
        }

    });

}


function promiseCancellaDati(method, url) {
    var data1 = {
        email: document.getElementById("email").value,
        password: document.getElementById("psw").value
    }
    return new Promise((resolve, reject) => {
        let xhreq = new XMLHttpRequest(); //instanzio una richiesta http
        xhreq.open(method, url); /*apro la richiesta http utilizzando 
        get o post su un determinato url*/
        xhreq.setRequestHeader('Content-Type', 'application/json');
        xhreq.responseType = "json";
        xhreq.send(JSON.stringify(data1)); // invio la richiesta
        xhreq.onload = () => {
            if (xhreq.status == 403) {
                document.getElementById("demo").innerHTML = "Password ERRATA!";
                reject(xhreq.reject);
            }
            if (xhreq.status == 404) {
                document.getElementById("demo").innerHTML = "NON TROVATO";
                reject(xhreq.reject);
            }
            if (xhreq.status <= 201) {
                document.getElementById("demo").innerHTML = "Account Cancellato";
                resolve(xhreq.response);

            }
        };
    });
}