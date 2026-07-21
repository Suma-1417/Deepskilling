import { useState } from "react";
import CurrencyConverter from "./components/CurrencyConverter";

function App() {
  const [count, setCount] = useState(0);

  function increment() {
    setCount(count + 1);
  }

  function decrement() {
    setCount(count - 1);
  }

  function sayHello() {
    alert("Hello! Counter Updated Successfully.");
  }

  function increaseAndGreet() {
    increment();
    sayHello();
  }

  function welcome(message) {
    alert(message);
  }

  function handleClick() {
    alert("I was clicked");
  }

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>React Event Examples</h1>
      <h2>Counter : {count}</h2>
      <button onClick={increaseAndGreet}>Increment</button>{" "}
      <button onClick={decrement}>Decrement</button>
      <br />
      <br />
      <button onClick={() => welcome("Welcome to React Event Handling")}>
        Say Welcome
      </button>
      <br />
      <br />
      <button onClick={handleClick}>Click Me</button>
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;
