import { Component } from "react";
import Authenticationservice from "./Authenticationservice";
import { Route,Redirect } from "react-router-dom";
import { Navigate } from 'react-router-dom'
class AuthenticateRoute extends Component{
    render(){
        if(Authenticationservice.isUserloggedIn()){
            return {...this.props.children}
        }
        else{
            return <Navigate to="/login" /> 
        }
    }
}

export default AuthenticateRoute