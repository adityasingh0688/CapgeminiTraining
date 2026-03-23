package com.example.SpringStarter.Service;

import com.example.SpringStarter.Model.Training;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainingServiceImpl implements TrainingService{
    @Override
    public Training addTraining(Training training) {
        return null;
    }

    @Override
    public boolean deleteTraining(int trainingId) {
        return false;
    }

    @Override
    public Training findById(int trainingId) {
        return null;
    }

    @Override
    public List<Training> findByTopics(String topic) {
        return List.of();
    }

    @Override
    public Training updateTraining(Training training) {
        return null;
    }
}
