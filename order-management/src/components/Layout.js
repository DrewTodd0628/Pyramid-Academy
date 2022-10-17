import React, { useState } from 'react'
import Footer from './Footer'
import Header from './Header'
import Navbar from './Navbar'
import { Outlet } from 'react-router-dom';

const Layout = () => {

  return (
    <div className="App">
      <Header/>
      <Navbar/>
      <main>
        <Outlet/>
      </main>
      <Footer/>
    </div>
  )
}

export default Layout