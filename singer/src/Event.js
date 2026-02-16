function App() {
//   const handleChange = () => {
//     console.log("Typing...");};
//   const handleMouseOver = () => {
//     console.log("Mouse Over");};
//   const handleMouseOut = () => {
//     console.log("Mouse Out");};
//   const handleFocus = () => {
//     console.log("Focused");};
//   const handleBlur = () => {
//     console.log("Blurred");};
//   const handleSubmit = (e) => {
//     e.preventDefault();
//     console.log("Form Submitted");};
//   return (
//     <div style={{ padding: "40px" }}>
//       <h2>React Events Example</h2>
//       <form onSubmit={handleSubmit}>
//         <input type="text" placeholder="Type something" onChange={handleChange} onFocus={handleFocus} onBlur={handleBlur} />
//         <br/><br/>
//         <button onMouseOver={handleMouseOver} onMouseOut={handleMouseOut} type="submit"> Submit </button>
//       </form>
//     </div>
//   );

    function handleClick(){
        console.log("Button Clicked");
    }
    function seeJoke(){
        console.log("Why don't scientists trust atoms? Because they make up everything!");
    }
    function handleChange(e){
        console.log("Typing",e.target.value);
    }
    function printInScreen(e){
        document.getElementById("name").innerHTML=e.target.value;
    }
    return(
    <div>
        <button onClick={handleClick}>Click Me</button>
        <button onClick={seeJoke}>Joke</button>
        <label htmlFor="name">Using Input box</label>
        {/* below both are same but using 2 different ways */}
        {/* <input type="text" id="name" onChange={(e) => console.log("typing",e.target.value)} /> */}
        <input onKeyUp={printInScreen}/>
        <h2 id="name"></h2>
        {/* mistake not working */}

    </div>
)}
export default App;