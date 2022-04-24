package com.heydieproject.mahasiswasearchrestapi.repository;

import com.heydieproject.mahasiswasearchrestapi.entity.Mahasiswa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MahasiswaRepository extends CrudRepository<Mahasiswa, Long> {

    @Query("SELECT x from Mahasiswa x WHERE x.nama LIKE CONCAT('%',:nama,'%')")
    List<Mahasiswa> searchByNama(String nama);

    @Query(value = "select * from tbl_mahasiswa where alamat like concat('%',:alamat,'%')", nativeQuery = true)
    List<Mahasiswa> searchByAlamat(String alamat);
}
