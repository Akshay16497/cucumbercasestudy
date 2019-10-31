Feature: Demo webshop 

Background:
Given Launch Url
And Demoweb shop url launched

@login
Scenario: login process of demoweb shop
Then clock on login
And provided credentials
Then user should see home page

@register
Scenario: Registration process of demoweb shop
Then click on register
And provide all credentials
Then he should be registered user
