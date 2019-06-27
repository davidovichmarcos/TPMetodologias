import React from "react";
import styled from "styled-components";

import avatar from "../static/img/avatar.png";

const ClientCard = styled.div`
  display: inline-block;
  display: grid;
  grid-template-columns: 1fr 3fr;
  grid-auto-flow: column;
  /*max-width: 400px;*/
  border-radius: 5px;
  margin: 5px 0px;
  border: 1px solid rgba(0, 0, 0, 0.2);
  padding: 20px;
  :hover {
    box-shadow: 1px 5px 10px rgba(0, 0, 0, 0.2);
    cursor: pointer;
  }

  .avatar {
    background-image: url(${avatar});
    background-size: 70px;
    background-repeat: no-repeat;
    background-position: center center;
  }
`;

const Grid = styled.div`
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-auto-flow: row;
  grid-gap: 30px;
  margin-bottom: 50px;
`;

function ClientElement({ client }) {
  return (
    <ClientCard>
      <div className="avatar" />
      <div>
        <h3>{client.name + " " + client.lastName}</h3>
        <h6>{"ID :" + client.id + "  Dni: " + client.dni}</h6>
      </div>
    </ClientCard>
  );
}

export default function ClientList(props) {
  const length = props.clientList.length;
  return (
    <div>
      <h3>Clients List ({length})</h3>
      <Grid>
        {props.clientList.map((client, i) => {
          return <ClientElement client={client} key={i} />;
        })}
      </Grid>
    </div>
  );
}
