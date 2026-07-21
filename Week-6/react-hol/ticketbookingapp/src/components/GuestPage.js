function GuestPage() {
  const flights = [
    {
      id: 1,
      flight: "IndiGo 6E-245",
      from: "Hyderabad",
      to: "Delhi",
    },

    {
      id: 2,
      flight: "Air India AI-603",
      from: "Chennai",
      to: "Mumbai",
    },

    {
      id: 3,
      flight: "Akasa QP-118",
      from: "Bengaluru",
      to: "Kolkata",
    },
  ];

  return (
    <div>
      <h2>Available Flights</h2>

      <ul>
        {flights.map((flight) => (
          <li key={flight.id}>
            {flight.flight} | {flight.from} ➜ {flight.to}
          </li>
        ))}
      </ul>

      <p>Please login to book your tickets.</p>
    </div>
  );
}

export default GuestPage;
