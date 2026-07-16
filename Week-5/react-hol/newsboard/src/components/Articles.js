import React, { Component } from "react";
import Article from "../models/Article";

class Articles extends Component {
  constructor(props) {
    super(props);

    this.state = {
      articles: [],
    };
  }

  loadArticles() {
    fetch("https://fakestoreapi.com/products?limit=6")
      .then((response) => response.json())
      .then((data) => {
        const articleList = data.map(
          (product) =>
            new Article(product.id, product.title, product.description),
        );

        this.setState({
          articles: articleList,
        });
      })
      .catch((error) => {
        console.log(error);
        alert("Unable to load product details.");
      });
  }

  componentDidMount() {
    this.loadArticles();
  }

  componentDidCatch(error) {
    alert("Something went wrong.");
    console.log(error);
  }

  render() {
    return (
      <div style={{ margin: "20px" }}>
        <h1>Online Store Products</h1>

        {this.state.articles.map((article) => (
          <div
            key={article.id}
            style={{
              border: "1px solid #4CAF50",
              borderRadius: "10px",
              padding: "15px",
              marginBottom: "15px",
              backgroundColor: "#f9fff9",
            }}
          >
            <h3>{article.title}</h3>

            <p>{article.content}</p>
          </div>
        ))}
      </div>
    );
  }
}

export default Articles;
