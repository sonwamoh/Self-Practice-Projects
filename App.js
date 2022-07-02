import {useState} from 'react';
function App (){
  const[ZC, SZC] = useState();
  const fetchAPI = async (evt) => {
    evt.preventDefault();
    let fetchResponse = await fetch("https://api.openweathermap.org/data/2.5/weather?zip=" + ZC + "&appid=384530a26df84465ffe7e9419c8ef8db&units=imperial")
    let jsonResponse = await fetchResponse.json();
    document.getElementById("City").innerHTML = `City: ${jsonResponse.name}`;
    document.getElementById("temperature").innerHTML = `Tmeperature: ${jsonResponse.main.temp} F`;
  }
  return (
    <div>
    <h1 style = {{color : 'red', backgroundColor: 'black'}}>Forecast in USA
    </h1>
    <form onSubmit = {(evt) => fetchAPI(evt)}>
    <input type = 'numbers' 
    id = "ZipCode" 
    onChange = {(e) => SZC(e.target.value)}>
    </input>
    <button type = "submit ">Submit
    </button>
    </form>
    <div id = 'City'>City
    </div>
    <div id = 'Temperature'>Temperate
    </div>
    </div>
  );
}
export default App
