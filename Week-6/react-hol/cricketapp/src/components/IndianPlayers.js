import React from "react";

function IndianPlayers() {
  const team = [
    "Rohit Sharma",
    "Shubman Gill",
    "Virat Kohli",
    "Shreyas Iyer",
    "KL Rahul",
    "Hardik Pandya",
  ];

  // Destructuring
  const [captain, viceCaptain, ...remainingPlayers] = team;

  // T20 Players
  const t20Players = ["Rohit Sharma", "Suryakumar Yadav", "Rinku Singh"];

  // Ranji Trophy Players
  const ranjiPlayers = ["Sarfaraz Khan", "Abhimanyu Easwaran", "Rajat Patidar"];

  // Merge using Spread Operator
  const allPlayers = [...t20Players, ...ranjiPlayers];

  return (
    <div>
      <h2>Indian Cricket Team</h2>

      <p>
        <b>Captain:</b> {captain}
      </p>

      <p>
        <b>Vice Captain:</b> {viceCaptain}
      </p>

      <h3>Remaining Players</h3>

      <ul>
        {remainingPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>

      <h3>Combined Team</h3>

      <ul>
        {allPlayers.map((player, index) => (
          <li key={index}>{player}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
