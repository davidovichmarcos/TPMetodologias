import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.header`
  background: lightgrey;
`;

export default class CarCreate extends Component {
  render() {
    return (
      <Style>
        <h2>CAR CREATE</h2>
        <form action="">
          <input type="text" name="" id="" placeholder="Patente" />
          <input type="text" name="" id="" placeholder="Marca" />
          <input type="text" name="" id="" placeholder="Modelo" />
          <input type="number" name="" id="" placeholder="Año" />
          <input type="text" name="" id="" placeholder="Titular..." />
          <button type="submit"> CREAR </button>
        </form>
      </Style>
    );
  }
}
