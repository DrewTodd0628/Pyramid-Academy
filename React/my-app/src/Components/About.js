import React from 'react'
import bkg from "../img/bkg-straw.png";

const About = () => {
  return (
    <div class="container h-100 container-fluid pt-5 pb-5 mt-5" style={{ backgroundImage:`url(${bkg})`}}>
    <h2 style={{color: '#7d5a36'}}>About Coffee OS</h2>
    <div style={{color: '#7d5a36'}}>

      <p>Coffee OS is a free, open-source operating system based on React OS. Thanks to reverse engineering, it can run Windows programs, including your favorite browser and video games.</p>

      <h5 class="pt-3">What does Coffee OS have to offer over React OS?</h5>
      <ul>
        <li>
      With its CreamUI desktop environment, using the desktop is better than ever! Its cleaner material design brings a warm welcome every time you log in.
      </li>
      <li>
      The Sugery File Manager offers built-in native support for cloud storage, including Google Drive, OneDrive, and more.
      </li>
      <li>
      And best of all, all the coffee themes! From bitter to sweet, with our lineup of backgrounds, icon packs, and color schemes, you can make your PC yours!
      </li>
      <p>Long gone are the days of being stuck on Windows. You can now move over to the Coffee OS today and take all your favorite apps with you!</p>
      </ul>
      </div>
  </div>   
    
  )
}

export default About