import React, { Component } from 'react'

export class Footer extends Component {
  render() {
    return (
      <footer className="page-footer font-small blue bg-dark">       
        <div className="footer-copyright text-center py-3"> 
        <span style={{color: 'white'}}>© 2022 Copyright: </span> 
        <a href="#" style={{textDecoration: 'none'}}><span style={{color: 'tomato', fontStyle: 'italic'}}>Luxury Car</span> <span style={{color: 'white'}}>Rental</span></a>
        </div>      
      </footer>
    )
  }
}

export default Footer;