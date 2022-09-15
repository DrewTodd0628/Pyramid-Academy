// import logo from './logo.svg';
// import './App.css';
import {Routes, Route} from 'react-router-dom';
import Contact from './components/Contact';
import Home from './components/Home';
import Locations from './components/Locations';
import Products from './components/Products';
import Support from './components/Support';

function App() {
  return (
  <Routes>
    <Route path="/" element={<Home/>}></Route>
    <Route path="contact" element={<Contact/>}></Route>
    <Route path="products" element={<Products/>}></Route>
    <Route path="locations" element={<Locations/>}></Route>
    <Route path="support" element={<Support/>}></Route>
  </Routes>
  );
}

export default App;
