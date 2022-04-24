package com.heydieproject.mahasiswasearchrestapi.service;

import com.heydieproject.mahasiswasearchrestapi.entity.Mahasiswa;
import com.heydieproject.mahasiswasearchrestapi.repository.MahasiswaRepository;
import org.springframework.stereotype.Service;

import java.util.List;


public interface MahasiswaService {

    public List<Mahasiswa> searchByNama(String name);
    public List<Mahasiswa> searchByAlamat(String alamat);
    public Mahasiswa createdNew(Mahasiswa mahasiswa);
    public Iterable<Mahasiswa> getAll();

}
