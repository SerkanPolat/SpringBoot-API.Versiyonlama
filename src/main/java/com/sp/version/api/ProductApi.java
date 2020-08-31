package com.sp.version.api;

import com.sp.version.dto.ProductV1;
import com.sp.version.dto.ProductV2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ProductApi {

    //URI VERSIONING
    @GetMapping("/v1")
    public ResponseEntity<ProductV1> pathVersionProductV1(){
        return ResponseEntity.ok(new ProductV1("TOSHIBA LAPTOP"));
    }
    //URI VERSIONING
    @GetMapping("/v2")
    public ResponseEntity<ProductV2> pathVersionProductV2(){
        return ResponseEntity.ok(new ProductV2("TOSHIBA LAPTOP","35000"));
    }

    //PARAM VERSIONING
    @GetMapping(value = "/param",params = "apiVersion=1")
    public ResponseEntity<ProductV1> paramVersionProductV1(){
        return ResponseEntity.ok(new ProductV1("TOSHIBA LAPTOP"));
    }
    //PARAM VERSIONING
    @GetMapping(value = "/param",params = "apiVersion=2")
    public ResponseEntity<ProductV2> paramVersionProductV2(){
        return ResponseEntity.ok(new ProductV2("TOSHIBA LAPTOP","35000"));
    }

    //HEADER VERSIONING
    @GetMapping(value = "/header",headers = "X-Api-Version=1")
    public ResponseEntity<ProductV1> headerVersionProductV1(){
        return ResponseEntity.ok(new ProductV1("TOSHIBA LAPTOP"));
    }
    //HEADER VERSIONING        HTTP Header adlandirma standartdi.X ile Baslar.
    @GetMapping(value = "/header",headers = "X-Api-Version=2")
    public ResponseEntity<ProductV2> headerVersionProductV2(){
        return ResponseEntity.ok(new ProductV2("TOSHIBA LAPTOP","35000"));
    }



}
