import { Component } from "react";
import Authenticationservice from "./Authenticationservice";
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
            <div className="container">
                <table class="table">
                    <thead>
                   
                    <th>description</th>
                    <th>done</th>
                    <th>isCompleted</th>
                   </thead>
                       <tbody>
                    {
                        this.state.todos.map(
                            todo=>
                    <tr key={todo.id}>
                    
                    <td>{todo.description}</td>
                    <td>{todo.done.toString()}</td>
                    <td>{todo.targetDate.toString()}</td>
                    </tr>
                        )
    }
                    </tbody>
                   </table>
            </div>




            </div>

        )
    }
 }
 export default Todos

 