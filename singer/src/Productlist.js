import Product from "./Product";
function Productlist({items}){
    return(
        <div>
            {items.map((item,index) =>(
                <Product 
                key={index} 
                name={item.name} 
                price={item.price} 
                />
            ))}
        </div>
    );
}
export default Productlist;