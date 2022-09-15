
const Nav = () => {
  return (

  <nav class="navbar navbar-expand-sm navbar-light" style={{fontWeight: 'bold', backgroundColor: '#bf9259'}}>
{/* Hashtag threw errors in console. */}
  <a class="navbar-brand" href="https://stackoverflow.com" style={{marginLeft: '20px', color: '#FFF', fontSize: '30px'}}>CoffeeOS</a>

  <ul class="navbar-nav" style={{marginLeft: '20px'}}>
    <li class="nav-item">
      <a class="nav-link" style={{color: '#6e512b'}} href="https://stackoverflow.com">Home</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" style={{color: '#6e512b'}} href="https://stackoverflow.com">About</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" style={{color: '#6e512b'}} href="https://stackoverflow.com">Contact Us</a>
    </li>
  </ul>

</nav>

        )
}

export default Nav