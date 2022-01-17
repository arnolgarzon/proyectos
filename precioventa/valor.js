let inputCategory = document.querySelector('#inputCat');
let inputValue = document.querySelector('#inputValue');
let inputName = document.querySelector('#inputName');
let inputWeight= document.querySelector('#inputWeight');
let buttonSend = document.querySelector('#buttonSend');
let envio = 10;
let value;
let peso;
let iva;
let arancel;
let comision;
let categoria;
let valueEnd;
let nombre = document.querySelector('#producto');

function calcularPrecio(){
    
    value = (parseInt(inputValue.value));
    arancel = (value * 0.10);
    iva = ((envio + value + arancel) * 0.19);
    categoria = inputCategory.value;

    calcularCostoEnvio();
    //operador ternario
     (value > 200) ? alert("el iva es de: " + iva) : alert("no tiene iva");

    // switch case
    switch (categoria){
        case 1 : comision = 0
        break
        case 2 : comision = 0.10
        break
        case 3 : comision = 0.05
        break
        case 4 : comision = 0.15
        break
        default : console.log("Invalid categoria")
        break
    }
    
    if (comision == 0 & value < 200){
        valueEnd = (envio + value + arancel)*1.1;
    }
    else if (comision == 0 & value > 200){
        valueEnd = ((envio + value + arancel + iva) * 1.1 )
    }
    else if (value > 200){
        valueEnd = ((envio + value + arancel + iva) * 1.1 ) / (1 - comision);
    }
    else{
        valueEnd = ((envio + value + arancel) * 1.1 ) / (1 - comision);
    }
    nombre.innerHTML = inputName.value;
    alert(valueEnd)
}
function calcularCostoEnvio (){
    peso = (parseInt(inputWeight.value));
    if(peso > 4){
        for (let i = 0; i < (peso - 4); i++){
        envio += 2
        }
        alert("el costo del envio es: $" + envio);
    }
    else{
        alert("el costo del envio es: " + envio)
    } 
}

buttonSend.addEventListener('click',calcularPrecio);