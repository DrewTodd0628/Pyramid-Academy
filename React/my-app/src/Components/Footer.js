import React from 'react'
import bkg from "../img/bkg-beans.png";

const Footer = () => {
  return (

    <div class = ".container"> 

    <footer style={{ backgroundImage:`url(${bkg})`}} class="page-footer font-small text-light pt-4 position-absolute bottom-0 container-fluid h-30">
        <div class="container-fluid text-center text-md-left">
        <div class="row">
    
    
          <div class="col-md-6 mt-md-0 mt-3 pt-5">
    
    
            <h5 class="text-uppercase">Our Mission</h5>
            <p>We aim to bring the better and safer computing experience to the world at large.</p>
    
          </div>
    
    
          <hr class="clearfix w-100 d-md-none pb-3"></hr>
      
            <div class="col-md-3 mb-md-0 mb-3">
    
            
            <h5 class="text-uppercase">Useful Links</h5>
    
            <ul class="list-unstyled">
              <li>
                <a href="#!">Home</a>
              </li>
              <li>
                <a href="#!">About</a>
              </li>
              <li>
                <a href="#!">Contact Us</a>
              </li>
            </ul>
    
          </div>
          <div class="col-md-3 mb-md-0 mb-3">
    
          <h5 class="text-uppercase">Social Media</h5>
    
            <ul class="list-unstyled">
              <li>
                <a href="#!">Facebook</a>
              </li>
              <li>
                <a href="#!">Instagram</a>
              </li>
              <li>
                <a href="#!">Twitter</a>
              </li>
              <li>
                <a href="#!">Linkedin</a>
              </li>
            </ul>
    
          </div>
        </div>
      </div>
    
    
     
      <div class="footer-copyright text-center py-2">© 2022 Copyright:
        <a href="/"> Drew</a>
      </div>
     
    
    </footer>
    </div>
  )
}

export default Footer