// creare una funzione che dati in input
// un numero ed una stringa restituisce solo i primi n caratteri



function primiNCaratteri() {
    //var stringa = "";
    //var n = "";
    var stringa = document.getElementsByName("stringa");
    var n = document.getElementsByName("n");
    stringa = stringa[0].value;
    n = n[0].value;
    var lunghezzaStringa = stringa.length;
    var nuovaStringa = "";
    if (n < lunghezzaStringa) {

        for (var i = 0; i < n; i++) {
            nuovaStringa += stringa[i];
        }
        alert(`Sono stati selezionati solo i primi ${n} caratteri (${nuovaStringa}) della stringa: ${stringa}`);
        return nuovaStringa;
        console.log(nuovaStringa);
    } else if (n > lunghezzaStringa) {
        alert("Il numero di caratteri da selezionare è più grande rispetto alla stringa data in input")
        return stringa;
    }
}


//primiNCaratteri("automobile", 4);