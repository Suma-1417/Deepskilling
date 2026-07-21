import office1 from "./assets/office1.jpg";
import office2 from "./assets/office2.jpg";
import office3 from "./assets/office3.jpg";

function App() {
  const offices = [
    {
      id: 1,
      name: "Smart Workspace",
      rent: 58000,
      address: "Madhapur, Hyderabad",
      type: "Modern Workspace",
      image: office1,
    },

    {
      id: 2,
      name: "Crystal Meeting Hub",
      rent: 72000,
      address: "Whitefield, Bengaluru",
      type: "Glass Meeting Room",
      image: office2,
    },

    {
      id: 3,
      name: "Executive Office Suite",
      rent: 48000,
      address: "Banjara Hills, Hyderabad",
      type: "Private Office Cabin",
      image: office3,
    },
  ];

  return (
    <div style={{ padding: "20px", fontFamily: "Arial" }}>
      <h1>Office Space Rental Portal</h1>

      {offices.map((office) => (
        <div
          key={office.id}
          style={{
            border: "1px solid #bdbdbd",
            borderRadius: "10px",
            width: "360px",
            padding: "15px",
            marginBottom: "25px",
            boxShadow: "0px 2px 8px rgba(0,0,0,0.15)",
          }}
        >
          <img
            src={office.image}
            alt={office.name}
            width="330"
            height="210"
            style={{ borderRadius: "8px" }}
          />

          <h2>{office.name}</h2>

          <p>
            <b>Office Type:</b> {office.type}
          </p>

          <p>
            <b>Location:</b> {office.address}
          </p>

          <p>
            <b>Monthly Rent:</b>

            <span
              style={{
                color: office.rent > 60000 ? "green" : "red",
                fontWeight: "bold",
              }}
            >
              {" "}
              ₹{office.rent}
            </span>
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
