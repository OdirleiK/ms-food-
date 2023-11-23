package com.myorg;

import software.amazon.awscdk.App;
import software.amazon.awscdk.Environment;
import software.amazon.awscdk.StackProps;

import java.util.Arrays;

public class PaymentAwsInfraApp {
    public static void main(final String[] args) {
        App app = new App();
        new PaymentAwsVpcStack(app, "Vpc");

        app.synth();
    }
}

