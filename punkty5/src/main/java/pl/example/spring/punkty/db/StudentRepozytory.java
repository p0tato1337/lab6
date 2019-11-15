package pl.example.spring.punkty.db;

import org.springframework.data.repository.CrudRepository;

public interface StudentRepozytory extends CrudRepository<StudentRow,Long>
{

}
