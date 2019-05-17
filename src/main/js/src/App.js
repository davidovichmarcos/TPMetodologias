import React from "react";
import Header from "./components/Header";
import Login from "./components/Login";
import Footer from "./components/Footer";
import styled from "styled-components";
import "./App.css";

const Style = styled.header`
  background: lightgrey;
`;

function App() {
  return (
    <Style>
      <Header />
      <Login />
      <h1>BODY</h1>
      <Footer />
    </Style>
  );
}

export default App;
