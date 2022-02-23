function comparatorestringa1() {

    var text1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit";

    var string1 = document.form.inserimento.value;

    var lt= text1.length;
    var ls= string1.length;
    var diversi=0;
    var found=0;
    for(var i=0;i<=lt-ls;i++){
    var diversi=0;
    for(var j=0;j<lt;j++){
        if(text1[j]!=string1[j+1]) diversi=1;

    }
    if (diversi==0)
    found=1;
    }
    if(found==1)
}