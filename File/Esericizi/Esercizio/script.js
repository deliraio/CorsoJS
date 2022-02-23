var input = document.getElementsByTagName("input");
var studlavcheck = input[7];
//var campotesto = input
/*function controlloCap() {
    var cap = document.form.cap.value;
    if (cap.length > 5) {
        alert("il cap inserito è troppo lungo");
    }
}

var nome = document.form.nome.value;
var cognome = document.form.cognome.value;

function controlloNomeCognome() {


    for (var i = 0; i < nome.length; i++)
        if (!isNaN(nome.charAt(i)) && !(nome.charAt(i) === " ")) {

            return true;
        }
    return false;


}

function controlloNomeCognomeVuoti() {

    if (nome == "") {
        alert("Il campo nome non puo' essere vuoto!");
        return false;
    }

    if (cognome == "") {
        alert("Il campo cognome non puo' essere vuoto!");
        return false;
    }
}

function controlloSessoSelezionato() {
    var sex = document.form.sesso.value;
    if (sex == "") {
        alert("Il campo sesso non puo' essere vuoto!");
        return false;
    }
}

function controlloAteneo() {
    var ateneo = document.form.ateneo.value;
    if (ateneo == "") {
        alert("Il campo ateneo non può essere vuoto");
        return false;
    }
}
*/
function controlloStudLav() {
    //var bool = document.getElementsByName("studlav");
    //var campotesto = document.getElementsByName("casellatesto");
    if (studlavcheck == true /*&& campotesto == ""*/) {
        alert("La descrizione del lavoro svolto non può essere vuota");
        return false;
    }
}
 console.log(controlloStudLav());