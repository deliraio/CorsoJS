/*
    verificare che la stringa contenga esclusivamente numeri

*/



function controlloChar() {
    var x = document.getElementsByName("provaprova").value;
    
    console.log(x);

    for (var i = 0; i < x.length; i++) {

        var appoggio = parseInt(x[i]);
        if (appoggio>0 && appoggio<9) {
            alert("prova ");
        }

        console.log(x[i]);
    }

}

