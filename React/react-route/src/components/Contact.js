import React from 'react'
import Footer from './Footer';
import Navbar from './Navbar';

const Contact = () => {
    return (
        <div>
            <header>
                <div style={{width: "fit-content", display:"block", marginLeft: "auto", marginRight: "auto"}}>PC Builderz</div>
                <Navbar/>
            </header>
            <h1>Contact</h1>
            <p>How to contact us.</p>
            <Footer/>
        </div>
    )
}

export default Contact;