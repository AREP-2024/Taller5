function seno (){
    let inputfunSin = document.getElementById('funSin');
    let endPoint = "/sin?num="+ inputfunSin.value;
    let llamado = llamarAPI(endPoint);
    llamado.then((resultado)=>{
        let divrespSin = document.getElementById('respSin');
        divrespSin.innerHTML = resultado;
    });

}

function coseno(){
    let inputfunCos = document.getElementById('funCos');
    let endPoint = "/cos?num="+ inputfunCos.value;
    let llamado = llamarAPI(endPoint);
    llamado.then((resultado)=>{
        let divrespCos = document.getElementById('respCos');
        divrespCos.innerHTML = resultado;

    });
}

function p(){
    let inputpalindrome = document.getElementById('palindrome');
    let endPoint = "/palindrome?cadena="+ inputpalindrome.value;
    let llamado = llamarAPI(endPoint);
    llamado.then((resultado)=>{
        let divrespPalindrome = document.getElementById('respPalindrome');
        divrespPalindrome.innerHTML = resultado;

    });

}

function magnitudVector(){
    let inputnumX = document.getElementById('numX');
    let inputnumY = document.getElementById('numY');

    let endPoint = "/magnitud?x="+ inputnumX.value+"&y="+inputnumY.value;
    let llamado = llamarAPI(endPoint);
    llamado.then((resultado)=>{
        let divrespMagnitud = document.getElementById('respMagnitud');
        divrespMagnitud.innerHTML = resultado;

    });


}

async function llamarAPI(endPoint){
    
    return await fetch("http://localhost:4567"+endPoint)
        .then((response)=>{
            if(!response.ok){
                throw new Error();
            }
            return response.text();
        })
        
        .catch((error)=>alert(error));

   

}