import React from "react";
import styled from "styled-components";
import "./App.css";

import Header from "./components/Header";
import Login from "./components/Login";
import CarSearch from "./components/CarSearch";
import CarData from "./components/CarData";
import CarCreate from "./components/CarCreate";
import ClientCreate from "./components/ClientCreate";
import Repair from "./components/repair";
import Footer from "./components/Footer";

const Style = styled.header`
  background: lightgrey;
`;

function App() {
  return (
    <Style>
      <Header />
      <Login />
      <CarSearch />
      <ClientCreate />
      <CarCreate />
      <CarData />
      <Repair />
      <Footer />
    </Style>
  );
}

export default App;
