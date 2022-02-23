function maiuscMinusc() {
    var stringa = "sOtTo LA pANCa la Cpra caNTA"
    var parola = stringa.split(' ');
    var stringaFinale = "";

    console.log(parola);
    for (let i = 0; i < parola.length; i++) {
        var ascii = parola[i].charAt(0);

        if (ascii <= 'A' && ascii >= 'Z') {
            let appo1 = parola[i].charCodeAt(0);
            appo1 -= 32;
            stringaFinale += String.fromCharCode(appo1);
        }
        if (ascii >= 'A' && ascii <= 'Z') {
            let appo1 = parola[i].charCodeAt(0);
            stringaFinale += String.fromCharCode(appo1);
        }
        console.log(stringaFinale);
        for (let j = 1; j < parola.length; j++) {
            if (parola[i].charAt(j) >= 'A' && parola[i].charAt(j) <= 'Z') {
                let appo2 = parola[i].charCodeAt(j);
                appo2 += 32;
                stringaFinale += String.fromCharCode(appo2);
            }
            if (ascii >= 'A' && ascii <= 'Z') {
                let appo2 = parola[i].charCodeAt(j);
                stringaFinale += String.fromCharCode(appo2);
            }
            console.log(stringaFinale);
        }
        stringaFinale += " ";

    }


    console.log(stringaFinale);

}


maiuscMinusc();