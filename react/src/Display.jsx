import axios from "axios";
import { useState } from "react";
import {student} from "./data"
const Display = () => {
    const[state, setState] = useState([{}])
    const fetchData  = () =>{
        const response  = axios.get("http://localhost:8080/api/data").then((response)=>{
            setState(response.data)
        })
        return response.data
    }
    return(
    <div>
        <button onClick={fetchData}> Get Student details</button>
        <ul>
        {state.map((data, key) => {
            return <li key={key} >
                name: {data.name} age: {data.age}
            </li>
            // <li key={key} >
            //     {data.age}
            // </li>

        })}
        </ul>
    </div>
        );
    }

export default Display;