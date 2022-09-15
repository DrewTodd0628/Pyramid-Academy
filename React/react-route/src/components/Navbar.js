import {Link} from 'react-router-dom'


const Navbar = () => {


  return (
    <nav style={{width: "fit-content", display:"block", marginLeft: "auto", marginRight: "auto"}}>
        <Link to="/">Home</Link>
        <Link to="/contact">Contact</Link>
        <Link to="/products">Products</Link>
        <Link to="/locations">Locations</Link>
        <Link to="/support">Support</Link>
    </nav>
  )
}

export default Navbar