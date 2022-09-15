import React from 'react'
import Footer from './Footer';
import Navbar from './Navbar';

const Locations = () => {
    return (
        <div>
            <header>
                <div style={{width: "fit-content", display:"block", marginLeft: "auto", marginRight: "auto"}}>PC Builderz</div>
                <Navbar/>
            </header>
            <h1>Locations</h1>
            <p>Where to find us.</p>
            <Footer/>
        </div>
    )
}

export default Locations;