import DataTable from "assets/components/DataTable";
import Footer from "assets/components/footer";
import NavBar from "assets/components/NavBar";

function App() {
  return (
    <div>
      <NavBar/>
      <div className="container">
      <h1 className="text-primary">Olá, mundo</h1>
      <DataTable/>
      </div>
      <Footer/>
      
    </div>
  );
}

export default App;
