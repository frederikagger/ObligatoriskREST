function convertUNIXtime(time){
    let dateObj = new Date(time * 1000);
    let utcString = dateObj.toUTCString();
    time = utcString.slice(-11, -4);
    return time;
}

function convertUNIXTime(unixTimestamp) {
    let dateObj = new Date((parseInt(unixTimestamp)+7200) * 1000);
// Get hours from the timestamp
    let hours = dateObj.getUTCHours();
// Get minutes part from the timestamp
    let minutes = dateObj.getUTCMinutes();
// Get seconds part from the timestamp
    let formattedTime = hours.toString().padStart(2, '0') + ':' +
        minutes.toString().padStart(2, '0');
    console.log(formattedTime);
    return formattedTime;
}

function setUNIXTime() {
    let times = document.getElementsByClassName("time");
    for (let i=0; i<times.length; i++){
        times[i].innerHTML = convertUNIXTime(times[i].innerHTML)
    }
}