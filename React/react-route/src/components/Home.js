import React from 'react'
import Footer from './Footer';
import Navbar from './Navbar';

const Home = () => {

    return (
        <div>
            <header>
                <div style={{width: "fit-content", display:"block", marginLeft: "auto", marginRight: "auto"}}>PC Builderz</div>
                <Navbar/>
            </header>
            <h1>Home</h1>
            <p>Stuff about us.</p>
            <Footer/>
        </div>

    )
}

export default Home;