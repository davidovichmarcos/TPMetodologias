import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.div`
  width: 60vw;
  height: 30vh;
`;

export default class Login extends Component {
  render() {
    return (
      <Style>
        <h1>LOGIN</h1>
        <form action="">
          <input type="text" name="user" id="" />
          <input type="password" name="" id="" />
          <button type="submit"> ACCEDER </button>
        </form>
      </Style>
    );
  }
}
