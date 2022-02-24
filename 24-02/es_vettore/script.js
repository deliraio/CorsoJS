var v = [1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log(v);



function insVett() {
  let app = document.getElementsByName("inserimento").value;
  v.push(parseInt(app));
}
function moltiplicazioneVett(v, moltiplicatore) {
    for (let i = 0; i < v.length; i++) {
      var app = v[i] * moltiplicatore;
      console.log(app);
    }
  }
moltiplicazioneVett(v, 10);
