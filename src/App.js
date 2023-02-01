import React, { Component } from 'react';
import logo from './logo.svg';
import './App.css';
import FirstComponent  from './components/learning-examples/FirstComponent';
 import Second from './components/learning-examples/Second';
 import ThirdComponent from './components/learning-examples/ThirdComponent';
 import Counter from './components/learning-examples/counter/Counter';
class App extends Component {
  render() {
    return (
      <div className="App">
       <Counter />
      </div>
     
    );
  }
}


class LearningComponents extends Component{
  render(){
    return(
      <div className='LearningComponents'>
         Hii Welcome
       <FirstComponent></FirstComponent>
       <Second></Second>
       <ThirdComponent></ThirdComponent>

      </div>
    )
  }
}


export default App;
