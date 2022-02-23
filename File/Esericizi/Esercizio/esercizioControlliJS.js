var input = document.getElementsByTagName("input");

function controlloDati() {
   
    var cognome = input[0];
    var nome = input[1];
    var matricola = input[4];
    var annodicorso= input[7];
    if (cognome.value == "") {
        alert("Il campo cognome non puo' essere vuoto!");
        return false;
    }
    if (nome.value == "") {
        alert("Il campo nome non puo' essere vuoto!")
        return false;
    }
    var matr=parseInt(matricola.value);
    if(isNaN(matr)){
        alert("Il campo matricola deve essere un numero!")
        return false;
    }
    if (document.registr.regione.value=="nessuna"){
        alert("Selezionare un'altra regione!")
        return false;
    }
   /* if(annodicorso.value!="FC"){
        
        if(annodicorso.value<1 || annodicorso.value>5){
            alert("L'anno di corso inserito non è corretto!");
        }
        
        return false;
        
    }
    */

    if(annodicorso.value!="FC"){
        
        if(annodicorso.value<1 || annodicorso.value>5){
            alert("L'anno di corso inserito non è corretto!");
        }
        
        return false;
        
    }
}

function controlloAnno(){
    
}