import Barchart from "components/BarChart";
import DataTable from "components/DataTable";
import Donutchart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";


const Dashboard = () => {
    return (
        <div>
        <NavBar/>
        <div className="container">
        <h1 className="text-primary py-3">Dashboard de Vendas</h1>
  
        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de sucesso (%)</h5>
            <Barchart/>
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Taxa de vendas (%)</h5>
            <Donutchart/>
          </div>
          <div className="px-3">
           <h1 className="text-primary py-3">Todas as vendas</h1>
          </div>
        </div>
  
        <DataTable/>
        </div>
        <Footer/>
        
      </div>
    );
  }
  
  export default Dashboard;