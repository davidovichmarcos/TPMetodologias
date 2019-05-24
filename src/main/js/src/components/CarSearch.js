import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.header`
  background: lightgrey;
`;

export default class CarSearch extends Component {
  state = {
    formData: {}
  };

  handleChange = event => {
    this.setState({
      formData: {
        ...this.state.formData,
        [event.target.name]: event.target.value
      }
    });
  };

  //modificar!
  async submitForm() {
    /// meter en process.env
    var url = "http://localhost:8080/client";
    var data = this.state.formData;
    var settings = {
      method: "POST",
      body: JSON.stringify(data),
      headers: {
        "Content-Type": "application/json"
      }
    };
    return await fetch(url, settings)
      .then(res => res.json())
      .then(res => {
        console.log(res);
      })
      .catch(error => console.error("Error:", error));
  }

  render() {
    return (
      <Style>
        <h2>CAR SEARCH</h2>
        <form
          action=""
          method="post"
          onSubmit={e => {
            e.preventDefault();
            this.submitForm();
          }}
        >
          <input
            type="text"
            name="keyword"
            id=""
            placeholder="Ingrese patente..."
            onChange={this.handleChange}
          />
          <button type="submit">Search</button>
        </form>
      </Style>
    );
  }
}
