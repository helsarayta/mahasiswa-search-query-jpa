package com.heydieproject.mahasiswasearchrestapi.service.ServiceImpl;

import com.heydieproject.mahasiswasearchrestapi.entity.Mahasiswa;
import com.heydieproject.mahasiswasearchrestapi.repository.MahasiswaRepository;
import com.heydieproject.mahasiswasearchrestapi.service.MahasiswaService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MahasiswaServiceImpl implements MahasiswaService {

    private MahasiswaRepository mahasiswaRepository;

    public MahasiswaServiceImpl(MahasiswaRepository mahasiswaRepository) {
        this.mahasiswaRepository = mahasiswaRepository;
    }

    @Override
    public List<Mahasiswa> searchByNama(String nama) {
        return mahasiswaRepository.searchByNama(nama);
    }

    @Override
    public List<Mahasiswa> searchByAlamat(String alamat) {
        return mahasiswaRepository.searchByAlamat(alamat);
    }

    @Override
    public Mahasiswa createdNew(Mahasiswa mahasiswa) {
        return mahasiswaRepository.save(mahasiswa);
    }

    @Override
    public Iterable<Mahasiswa> getAll() {
        return mahasiswaRepository.findAll();
    }
}
