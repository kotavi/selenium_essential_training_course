# Selenium essential training

To see the full course go to 
https://www.linkedin.com/learning/selenium-essential-training

### Environment

- MacOS
- IntelliJ IDEA
- ChromeDiver
- Java


### How to start with Java project

https://www.jetbrains.com/help/idea/convert-a-regular-project-into-a-maven-project.html
https://stackoverflow.com/questions/47757068/the-import-org-openqa-cannot-be-resolved

### Web site to run tests on

http://formy-project.herokuapp.com/autocomplete

### Drag and drop example

https://gist.github.com/rcorreia/2362544

### How to match text with CSS selector

- **prefix** `Example: a[id^='id_prefix_']`
    
- **suffix** `Example: a[id$='_id_suffix']`
    
- **substring** `Example: a[id*='id_pattern']`
    
- **exact match** `Example: a[id='id']`


### Run on the Grid

Selenium Standalone Server
https://www.seleniumhq.org/download/

https://github.com/SeleniumHQ/selenium/wiki/Grid2

    `java -jar selenium-server-standalone-<version>.jar -role hub`
    
    `java -jar selenium-server-standalone-<version>.jar -role node  -hub http://localhost:4444/grid/register`
    
### Run in CI

- https://circleci.com/
- https://jenkins.io/
- https://www.jetbrains.com/teamcity/
- https://travis-ci.org/

#### How to choose
- infrastructure cost
- ease of setup 
- maintenance needs
- flexibility to run tests in varies configurations