document.addEventListener('DOMContentLoaded', function () {
    errorAlert();
})

function convertUNIXTime(unixTimestamp) {
    let dateObj = new Date((parseInt(unixTimestamp)) * 1000);
// Get hours from the timestamp
    let hours = dateObj.getUTCHours();
// Get minutes part from the timestamp
    let minutes = dateObj.getUTCMinutes();
// Get seconds part from the timestamp
    let formattedTime = hours.toString().padStart(2, '0') + ':' +
        minutes.toString().padStart(2, '0');
    return formattedTime;
}

function setUNIXTime() {
    let times = document.getElementsByClassName("time");
    for (let i = 0; i < times.length; i++) {
        times[i].innerHTML = convertUNIXTime(times[i].innerHTML)
    }
}

// function that formats a datetime
function formatDateTime(dateTime) {
    let formattedTime = dateTime.slice(0, 16); // Removing seconds and miliseconds
    return formattedTime;
}


function setFormattedDateTime() {
    let dates = document.getElementsByClassName("dateTime");
    for (let i = 0; i < dates.length; i++) {
        dates[i].innerHTML = formatDateTime(dates[i].innerHTML)
    }
}

function errorAlert() {
    let error = document.getElementById("error").innerText;
    if (error.length>0){
        alert(error);
    }
}

// forstår ikke at jquery ikke kan finde span elementet med id="error", men
function jqErrorAlert() {
    console.log($("#error"));
}

/*
function getLocation() {
    if (navigator.geolocation)
        console.log(navigator.geolocation.getCurrentPosition(showLocation));
        //window.location.href="/?lat="+latitude+""

}

function showLocation(position) {
    latitude = position.coords.latitude;
    longitude = position.coords.longitude;

}*/