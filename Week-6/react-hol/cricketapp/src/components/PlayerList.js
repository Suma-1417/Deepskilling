import React from "react";

function PlayerList() {
 const players = [
   { id: 201, name: "Charan", score: 84 },
   { id: 202, name: "Naveen", score: 66 },
   { id: 203, name: "Sanjay", score: 95 },
   { id: 204, name: "Harsha", score: 58 },
   { id: 205, name: "Tarun", score: 79 },
   { id: 206, name: "Koushik", score: 64 },
 ];
  const lowScorePlayers = players.filter((player) => player.score < 70);

  return (
    <div>
      <h2>Player Performance</h2>

      <h3>All Players</h3>

      <ul>
        {players.map((player) => (
          <li key={player.id}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>

      <h3>Players Scoring Below 70</h3>

      <ul>
        {lowScorePlayers.map((player) => (
          <li key={player.id}>
            {player.name} - {player.score}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default PlayerList;
