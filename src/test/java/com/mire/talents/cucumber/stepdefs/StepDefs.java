package com.mire.talents.cucumber.stepdefs;

import com.mire.talents.TalentsClientApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TalentsClientApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
