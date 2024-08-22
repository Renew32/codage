let chrono = document.getElementById("chrono")
let resetBtn = document.getElementById("reset")
let stopBtn = document.getElementById("stop")
let startBtn = document.getElementById("start")

let hours = 0;
let minutes = 0;
let secondes = 0;

let timeout;

let areStop = true;

const start = () => {
    if(areStop){
        areStop = false;
        defilerTemps();
    }
}

const stop = () => {
    if(!areStop){
        areStop=true
        // clear timeout
        clearTimeout(timeout)
    }
}

const defilerTemps =() =>{
    if(areStop) return;

    secondes = parseInt(secondes);
    minutes = parseInt(minutes);
    hours = parseInt(hours);

    secondes++;

    if (secondes == 60){
        minutes ++;
        secondes=0;
    }

    if (minutes == 60){
        hours ++;
        minutes = 0;
    }

    //display
    if(secondes<10){
        secondes = '0'+secondes;
    }

    if(minutes<10){
        minutes = '0'+minutes;
    }
    if(hours<10){
        hours = '0'+hours;
    }


    chrono.textContent = `${hours}:${minutes}:${secondes}`;

    timeout = setTimeout(defilerTemps,1000);
}

const reset = () => {
    chrono.textContent = '00:00:00';
    areStop = true;
    hours = 0;
    minutes = 0;
    secondes = 0;
    clearTimeout(timeout);
}

startBtn.addEventListener("click",start);
stopBtn.addEventListener("click",stop);
resetBtn.addEventListener("click",reset);