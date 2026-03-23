package com.example.SpringStarter.Repository;

import com.example.SpringStarter.Model.Training;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //converts sql exception to runtimeexception
public interface TrainingRepository extends JpaRepository<Training, Integer> {

}