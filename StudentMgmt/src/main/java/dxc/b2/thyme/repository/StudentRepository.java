package dxc.b2.thyme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dxc.b2.thyme.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
