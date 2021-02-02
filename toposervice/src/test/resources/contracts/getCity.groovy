import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description "should return the list of books"
    request {
        url "/api/topographicdetails/Barcelona"
        method GET()
    }
    response {
        status OK()
        headers {
            contentType applicationJson()
        }
        body(id: "Barcelona", landscape: "Flat")
        status(200)
    }
}
