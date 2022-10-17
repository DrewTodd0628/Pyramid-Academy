import React from 'react'
import { useNavigate } from 'react-router-dom';

const Navbar = () => {

  const navigate = useNavigate();

  return (
    <nav>
        <button onClick={() => navigate("/shop")}>Shop</button>
        <button onClick={() => navigate("/shopping-cart")}>Shopping Cart</button>
        <button onClick={() => navigate("/checkout")}>Check Out</button>
    </nav>
  )
}

export default Navbar