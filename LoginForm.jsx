import React, { useState } from 'react'
import './Login.css'
import { FaRegUser } from "react-icons/fa";
import { FaLock } from "react-icons/fa";
const LoginForm = () => {

  const [action, setAction] = useState('');
  const registerLink = () => {
    setAction('active');
  };
  const loginLink =()=>{
    setAction('');
  };
  return (
    <div className={`wrapper${action}`}>
      <div className='form'>
        <form action=''>
          <h1>Login</h1>
          <div className="input_box">
            <input type="text" 
            placeholder='Username'required/>
            <FaRegUser className='icon' />

          </div>
          <div className="input_box">
            <input type="password" 
            placeholder='Password'required/>
<FaLock className='icon'/>

          </div>
          <div className='remember'>
            
            <a href='#'>Forgot Password ?</a>
          </div>
          <button type='submit'>Login</button>
          <div className="register">
            <p>Dont have an account?
              <a href='#' onClick={registerLink}
              >Register</a>
            </p>
          </div>
        </form>
      </div>
      <div className='form_register'>
        <form action=''>
          <h1>Registration </h1>
          <div className="input_box">
            <input type="text" 
            placeholder='Name'required/>
            <FaRegUser className='icon' />

          </div>
          <div className="input_box">
            <input type="email" 
            placeholder='Email ID'required/>
<FaLock className='icon'/>

          </div>
          <div className="input_box">
            <input type="password" 
            placeholder='password'required/>


          </div>
          
          <button type='submit'>Register</button>
          <div className="register">
            <p>Already have an account? 
              <a href='#'onClick={loginLink}
              >Login</a>
            </p>
          </div>
        </form>
      </div>
      
    </div>
  )
}

export default LoginForm;
