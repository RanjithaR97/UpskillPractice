import { Component } from "react";
import './login.css'
import {  BrowserRouter as Router ,Route, Routes,Link} from "react-router-dom";
 class Welcome extends Component{
    render(){
        return(
            <>
            <h1>WELCOME!</h1>
            <div className="container">Hii Welcome{this.props.params.name}  You can manage your TodoList <Link to="/todo">Click here</Link></div> 
            </>
        )
    }
 }
 export default Welcome