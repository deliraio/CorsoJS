function maiuscMinusc() {
  var stringa = "sOtTo LA pANCa la CApra caNTA";
  var parola = stringa.split(" ");
  var stringaFinale = "";

  console.log(parola);
  for (var i = 0; i < parola.length; i++) {
    let ascii = parola[i].charAt(0);

    if (ascii >= "A" && ascii <= "Z") {
      //se il codice ascii della prima lettera è compreso tra la MAIUSCOLE
      let appo1 = parola[i].charCodeAt(0);
      stringaFinale += String.fromCharCode(appo1);
    }
    if (ascii >= "a" && ascii <= "z") {
      //altrimenti se il codice asci della prima lettera è compreso tra le MINUSCOLE
      let appo1 = parola[i].charCodeAt(0);
      appo1 -= 32;
      stringaFinale += String.fromCharCode(appo1);
    }
    console.log(parola[i].length);

    for (let j = 1; j < parola[i].length; j++) {
      let ascii2 = parola[i].charAt(j);
      //console.log(parola[i].charAt(j));
      if (ascii2 >= "a" && ascii2 <= "z") {
        // se è tra le MINUSCOLEB
        let appo2 = parola[i].charCodeAt(j);
        stringaFinale += String.fromCharCode(appo2);
      }
      if (ascii2 >= "A" && ascii2 <= "Z") {
        // se è  tra le MAIUSCOLE
        let appo2 = parola[i].charCodeAt(j);

        appo2 += 32;
        stringaFinale += String.fromCharCode(appo2);
      }
    }
    stringaFinale += " ";
  }

  console.log(stringaFinale);
}

maiuscMinusc();
