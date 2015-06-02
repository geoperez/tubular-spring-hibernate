package hello;

import hello.model.Producto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tubular.GridDataRequest;
import tubular.GridDataResponse;

@RestController
public class SampleController {

    @Autowired
    private DataService dataService;

    @RequestMapping(value = "/tubular", method = RequestMethod.POST)
    public ResponseEntity<GridDataResponse> update(@RequestBody GridDataRequest tubularRequest) {
    	GridDataResponse response = dataService.getResponse(tubularRequest, Producto.class);
    	
        return new ResponseEntity<GridDataResponse>(response, HttpStatus.OK);
    }
}
