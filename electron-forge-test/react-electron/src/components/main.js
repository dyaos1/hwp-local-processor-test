import React, { useEffect } from 'react'

export default function Main() {

    useEffect(() => {
        const setButton = document.getElementById('myButton')
        const textInput = document.getElementById('myText')
        setButton.addEventListener('click', () => {
            const textValue = textInput.value
            window.electronAPI.setTextValue(textValue)
        })

        const goButton = document.getElementById('go');
        goButton.addEventListener("click", () => {
            window.electronAPI.executeFile(true);
        })
    })

    return (
        <div>
            <h1>Hello from React!</h1>
            <input type="text" id="myText" />
            <input type="submit" id="myButton" />
            <div>
                <button id="go">go</button>
            </div>
        </div>
    )
  }
  

