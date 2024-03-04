fetch("/api/hello")
    .then(response => response.json())
    .then(greeting => console.log(greeting))