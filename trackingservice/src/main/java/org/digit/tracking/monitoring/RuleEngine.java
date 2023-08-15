package org.digit.tracking.monitoring;

import org.apache.tomcat.util.digester.Rule;
import org.openapitools.model.TripProgress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.digit.tracking.util.Constants.RULE_LOAD_METHOD;
import static org.digit.tracking.util.Constants.RULE_METHOD_PREFIX;

@Service
public class RuleEngine {
    //Rules rules = new Rules();

    @Autowired
    Rules rules;

    public void executeSingleRuleMethod(String method, String progressId, RuleModel ruleModel){

        Class<?> rulesClass = rules.getClass();
        try {
            Method loadModel = rulesClass.getDeclaredMethod(method, String.class, RuleModel.class);
            Object obj = loadModel.invoke(rules, progressId, ruleModel);
            ruleModel = (RuleModel) obj;
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    //Dynamically execute all rule methods
    public void executeAllRules(String progressId){
        //Initialise Rule Model for this execution of all rules
        RuleModel ruleModel = new RuleModel();

        //Step 1 - Execute the load method so that data model in Rules is populated
        this.executeSingleRuleMethod(RULE_LOAD_METHOD, progressId, ruleModel);

        //Step 2 - Iterate through the rule methods and execute them
        Class<?> rulesClass = rules.getClass();
        try {
            Method[] methods = rulesClass.getDeclaredMethods();
            for (Method method : methods) {
                if (method.getName().startsWith(RULE_METHOD_PREFIX))
                    method.invoke(rules, ruleModel);
            }
        } catch (InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
