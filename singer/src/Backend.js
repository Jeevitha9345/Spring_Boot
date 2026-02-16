import React from "react";
let Backend = () =>{
    function loadData(){
        fetch("http://localhost:8080/backend")
        .then(res => res.text())
        .then(data =>{
            document.getElementById("msg").innerHTML=data;
        })
        .catch(err => console.log(err));
    }
    return(
        <div>
            <h2>This is Frontend</h2>
            <button onClick={loadData}>
                Load Message
            </button>
            <p id="msg"></p>
        </div>
    )
}
export default Backend;