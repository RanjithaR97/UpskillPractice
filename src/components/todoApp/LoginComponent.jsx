import { Component } from "react";
import Authenticationservice from "./Authenticationservice";

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
        Authenticationservice.registerSuccessfull(this.state.username,this.state.password)
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
                <h1>Login</h1>
                <div className="container">
               {/* <ShowInvalidCred hasLoginFailed={this.state.hasLoginFailed}/>
                <ShowSuccesfull showSuccessMessage={this.state.showSuccessMessage}/>*/}
                {this.state.hasLoginFailed && <div className="alert alert-warning">Invalid Credentials</div>}
                {this.state.showSuccessMessage && <div>Login Successfull</div>}
                <div className="Loginc" style={{top:-200}} >
                UserName:<input type="text" name="username"   value={this.state.username} onChange={this.handleChange}/>
                Password:<input type="password" name="password"  value={this.state.password} onChange={this.handleChange}/></div>
                <div><button  type="button"  className="btn btn-success" onClick={this.loginClicked}> LOGIN</button></div>
                </div>
            </div>
        )
    }
 }
 export default LoginComponent