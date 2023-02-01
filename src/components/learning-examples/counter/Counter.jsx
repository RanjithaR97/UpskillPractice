
import React, { Component } from "react";
import './Counter.css';

class Counter extends Component{

    constructor(){
        super();
        this.state={
            counter:0,
            secondCounter:100
        }
        this.increment=this.increment.bind(this)
        this.decrement=this.decrement.bind(this)
        this.reset=this.reset.bind(this)
       }
    render() {
        return (
          <div className="App">
           <CounterButton by={1}  incrementMethod={this.increment}   decrementMethod={this.decrement}/>
           <CounterButton by={5} incrementMethod={this.increment} decrementMethod={this.decrement}/>
           <CounterButton by={10} incrementMethod={this.increment} decrementMethod={this.decrement}/>
           <span className="count">{this.state.counter}</span>

          <div className="reset"> <button style={{width:150,height:50}} onClick={this.reset}>RESET</button></div>
          </div>
         
        );
      }

      reset(){
        // console.log(`increment from parent - ${by}`)
        this.setState(
           { counter:0}
        );
     }
      increment(by){
       // console.log(`increment from parent - ${by}`)
       this.setState(
        (prevState)=>{
         
          return  {counter:prevState.counter  +  by}
        
        })
    }

    decrement(by){
        // console.log(`increment from parent - ${by}`)
        this.setState(
         (prevState)=>{
          
           return  {counter:prevState.counter  -  by}
         
         })
     }
}
class CounterButton extends Component{

   constructor(){
    super();
    // this.state={
    //     counter:0,
    //     secondCounter:100
    // }
    // this.increment=this.increment.bind(this)
    // this.decrement=this.decrement.bind(this)
   }


    render(){
    return(
        <div className="Counter">
            <button onClick={()=>this.props.incrementMethod(this.props.by)}>+{this.props.by}</button>
            <button onClick={()=>this.props.decrementMethod(this.props.by)}>-{this.props.by}</button>

           {/* <button onClick={this.increment}>+{this.props.by}</button>
            <button onClick={this.decrement}>-{this.props.by}</button>*/}
        
         {/*<span className="count">{this.state.counter}</span>*/}
       {/* <span className="count">{this.state.secondCounter}</span>*/}
        </div>
    )
    }

//    increment(){
//         this.setState({
//             counter:this.state.counter + this.props.by,
           
//         });
//         this.props.incrementMethod(this.props.by);
//     }

//     decrement(){
//         this.setState({
//             counter:this.state.counter - this.props.by,
           
//         });
//         this.props.decrementMethod(this.props.by);
//     }
   
   
}

 

export default Counter;