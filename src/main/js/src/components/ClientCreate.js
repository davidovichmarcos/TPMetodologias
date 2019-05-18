import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.header`
  background: lightgrey;
`;

export default class ClientCreate extends Component {
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

  async submitForm() {
    /// meter en process.env
    var url = "http://localhost:8080/client";

    // sacar de this.state
    var data = this.state.formData;
    var settings = {
      method: "POST",
      body: JSON.stringify(data),
      headers: {
        "Content-Type": "application/json"
      }
    };
    const log = await fetch(url, settings)
      .then(res => res.json())
      .then(res => {
        console.log(res);
      })
      .catch(error => console.error("Error:", error));
  }

  render() {
    return (
      <Style>
        <h2>CLIENT CREATE</h2>
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
            name="name"
            id=""
            placeholder="Nombre"
            onChange={this.handleChange}
          />
          <input
            type="text"
            name="lastname"
            id=""
            placeholder="Apellido"
            onChange={this.handleChange}
          />
          <button type="submit"> CREAR </button>
        </form>
      </Style>
    );
  }
}
