import { useState } from "react";
import Technology from "./components/Technology";
import Travel from "./components/Travel";

function App() {
  const [category, setCategory] = useState("technology");

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>Blogger Dashboard</h1>
      <button onClick={() => setCategory("technology")}>Technology</button>{" "}
      <button onClick={() => setCategory("travel")}>Travel</button>
      <hr />
      {category === "technology" ? <Technology /> : <Travel />}
    </div>
  );
}

export default App;
