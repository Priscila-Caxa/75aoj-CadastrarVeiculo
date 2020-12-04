package com.example.demo.resources;

import com.example.demo.domain.Veiculo;

import java.net.URI;
import java.security.cert.CertPathBuilder;

public class ResponseEntity<T> {
    public static ResponseEntity<Veiculo> ok(Veiculo obj) {
    }

    public static CertPathBuilder created(URI uri) {
    }
}
