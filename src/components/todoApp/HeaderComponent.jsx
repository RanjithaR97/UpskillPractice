import { Component } from "react";
import Authenticationservice from "./Authenticationservice";
import {  BrowserRouter as Router ,Route, Routes,Link} from "react-router-dom";
class HeaderComponent extends Component{
    render(){
        const isUserloggedIn=Authenticationservice.isUserloggedIn();
      //  console.log(isUserloggedIn);
        return(
            
            <header>
                <nav className="navbar navbar-expand-md navbar-dark bg-dark">
                  {  isUserloggedIn && <div><a href="https://www.google.com" className="navbar-brand">Google</a></div>}
                    <ul className="navbar-nav">
                       { isUserloggedIn &&<li className="nav-link"><Link className="nav-link" to="/welcome/:name">Home</Link></li>}
                      { isUserloggedIn &&<li className="nav-link"><Link  className="nav-link" to="/todo">Todos</Link></li>}
                    </ul >
                    <ul  className="navbar-nav navbar-collapse justify-content-end">
                       { !isUserloggedIn && <li className="nav-link"><Link className="nav-link" to="/login">Login</Link></li>}
                      { isUserloggedIn && <li className="nav-link"><Link  className="nav-link" to="/logout" onClick={Authenticationservice.logout}>Logout</Link></li>}
                    </ul>
                </nav>
            </header>
        )
    }
 }
 export default HeaderComponent