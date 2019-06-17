import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.div``;

function SelectOwner({ clients, clientChange }) {
  if (clients.length > 0) {
    return (
      <select name="client" id="" onChange={clientChange} required>
        {clients.map((client, i) => {
          return (
            <option value={client.id} key={i}>
              {client.name + " " + client.lastName}{" "}
            </option>
          );
        })}
      </select>
    );
  } else {
    return "CREAR CLIENTES";
  }
}

export default class CarCreate extends Component {
  state = {
    formData: {},
    clientList: []
  };

  handleChange = event => {
    this.setState({
      formData: {
        ...this.state.formData,
        [event.target.name]: event.target.value
      }
    });
  };

  clientChange = event => {
    let client = this.state.clientList[event.target.value - 1];
    this.setState({
      ...this.state,
      formData: {
        ...this.state.formData,
        client: client
      }
    });
  };

  //MODIFICAR!
  async submitForm() {
    /// meter en process.env
    var url = "http://localhost:8080/car";
    var data = this.state.formData;
    console.log("PAQUETE A ENVIAR: ", data);
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
        console.log("RESPUSTA CAR CREATE: ", res);
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
          <SelectOwner
            clients={this.state.clientList}
            clientChange={this.clientChange}
          />
          <button type="submit"> CREAR </button>
        </form>
      </Style>
    );
  }
}
