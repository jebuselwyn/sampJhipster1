package com.demo.cucumber.stepdefs;

import com.demo.SampJhipster1App;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SampJhipster1App.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
