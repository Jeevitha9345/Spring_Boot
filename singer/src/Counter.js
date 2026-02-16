import React, { useState } from 'react'

const Counter = () => {
  const [count, setCount] = useState(0);
  const [count1, setCount1] = useState(0);
//   const [count, setCount] = useState(10);
// based on the value given in the initial state it will start counting from that value and increase or decrease based on the changes given in the handleClick function

  const handleClickplus = () => {
    setCount(count + 1);
    // setCount(count + 1);
    // it will increase or decrease the count based on the changes given here
  };
  
  const handleClickminus = () => {
    setCount1(count1 + 1);
  };

  const button={
    border: "none",
    backgroundColor: "white"
  }

  return (
    <div>
      <img src="https://4kwallpapers.com/images/walls/thumbs_3t/6865.jpg" width="500px"/>
      <br></br>
      <br></br>
      <button style={button} onClick={handleClickplus}>👍: {count}</button>
      <button style={button} onClick={handleClickminus}>👎:{count1}</button>
    </div>
  )
}

export default Counter;
