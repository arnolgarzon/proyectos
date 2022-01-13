let inputCat = document.querySelector('#inputCat');
let inputValue = document.querySelector('#inputValue');
let inputName = document.querySelector('#inputName');
let inputWeight= document.querySelector('#inputWeight');
let buttonSend = document.querySelector('#buttonSend');
let envio = 10;
let peso = (parseInt(inputWeight.value));
let iva = ((envio + inputValue.value));

function calcularComision(){
    if(peso <= 4){
        alert("envio = $10")

    }
    else if (peso > 4){
        for (let i = 0; i < (peso - 4); i++){
        envio += 2
        }
    }
    if (inputValue.value > 200){
        alert("el iva es: " + iva) 
    }
   alert("el costo del envio es: $" + envio);
}

buttonSend.addEventListener('click',calcularComision);