import { Component } from "react";
import './login.css'
import {  BrowserRouter as Router ,Route, Routes,Link} from "react-router-dom";
import withParams from "./withParams";


import withNavigation from "./withNavigation";


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
                    <Route path="/welcome/:name" element={<WelcomeComponentWithParams/>}/>
                    <Route path="/todo" element={<Todos/>}/>
                    <Route path="/logout"  element={<LogoutComponent/>}/>
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
 class HeaderComponent extends Component{
    render(){
        return(
            
            <header>
                <nav className="navbar">
                    <div><a>Google</a></div>
                    <ul className="navbar-nav">
                        <li class="nav-link">Home</li>
                        <li class="nav-link">Todos</li>
                    </ul >
                    <ul  className="navbar-nav">
                        <li class="nav-link">Login</li>
                        <li class="nav-link">Logout</li>
                    </ul>
                </nav>
            </header>
        )
    }
 }
 class FooterComponent extends Component{
    render(){
        return(
           <footer className="footer">
            <span className="text-muted">All Rights Reserved 2018@ranjiadmin</span>
           </footer>
        )
    }
 }
 class LogoutComponent extends Component{
    render(){
        return(
            <div>
               <h1>You are logged out</h1>
               <div className="container">Thank You for using our Application</div>
            </div>
        )
    }
 }
 class Todos extends Component{
    constructor(props){
        super(props)
        this.state={
            todos:
            [
                {id:1 ,description:'LearnReact' , done:false,targetDate:new Date()},
                {id:2 ,description:'Learn to Dance',done:false,targetDate:new Date()},
                {id:3 ,description:'Learn to swim',done:false,targetDate:new Date()}
        
        ]

        }
    }
    render(){
       
        return(
            <div><h1>Todos List</h1>
            <table>
                <thead>
                    <th>id</th>
                    <th>description</th>
                    <th>done</th>
                    <th>isCompleted</th>
                </thead>
                <tbody>
                    {
                        this.state.todos.map(
                            todo=>
                    <tr>
                    <td>{todo.id}</td>
                    <td>{todo.description}</td>
                    <td>{todo.done.toString()}</td>
                    <td>{todo.targetDate.toString()}</td>
                    </tr>
                        )
    }
                </tbody>
            </table>





            </div>

        )
    }
 }
 class Welcome extends Component{
    render(){
        return(
            <div>Hii Welcome{this.props.params.name}You can manage your TodoList <Link to="/todo">Click here</Link></div> 
        )
    }
 }

 class LoginComponent extends Component{
    constructor(props){
        super(props);
        this.state={
            username:'Ranjitha',
            password:'',
            hasLoginFailed:false,
            showSuccessMessage:false
        };
        // this.handleUsername=this.handleUsername.bind(this)
        // this.handlepassword=this.handlepassword.bind(this)
        this.handleChange=this.handleChange.bind(this)
        this.loginClicked=this.loginClicked.bind(this)

    }
    
    handleChange(event){
        console.log(this.state)
        this.setState({
            [event.target.name]:event.target.value
        })
    }
    loginClicked(){
      if(this.state.username==='Ranjitha' && this.state.password==='Ranji'){
        this.props.navigate(`/welcome/${this.state.username}`)
        console.log("Successfull")
        this.setState({
           
           // showSuccessMessage:true,
        })
        this.setState({
            hasLoginFailed:false,
        })

      }
       
        else{
        console.log("Failed")
        this.setState({
            showSuccessMessage:false,
          
        })
        this.setState({
           hasLoginFailed:true,
          
        })
      
       // console.log(this.state)
    }
}
    // handleUsername(event){
    //     console.log(event.target.value)
    //     this.setState({
    //         username:event.target.value
    //     })
    // }
    // handlepassword(event){
    //     console.log(event.target.value)
    //     this.setState({
    //         password:event.target.value
    //     })
    // }

    render(){
        return(
            <div>
               {/* <ShowInvalidCred hasLoginFailed={this.state.hasLoginFailed}/>
                <ShowSuccesfull showSuccessMessage={this.state.showSuccessMessage}/>*/}
                {this.state.hasLoginFailed && <div>Invalid Credentials</div>}
                {this.state.showSuccessMessage && <div>Login Successfull</div>}
                UserName:<input type="text" name="username"  value={this.state.username} onChange={this.handleChange}/>
                Password:<input type="password" name="password" value={this.state.password} onChange={this.handleChange}/>
                <div><button className="login"  onClick={this.loginClicked}> LOGIN</button></div>
            </div>
        )
    }
 }
    // function ShowInvalidCred(props){
    //     if(props.hasLoginFailed){
    //         return <div>Invalid Credentials</div>
    //     }
    //     return null
    //  }
    //  function ShowSuccesfull(props){
    //     if(props.showSuccessMessage){
    //         return <div>Login Successfull</div>
    //     }
    //     return null
    //  }
    
function ErrorComponent() {
    return <div>An Error Occurred. I don't know what to do! Contact support at abcd-efgh-ijkl</div>
}


 
 export default TodoApp