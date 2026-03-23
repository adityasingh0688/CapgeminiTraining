package com.example.SpringStarter.Service;

import com.example.SpringStarter.Model.Training;
import java.util.List;

public interface TrainingService {
    List<Training> findByTopics(String topic);
    Training findById(int trainingId);
    Training addTraining(Training training);
    Training updateTraining(Training training);
    boolean deleteTraining(int trainingId);
}
