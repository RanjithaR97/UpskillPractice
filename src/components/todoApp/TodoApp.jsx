import { Component } from "react";
import './login.css'
import {  BrowserRouter as Router ,Route, Routes,Link} from "react-router-dom";
import withParams from "./withParams";
import Authenticationservice from "./Authenticationservice.js";
import AuthenticateRoute from "./AuthenticateRoute";
import Welcome from "./Welcome";
import LoginComponent from "./LoginComponent";
import HeaderComponent from "./HeaderComponent";
import FooterComponent from "./FooterComponent";
import withNavigation from "./withNavigation";
import { Button } from "bootstrap";
import Todos from "./Todos";
import LogoutComponent from "./LogoutComponent";
import ErrorComponent from "./ErrorComponent";

 class TodoApp extends Component{

    render(){
        const WelcomeComponentWithParams = withParams(Welcome);
        const LoginComponentWithNavigation = withNavigation(LoginComponent);
        return(
            <div>
                   
                    <Router>
                    <HeaderComponent/>
                    <Routes>
                    <Route path="/"  element={<LoginComponentWithNavigation/>}/>
                    <Route path="/login" element={<LoginComponentWithNavigation/>}/>
                    <Route path="/welcome/:name" element={ <AuthenticateRoute><WelcomeComponentWithParams/></AuthenticateRoute>}/>
                    <Route path="/todo" element={<AuthenticateRoute><Todos/></AuthenticateRoute>}/>
                    <Route path="/logout"  element={<AuthenticateRoute><LogoutComponent/></AuthenticateRoute>}/>
                    <Route path="*" element={<ErrorComponent />} />
                    </Routes>
                    <FooterComponent/>
                    </Router>
                    
            
            
          {/* <div><LoginComponent/></div>
           <div><Welcome/></div>*/}
        </div>
        )
    }
    
 }
 
 
 export default TodoApp