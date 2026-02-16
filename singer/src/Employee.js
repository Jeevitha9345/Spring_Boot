import './Employee.css';
function Employee(props){
    return(
        <div className="container">
            <div id="employee">
                <h2>Employee Name: <u>{props.name}</u></h2>
                <h2>Employee Role: <u>{props.role}</u></h2>
                <h2>Employee Salary: <u>{props.salary}</u></h2>
            </div>
        </div>
    );
}
export default Employee;