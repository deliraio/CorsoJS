//
// esercizio commentato con callback funzionante
//
/*
function stampaAlert(stringa, stringaAlContrario) {
    alert(`La stringa: (${stringa}) al contrario e': ${stringaAlContrario}`);
}
function reverse(stringa) {
  var stringaAlContrario = "";
  for (i = stringa.length; i >= 0; i--) {
    stringaAlContrario += stringa.charAt(i);
  }
  stampaAlert(stringa,stringaAlContrario);
}

reverse("buongiorno!");
*/

//
// Esericizio con Promise
//
function stampaAlert(stringa, stringaAlContrario) {
  alert(`La stringa: (${stringa}) al contrario e': ${stringaAlContrario}`);
}

let laMiaPromise = new Promise(function (reverseS, reverseN) {
    var stringa="prova123";
  if (stringa != "") {
    for (i = stringa.length; i >= 0; i--) {
      stringaAlContrario += stringa.charAt(i);
    }
    reverseS(stringa, stringaAlContrario);
  }
});

laMiaPromise.then(
    function(value,value){stampaAlert(value,value);}
);
