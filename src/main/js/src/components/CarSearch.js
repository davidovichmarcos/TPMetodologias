import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.header`
  background: lightgrey;
`;

export default class CarSearch extends Component {
  render() {
    return (
      <Style>
        <h2>CAR SEARCH</h2>
        <form>
          <input type="text" name="" id="" placeholder="Ingrese patente..." />
          <button type="submit">Search</button>
        </form>
      </Style>
    );
  }
}
