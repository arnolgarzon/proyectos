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
let valueEnd;

function calcularPrecio(){
    peso = (parseInt(inputWeight.value));
    value = (parseInt(inputValue.value));
    arancel = (value * 0.10);

    if(peso <= 4){
        alert("el costo del envio es: $" + envio);
    }
    else if (peso > 4){
        for (let i = 0; i < (peso - 4); i++){
        envio += 2
        }
        alert("el costo del envio es: $" + envio);
    }
    if (value > 200){
        iva = ((envio + value + arancel) * 0.19);
        alert("el iva es de: " + iva);
    }
    if (inputCategory.value == 1){
        comision = 0;
    }
    else if (inputCategory == 2){
        commission = 0.1;
    }
    else if (inputCategory == 3){
        comision = 0.05;
    }
    else if (inputCategory == 4){
        comision = 0.15
    }
    if (comision != 0){
        valueEnd = (envio + value + arancel);
    }
    else if (value > 200){
        valueEnd = ((envio + value + arancel + iva) * (comision / (1 - comision)));
    }
    else{
        valueEnd = (((envio + value + arancel) * comision) / (1 - comision));
    }
    document.querySelector('#producto').innerHTML = inputName.value;
    document.querySelector('#valorFinal').innerHTML = valueEnd;
}

buttonSend.addEventListener('click',calcularPrecio);