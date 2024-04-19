package com.example.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;

public class Login implements EntryPoint {
    @Override
    public void onModuleLoad() {

        TextBox usernameTextBox = new TextBox();
        usernameTextBox.setStyleName("login-input");
        PasswordTextBox passwordTextBox = new PasswordTextBox();
        passwordTextBox.setStyleName("login-input");
        Button loginButton = new Button("Login");
        loginButton.setStyleName("login-button");

        // Create "Forgot Password" and "Register for Free" links
        Label forgotPasswordLabel = new Label("Forgot Password?");
        forgotPasswordLabel.setStyleName("forgot-password");
//        Label registerLabel = new Label("Register for Free");
//        registerLabel.setStyleName("register-link");

        // Create a panel to hold the login form and links
        VerticalPanel panel = new VerticalPanel();
        panel.setStyleName("login-form");
        panel.add(new Label("Username:"));
        panel.add(usernameTextBox);
        panel.add(new Label("Password:"));
        panel.add(passwordTextBox);
        panel.add(forgotPasswordLabel); // Moved above loginButton
       // panel.add(registerLabel); // Moved above loginButton
        panel.add(loginButton);

        // Add the panel to the root panel
        RootPanel.get().add(panel);
    }
}
