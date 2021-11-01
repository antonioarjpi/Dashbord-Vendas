import Barchart from "assets/components/BarChart";
import DataTable from "assets/components/DataTable";
import Donutchart from "assets/components/DonutChart";
import Footer from "assets/components/footer";
import NavBar from "assets/components/NavBar";

function App() {
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

export default App;
