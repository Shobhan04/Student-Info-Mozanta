import './App.css';
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import Home from './StudentCrud/Home';
import StudentRegistrationForm from './StudentCrud/StudentRegistrationForm';
import DisplayStudent from './StudentCrud/DisplayStudent';



function App() {
  return (
    <div className="App">
      
      <BrowserRouter>
      <Home/>
      <Routes>
      
        <Route path='/register' element={<StudentRegistrationForm/>}></Route>
        <Route path='/display' element={<DisplayStudent/>}></Route>
      </Routes>
      </BrowserRouter>

    </div>
  );
}

export default App;
