import './App.css';
//import First from './First';
import Events from './Event';
import Counter from './Counter';
// import Backend from './Backend';
// import Student from './student';
// import Employee from './Employee';
// import ProductList from './Productlist';
import Window from './window';
import Effect from './Effect';
//arrow function is from es6 module
function App() {
  // const products = [
  //       { name: "Laptop", price: 55000 },
  //       { name: "Smartphone", price: 20000 },
  //       { name: "Headphones", price: 1500 },
  //       { name: "Smartwatch", price: 2000 }
  //     ];
  return (
    <div>
      {/* <Backend /> */}
      {/* backend connection is successful if you click the button and get the message from backend */}
      {/* <Student name="Selvraj" age={25} /> */}
      {/* <Student name="Kani" age={24} /> */}
      {/* Employee.js ooda component use panrom and saving like real components in react websites  */}
      {/* <Employee name="Kani" role="Software Engineer" salary="100,000" /> */}
      {/* <Employee name="Mohana" role="Teacher" salary="50,000" /> */}
      {/* <Employee name="Nive" role="Professor" salary="75,000" /> */}
      {/* <Employee name="Jeevi" role="Web Developer" salary="80,000" /> */}
      {/* <Employee name="Amirtaa" role="Digital Marketer" salary="60,000" /> */}

      {/* <h1>Product Store</h1>
      <ProductList items={products} /> */}
      
      {/* <First/>
      <h1>This is the main App component</h1>
      <First/> */}
      {/* <Events/>
      <Counter/> */}
      {/* <Window /> */}
      <Effect />
    </div>
  );
}

export default App;