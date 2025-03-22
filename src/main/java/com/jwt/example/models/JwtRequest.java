package com.jwt.example.models;

public class JwtRequest {

    private String email;
    private String password;

    // Default constructor
    public JwtRequest() {
    }

    // All-args constructor
    public JwtRequest(String email, String password) {
        this.email = email;
        this.password = password;
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter for email
    public void setEmail(String email) {
        this.email = email;
    }

    // Getter for password
    public String getPassword() {
        return password;
    }

    // Setter for password
    public void setPassword(String password) {
        this.password = password;
    }

    // Builder pattern
    public static class Builder {
        private String email;
        private String password;

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public JwtRequest build() {
            return new JwtRequest(email, password);
        }
    }

    // toString method
    @Override
    public String toString() {
        return "JwtRequest{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    // Static method for Builder pattern convenience
    public static Builder builder() {
        return new Builder();
    }
}
