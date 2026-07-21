import { useState } from "react";

function CurrencyConverter() {
  const [rupees, setRupees] = useState("");
  const [dollars, setDollars] = useState("");

  function convertCurrency() {
    const rate = 86; // 1 USD = ₹86

    if (rupees === "") {
      alert("Please enter an amount in Rupees");
      return;
    }

    const usd = (parseFloat(rupees) / rate).toFixed(2);
    setDollars(usd);
  }

  return (
    <div>
      <h2>Currency Converter</h2>
      <input
        type="number"
        placeholder="Enter amount in ₹"
        value={rupees}
        onChange={(e) => setRupees(e.target.value)}
      />{" "}
      <button onClick={convertCurrency}>Convert to USD</button>
      <h3>USD : ${dollars}</h3>
    </div>
  );
}

export default CurrencyConverter;
