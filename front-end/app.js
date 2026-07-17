loadTable();

function loadTable() {
    let stdTable = document.getElementById("tblStudent");

    let body = `<tr>
                <th>ID</th>
                <th>Name</th>
                <th>Address</th>
            </tr>`

    fetch("http://localhost:8080")
        .then(res => res.json())
        .then(data => {
            data.forEach(element => {
                console.log(element);

                body += `<tr>
                    <td>${element.id}</td>
                    <td>${element.name}</td>
                    <td>${element.address}</td>
                </tr>`

            });

            stdTable.innerHTML = body;
        })

}


function addStudent() {
    let name = document.getElementById("txtName").value;
    let address = document.getElementById("txaAddress").value;

    console.log("Name: " + name);
    console.log("Address: " + address);
    // ----------------------------------------------------------------


    // postman javascript-fetch code
    const myHeaders = new Headers();
    myHeaders.append("Content-Type", "application/json");

    const raw = JSON.stringify({
        "name": name,
        "address": address
    });

    const requestOptions = {
        method: "POST",
        headers: myHeaders,
        body: raw,
        redirect: "follow"
    };

    fetch("http://localhost:8080", requestOptions)
        .then((response) => response.text())
        .then((result) => {
            console.log(result)
            loadTable();
        })
        .catch((error) => console.error(error));

}