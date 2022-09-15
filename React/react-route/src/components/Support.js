import React from 'react'
import Footer from './Footer';
import Navbar from './Navbar';

const Support = () => {
    return (
        <div>
            <header>
                <div style={{width: "fit-content", display:"block", marginLeft: "auto", marginRight: "auto"}}>PC Builderz</div>
                <Navbar/>
            </header>
            <h1>Support</h1>
            <p>How can we help you?</p>
            <Footer/>
        </div>
    )
}

export default Support;