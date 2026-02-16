function Product({name,price}){
    return(
        <div style={{
            border:"1px solid black",
            margin:"10px",
            padding:"10px",
            width:"200px"}}>
            <h3>{name}</h3>
            <p>Price: ₹{price}</p>
        </div>
    );
}
export default Product;