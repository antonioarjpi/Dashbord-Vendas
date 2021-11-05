import Footer from "components/Footer";
import NavBar from "components/NavBar";
import { Link } from "react-router-dom";


function Home() {
    return (
      <>
        <NavBar/>
        <div className="container">
  
            <div className="jumbotron">
              <h1 className="display-4 mt-5 mb-3">Dashboard de Vendas</h1>
              <p className="lead">Analise o desempenho das suas vendas por diferentes perspectivas</p>
              <hr/>
              <p className="mt-3">Dashboard de vendas é um recurso tecnológico que mostra, de maneira ágil, intuitiva e em tempo real, uma série de informações sobre o andamento de suas vendas. O seu uso, por conta de gráficos e indicadores, dá uma visão geral sobre o processo e torna as tomadas de decisões muito mais assertivas.</p>
              <p className="mt-4">Esta aplicação consiste em exibir um dashboard a partir de dados fornecidos por um back end construído com Spring Boot.</p>
              <Link className="btn btn-primary btn-lg mt-5" to="/dashboard">
                Acessar Dashboard
              </Link>       
            </div>
      
        </div>
        <Footer/>
        </>
    );
  }
  export default Home;