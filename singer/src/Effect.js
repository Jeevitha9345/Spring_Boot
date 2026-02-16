import React,{useEffect} from 'react'

function Effect(){
    const [count, setCount] = React.useState(0);

    useEffect(()=>{
        console.log("Effect ran");
    },[]);

// dependency array with empty array means the effect will only run once when the component mounts and not on subsequent re-renders. If you omit the dependency array, the effect will run after every render, which can lead to performance issues and unintended consequences. By providing an empty array, you ensure that the effect runs only once when the component is first rendered.

    const [name, setName] = React.useState("Jeevi");
    useEffect(()=>{
        console.log("Name changed");
    },[name]);

// dependency array with [name] means the effect will run only when the value of name changes. Whenever the name state variable is updated, the effect will be triggered and the message "Name changed" will be logged to the console. If you omit the dependency array, the effect will run after every render, which can lead to performance issues and unintended consequences. By providing [name], you ensure that the effect runs only when the name state variable changes.

  return (
    <div>
        <h2>Demo</h2>
        <p>Count: {count}</p>
        <button onClick={() => setCount(count + 1)}>Increase</button>
        <br></br>
        <p>Name: {name}</p>
        <button onClick={() => setName("Selvaraj")}>Change Name</button>
    </div>
  )
}

export default Effect;
