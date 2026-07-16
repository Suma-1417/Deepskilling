import Dashboard from "./components/Dashboard";
import Courses from "./components/Courses";
import Profile from "./components/Profile";

function App() {
  return (
    <div style={{ margin: "30px" }}>
      <h1>Campus Learning Portal</h1>

      <Dashboard />
      <Courses />
      <Profile />
    </div>
  );
}

export default App;
