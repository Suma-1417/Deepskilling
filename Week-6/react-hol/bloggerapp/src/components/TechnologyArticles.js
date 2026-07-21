function TechnologyArticles() {
  const articles = [
    {
      id: 1,
      title: "Getting Started with React",
      author: "Harsha",
    },

    {
      id: 2,
      title: "Java Collections Explained",
      author: "Naveen",
    },

    {
      id: 3,
      title: "Introduction to Artificial Intelligence",
      author: "Keerthana",
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

export default TechnologyArticles;
