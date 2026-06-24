import { useState } from "react";
import axios from "axios";

function TaxForm() {
  const [name, setName] = useState("");
  const [email, setEmail] = useState("");
  const [question, setQuestion] = useState("");

  const handleSubmit = async (e) => {
    e.preventDefault();

    try {
      await axios.post("http://localhost:8080/api/query", {
        name,
        email,
        question,
      });

      alert("Query Submitted Successfully!");

      setName("");
      setEmail("");
      setQuestion("");
    } catch (error) {
      alert("Error submitting query");
      console.log(error);
    }
  };

  return (
    <div className="form-container">
      <h2>Ask a Tax Question</h2>

      <form onSubmit={handleSubmit}>
        <input
          type="text"
          placeholder="Enter Name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />

        <input
          type="email"
          placeholder="Enter Email"
          value={email}
          onChange={(e) => setEmail(e.target.value)}
        />

        <textarea
          placeholder="Enter Question"
          value={question}
          onChange={(e) => setQuestion(e.target.value)}
        />

        <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default TaxForm;
