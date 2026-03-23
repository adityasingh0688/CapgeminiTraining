package com.example.SpringStarter.Controller;

import com.example.SpringStarter.Model.Training;
import com.example.SpringStarter.Service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/training")
public class TrainingController {
    private TrainingService trainingService;

    @Autowired
    public TrainingController(TrainingService trainingService){
        super();
        this.trainingService = trainingService;
    }

    @GetMapping("/{trainingId}")             // if ?trainingid = 34 RequestParam, HeaderParam, CookieParam
    Training findById(@PathVariable("trainingId") int trainingId){
        Training training = trainingService.findById(trainingId);
        return training;
    }
}
