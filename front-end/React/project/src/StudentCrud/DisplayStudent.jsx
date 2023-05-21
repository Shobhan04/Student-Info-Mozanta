import axios from 'axios'
import React, { useEffect, useState } from 'react'

const DisplayStudent = () => {

//Create an empty array to store all the student after fetching from database
  let [data,setData]=useState([])

  //To Fetch The Data  from data base using axios.GET method
  useEffect(()=>{
    axios.get("http://localhost:8080/api/student")
    .then((response)=>{
      setData(response.data). //set all the student in data array
    })
    .catch((error)=>{
      console.log(error);
    })

  },[])


  return (
    <div>
      <div className='container bg-light mt-3'>

        <h3 className='text-center'>Display Student By Name</h3>


      <table className="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Name</th>
      <th scope="col">DOB</th>
      <th scope="col">Class</th>
      <th scope="col">Division</th>
      <th scope="col">Gender</th>


    </tr>
  </thead>
      {/* Here i used map function to display all the student present in database */}
  {data.map((x)=>{
    return(
      <tbody>
    <tr>
      <th scope="row">{x.regdId}</th>
      <td>{x.name}</td>
      <td>{x.dob}</td>
      <td>{x.classs}</td>
      <td>{x.division}</td>
      <td>{x.gender}</td>


    </tr>

  </tbody>
    )
  })}
</table>

      </div>
    </div>
  )
}

export default DisplayStudent
