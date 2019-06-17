import React, { Component } from "react";
import styled from "styled-components";

import ClientList from "./ClientList";

const Style = styled.div``;

export default class ClientCreate extends Component {
  state = {
    formData: {},
    clientList: [{}]
  };

  handleChange = event => {
    this.setState({
      formData: {
        ...this.state.formData,
        [event.target.name]: event.target.value
      }
    });
  };

  async submitForm(e) {
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
        if (res.id == null) {
          //hacer algo cuando resive ok.
          console.log("------ LLEGO MAL!");
        } else {
          console.log("------ LLEGO BIEN!");
        }
        //console.log(res);
      })
      .catch(error => console.error("Error:", error));
  }

  async getClients() {
    var url = "http://localhost:8080/client";
    return await fetch(url)
      .then(res => res.json())
      .then(res => {
        return res;
      })
      .catch(error => console.error("Error:", error));
  }

  async componentDidMount() {
    const fetchedData = await this.getClients();
    this.setState({
      ...this.state,
      clientList: fetchedData
    });
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
            this.submitForm(e);
          }}
        >
          <input
            type="text"
            name="name"
            id=""
            placeholder="Nombre"
            onChange={this.handleChange}
            required
          />
          <input
            type="text"
            name="lastName"
            id=""
            placeholder="Apellido"
            onChange={this.handleChange}
            required
          />
          <input
            type="number"
            name="dni"
            id=""
            min="0"
            placeholder="Dni"
            required
            onChange={this.handleChange}
          />
          <input
            type="number"
            name="phone"
            id=""
            min="0"
            placeholder="Telefono"
            onChange={this.handleChange}
          />
          <input
            type="email"
            name="email"
            id=""
            placeholder="Email"
            onChange={this.handleChange}
          />
          <input
            type="text"
            name="address"
            id=""
            placeholder="Direccion"
            onChange={this.handleChange}
          />
          <button type="submit"> CREAR </button>
        </form>
        {this.state.clientList.length > 0 ? (
          <ClientList clientList={this.state.clientList} />
        ) : (
          ""
        )}
      </Style>
    );
  }
}
