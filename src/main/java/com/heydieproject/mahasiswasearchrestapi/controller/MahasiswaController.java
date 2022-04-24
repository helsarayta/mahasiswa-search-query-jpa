package com.heydieproject.mahasiswasearchrestapi.controller;

import com.heydieproject.mahasiswasearchrestapi.entity.Mahasiswa;
import com.heydieproject.mahasiswasearchrestapi.service.MahasiswaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/mahasiswa")
public class MahasiswaController {

    private MahasiswaService mahasiswaService;

    public MahasiswaController(MahasiswaService mahasiswaService) {
        this.mahasiswaService = mahasiswaService;
    }

    @PostMapping
    public ResponseEntity<Mahasiswa> createdMahasiswa(@RequestBody Mahasiswa mahasiswa) {
        Mahasiswa createdNew = mahasiswaService.createdNew(mahasiswa);
        return ResponseEntity.ok(createdNew);
    }

    @GetMapping
    public Iterable<Mahasiswa> getAll() {
        return mahasiswaService.getAll();
    }

    @GetMapping(value = "/search/nama")
    public ResponseEntity<List<Mahasiswa>> searchByNama(@RequestParam ("nama") String nama) {
        List<Mahasiswa> mahasiswaList = mahasiswaService.searchByNama(nama);
        return ResponseEntity.ok(mahasiswaList);
    }

    @GetMapping(value = "/search/alamat")
    public ResponseEntity<List<Mahasiswa>> searchByAlamat(@RequestParam ("alamat") String alamat) {
        List<Mahasiswa> mahasiswaList = mahasiswaService.searchByAlamat(alamat);
        return ResponseEntity.ok(mahasiswaList);
    }
}
