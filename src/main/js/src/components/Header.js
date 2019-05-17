import React, { Component } from "react";
import styled from "styled-components";

const Style = styled.header`
  background: darkgrey;
  min-height: 50px;
  display: flex;
  align-items: center;
  justify-content: space-around;
`;

const Logo = styled.div`
  font-size: 2.5em;
  font-weight: bold;
`;

const Nav = styled.nav`
  ul {
    justify-self: end;
    display: inline;
    li {
      display: inline;
      padding: 0px 10px;

      a {
        text-decoration: none;
        color: black;
        :hover {
          color: blue;
        }
      }
    }
  }
`;

let navdata = [
  { name: "Home", link: "#home" },
  { name: "Cars", link: "#cars" },
  { name: "Help", link: "#help" }
];

export default class Header extends Component {
  render() {
    let fillMenu = navdata.map((link, index) => {
      return (
        <li>
          <a href={link.link}>{link.name}</a>
        </li>
      );
    });
    return (
      <Style>
        <Logo>LOGO</Logo>
        <Nav>
          <ul>{fillMenu}</ul>
        </Nav>
      </Style>
    );
  }
}
