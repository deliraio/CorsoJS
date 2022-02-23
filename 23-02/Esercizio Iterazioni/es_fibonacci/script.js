function fibonacci() {
    var n = document.getElementsByName("num");
    n = n[0].value;
    var a = 0;
    var b = 1;
    var appoggio;
    console.log(a);
    console.log(b);
    for (let i = 0; i < n; i++) {
        appoggio = a + b;
        a = b;
        b = appoggio;
        console.log(appoggio);
    }
}