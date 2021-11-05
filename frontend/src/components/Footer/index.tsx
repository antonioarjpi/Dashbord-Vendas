// import 'assets/components/footer/footer-white.css'
import 'components/Footer/footer-white.css'
import Github from 'components/img/github_icon.png'
import Gmail from 'components/img/gmail_icon.png'
import Whatsapp from 'components/img/whatsapp_icon.png'
import Linkdin from 'components/img/linkedin_icon.png'

function Footer() {
    return (
  
        <footer id="myFooter">
            <div className="container">
                <ul>
                    <li><a href="/">Informações da Empresa</a></li>
                    <li><a href="/">Contato</a></li>
                </ul>
                <p className="footer-copyright">© 2021 Copyright - SimpleDev</p>
            </div>
            <div className="footer-social">
                <a href="https://github.com/antonioarjpi" className="social-icons"><img src={Github} alt="Github logo" className="fa fa-github" /></a>
                <a href="mailto:antonioarjpi@gmail.com?subject=Hello%20agin/" className="social-icons"><img src={Gmail} alt="Gmail logo" className="fa fa-gmail" /></a>
                <a href="https://www.linkedin.com/in/antonioarjpi/" className="social-icons"><img src={Linkdin} alt="Linkdin logo" className="fa fa-linkdin" /></a>
                <a href="https://web.whatsapp.com/send?phone=5586994273871" className="social-icons"><img src={Whatsapp} alt="Whatsapp logo" className="fa fa-whatsapp" /></a>
            </div>
        </footer>

    );
  }
  
  export default Footer;
  