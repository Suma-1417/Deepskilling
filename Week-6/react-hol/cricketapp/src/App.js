import PlayerList from "./components/PlayerList";
import IndianPlayers from "./components/IndianPlayers";

function App() {
  return (
    <div style={{ margin: "20px" }}>
      <h1>Cricket Statistics Dashboard</h1>

      <PlayerList />

      <hr />

      <IndianPlayers />
    </div>
  );
}

export default App;
