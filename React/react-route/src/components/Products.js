import React from 'react'
import Footer from './Footer';
import Navbar from './Navbar';

const Products = () => {
    return (
        <div>
            <header>
                <div style={{width: "fit-content", display:"block", marginLeft: "auto", marginRight: "auto"}}>PC Builderz</div>
                <Navbar/>
            </header>
            <h1>Products</h1>
            <p>What we have to offer.</p>
            <Footer/>
        </div>
    )
}

export default Products;