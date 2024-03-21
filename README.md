
How to Package Your React App with Spring Boot
https://medium.com/analytics-vidhya/how-to-package-your-react-app-with-spring-boot-41432be974bc

Material UI is not working with latest ReactJS 18.x, Hence downgraded to 17.x
NodeJS Old Releases - https://nodejs.org/en/download/releases/


CORS Issue
https://stackoverflow.com/questions/51128176/reactjs-api-data-fetching-cors-error


Node Package repository, similar to Maven Repository
https://www.npmjs.com/


------------------------------------------------------------
***** 
https://stackoverflow.com/questions/71913692/module-not-found-error-cant-resolve-react-dom-client
React 17 example:
import React from "react";
import { render } from "react-dom";
import "./index.css";
import App from "./App";

const root = document.getElementById("root");
render(<App />, root);

React 18 example:
import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

------------------------------------------------------------