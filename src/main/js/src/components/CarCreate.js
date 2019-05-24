import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.header`
  background: lightgrey;
`;

export default class CarCreate extends Component {
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

  //MODIFICAR!
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
        <h2>CAR CREATE</h2>
        <form
          action=""
          method="post"
          onSubmit={e => {
            e.preventDefault();
            this.submitForm();
          }}
        >
          {" "}
          <input
            type="text"
            name="patent"
            id="patentInput"
            placeholder="Patente"
            onChange={this.handleChange}
            required
          />
          <input
            type="text"
            name="brand"
            id="brandInput"
            placeholder="Marca"
            onChange={this.handleChange}
            required
          />
          <input
            type="text"
            name="model"
            id="modelInput"
            placeholder="Modelo"
            onChange={this.handleChange}
            required
          />
          <input
            type="number"
            name="year"
            id="yearInput"
            placeholder="Año"
            onChange={this.handleChange}
            required
          />
          <select name="client" id="" onChange={this.handleChange} required>
            <option value="Titular 1">Titular 1</option>
            <option value="Titular 2">Titular 2</option>
            <option value="Titular 3">Titular 3</option>
            <option value="Titular 4">Titular 4</option>
          </select>
          <button type="submit"> CREAR </button>
        </form>
      </Style>
    );
  }
}
