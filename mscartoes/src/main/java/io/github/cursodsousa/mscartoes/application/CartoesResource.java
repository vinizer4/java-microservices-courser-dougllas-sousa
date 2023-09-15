package io.github.cursodsousa.mscartoes.application;

import io.github.cursodsousa.mscartoes.application.representation.CartaoSaveRequest;
import io.github.cursodsousa.mscartoes.domain.Cartao;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cartoes")
@RequiredArgsConstructor
public class CartoesResource {

    private final CartaoService cartaoService;

    @GetMapping
    public String status() {
        return "API Cartões funcionando!";
    }

    @PostMapping
    public ResponseEntity cadastra(@RequestBody CartaoSaveRequest request) {
        Cartao cartao = request.toModel();

        cartaoService.save(cartao);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
