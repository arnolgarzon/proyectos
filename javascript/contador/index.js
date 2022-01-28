const disminuir = document.getElementById("disminuir");
const aumento = document.getElementById("aumento");
let contadorHtml = document.getElementById("cuenta");
let contador = 0;

function disminuirNumero() {
  contador--;

  contadorHtml.innerHTML = contador;
}
function aumentarNumero() {
  contador++;

  contadorHtml.innerHTML = contador;
}
function reset(){
contador = 0;
contadorHtml.innerHTML = contador;
}

buttonDisminuir.addEventListener("click", disminuirNumero);
buttonAumentar.addEventListener("click", aumentarNumero);
buttonReset.addEventListener("click", reset);

