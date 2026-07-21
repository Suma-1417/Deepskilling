function TravelArticles() {
  const articles = [
    {
      id: 1,
      title: "A Weekend Trip to Araku Valley",
      author: "Sanjay",
    },

    {
      id: 2,
      title: "Exploring Hampi Heritage",
      author: "Charan",
    },

    {
      id: 3,
      title: "Beach Vacation in Pondicherry",
      author: "Divya",
    },
  ];

  return (
    <div>
      {articles.map((article) => (
        <div
          key={article.id}
          style={{
            border: "1px solid gray",
            padding: "10px",
            marginBottom: "10px",
            borderRadius: "6px",
          }}
        >
          <h3>{article.title}</h3>

          <p>
            <b>Author:</b> {article.author}
          </p>
        </div>
      ))}
    </div>
  );
}

export default TravelArticles;
