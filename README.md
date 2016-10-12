Prototype URL: [http://52.24.122.11:8080/mscws-portal-api/resources/index.html#/](http://52.24.122.11:8080/mscws-portal-api/resources/index.html#/)
##### [Inspiration](#Inspiration)

# Unisys - Mississippi Child Care Provider Search Prototype
## Documentation
### Brief Description of the Project

The purpose of the Mississippi Child Care Provider Search project is to provide an online search tool for case workers and parents to easily locate child care providers throughout the state.  In addition to our participation in the Case Worker Web Conference, the project team utilized the Unisys 'Interfaces' design framework for this prototype. At a high level, our design approach incorporated the following steps:


* Conducted qualitative research via focus groups, individual interviews and observations comprised of Mississippi residents in an effort to understand needs gather a wide-ranging span of ideas. 
* Conducted quantitative research using surveys and telephone interviews to quantify attitudes and opinions in effort to formulate features to be considered in the design of the search page.
* Created an initial user interface documented as wireframes.  
* Identified user stories to form the initial product backlog. 
* Developed the fully interactive prototype of the web/mobile application.  

### Artifacts Used to Create the Prototype
1. [(Research Findings)](https://github.com/mscws/cws-caseworker-parent-portal/blob/master/Assets/Survey_Data.pdf)
2. [(Developed User Stories)](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/stories)
3. [Additional User Stories Not Implemented]()
3. [Frameworks](#Frameworks)
4. [Functional Description](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Caseworker-Parent-Portal-Prototype-User-Guide)
5. [Human Center Design](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process)
6. [Design Style Guide (DSG)](http://htmlpreview.github.io/?https://github.com/mscws/cws-caseworker-parent-portal/blob/master/designs/DesignStyleGuide.htm)
7. [Infrastructure Architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Infrastructure-Architecture)
8. [Application Architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Application-Architecture)
9. [Continuous Integration] (https://github.com/mscws/cws-caseworker-parent-portal/wiki/Continuous-Integration)
10. [Suggested Testing Workflow]()
11. [Definition of Done]()
12. [Deployment Documentation](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Deployment-Documentation)
13. [Notes and Assumptions](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Notes-and-Assumptions)

##### Understanding of User Needs
We employed our Human-Centered Design (HCD), 'Interfaces' to elicit user requirements to form the Product Backlog. The section below summarizes our HCD process for the prototype. [Details here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process)

##### Human-Centered Design

[Our HCD process](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process) leveraged the following techniques:

<a Name="Inspiration">

##### Inspiration

</a>
* Developed **Design Challenge**: "*As a caseworker or parent, I would like to search for child care providers in my vicinity so that I can choose the best provider for a child*"
* Conducted group and one on one interviews with real case workers (Case Worker Web Conference) and several Mississippi residents.
* Conducted user research [(see here)](https://github.com/mscws/cws-caseworker-parent-portal/blob/master/Assets/Survey_Data.pdf) to identify target audiences
* Developed personas
* Brainstormed, starting with the "Diverge" step to get all ideas (no concern for viability/feasibility), then executed the "Converged" step to reduce ideas list to only viable/feasible.

##### Ideation
* Synthesized insights from users (wants):
	* Simple / Intuitive
	* Trustworthy
	* Case worker / children photos
	* Print time-stamped case worker conversations  
* Created [User Stories](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/stories)
	* [Child Care Provider Basic Search](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Child-Care-Provider-Basic-Search)
	* [Child Care Provider Advanced Search](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Child-Care-Provider-Advanced-Search)
	* [Child Care Provider Map Search](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Child-Care-Provider-Map-Search)
	* [Schedule Service Provider Appointment](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Schedule-Service-Provider-Appointment)
	* [Email or Call Child Care Provider](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Email-or-Call-Child-Care-Provider)
	* [Multi-Language](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Multi-Language)
	* [Understanding Quality Star Ratings](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Understanding-Quality-Star-Ratings)
	* [Filtering and Sorting Search Results](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Filtering-and-Sorting-Search-Results)
	* [Provider Details Page](https://github.com/mscws/cws-caseworker-parent-portal/wiki/User-Story:-Provider-Details-Page)
* Updated user stories elaborations, including acceptance criteria

##### Implementation
* Developed [Balsamiq low-fi interactive prototypes](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/Low%20Fidelity%20mockups) - feedback from internal / user testing
* Conducted user tests and gathered feedback
* Developed [JustInMind high-fi interactive and responsive web mockup prototype](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/hi-fi%20mockups) - To get early feedback on styling, placement of interaction elements and readability. 
* Conducted mockup prototype user tests; gathered feedback
* Developed live [Design Style Guide (DSG)](http://htmlpreview.github.io/?https://github.com/mscws/cws-caseworker-parent-portal/blob/master/designs/DesignStyleGuide.htm) using bootstrap/CSS/HTML. DSG elements leveraged HTML mockup / user testing feedback
* Conducted responsive design testing on desktop (Mac, PC) and mobile devices (iOS, Android)
* Updated DSG Design elements as prototype was elaborated – keeping DSG and prototype pages consistent and synchronized
* Developed prototype HTML using HTML mockup, user testing feedback, and DSG
* Iterated on pages, incorporating user testing feedback during iteration, finally reaching minimal viable product (MVP) 

## Unisys Prototype Team Structure
### Team Leader 
Unisys assigned Rob Plummer as the one leader with authority, responsibility, and accountability for prototype quality.


### Product Development Team 
Multi-disciplinary and collaborative team includes nine (9) labor categories:

1. Product Owner – Rob Plummer
2. Technical Architect / Back End Web Developer – Kirtish Kulkarni
3. Front End Web Developer – Ankit Kumar
4. Interaction Designer/User Researcher/Usability Tester – Mike Stubbs
5. DevOps Team - Gopal Krishna Dash, Kangkan Goswami
6. Tech Writer – Martha Koffman
7. Visual Designer - Arun Purohit
8. Delivery Manager – Altony Rice

#### Adherence to U.S. Digital Services Playbook
 
We followed applicable plays from the U.S. Digital Services Playbook. [Details here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Adherence-to-U.S.-Digital-Services-Playbook).

## Architecture

Our architecture is based on HTML5, JavaScript (Angular.js) with a Java API (Dropwizard), Apache Tomcat 8.0 and mySQL database.



## Prototype Development
### Modern Open Source Technologies
<a Name="Frameworks">

#### All Open Source Solution Frameworks and Components with Version #
</a>
* Front end
	* Bootstrap v3.3.7 (License : MIT)
	* Javascript
	* Angular.js v1.5.8 (License : MIT)
	* jQuery v3.1.1 (License : MIT)
	* NgMap v1.17.3 (License:  MIT)
	* angular-input-stars-directive v1.5.5 (License:  MIT)
	* eonasdan-bootstrap-datetimepicker v4.17.42 (License : Apache License, Version 2.0)
* Middleware
	* Web Server – Tomcat 8.5.5 (License : Apache License, Version 2.0)
* Back end
	* Java 8.0 (License : Oracle Binary Code License Agreement for the Java SE Platform)
	* spring-data-rest-webmvc v2.5.2 (License : Apache License, Version 2.0)
	* Hibernate ORM v4.2.4.FINAL (License : GNU Lesser General Public License)
* Database – mySQL
	* Version 5.5.52 (License : GNU General Public License ,version 2)
	
#### Automated Unit Testing
* Front end
	* Junit 4 (License : Eclipse Public License 1.0)
* Back end
	* Junit 4 (License : Eclipse Public License 1.0)

#### Automated Functional Testing
* Front end 
	* Selenium v2.53 (License : The Apache Software License, Version 2.0)
* Back end
	* JUnit 4 (License : Eclipse Public License 1.0)

#### Continuous Integration
Implemented Jenkins inside VMWare for automated build, unit testing, code quality check, functional testing and deployment as code is checked in to GitHub.

* Configuration Management - GitHub
* Continuous Integration Automation - Jenkins [CI Screenshots] (https://github.com/mscws/cws-caseworker-parent-portal/wiki/Continuous-Integration) 
* Build
	* Front end – Maven 3.1.1 (License : Apache License Version 2.0)
	* Back end – Maven 3.1.1 (License : Apache License Version 2.0)
* Deploy
  - Server – AWS EC2 
  - Developer/QA – VMWare 

#### Prototype Deployment Environment
The prototype deployed to AWS (FedRAMP-certified IaaS). 


#### Configuration Management 
The GitHub Repository is organized as shown in the page below.

* [MSCWS](https://github.com/mscws/cws-caseworker-parent-portal)

The following repository was utilized to support CI pipelines and are available below:

Source Code repository: [GitHub Repositories](https://github.com/mscws/cws-caseworker-parent-portal/wiki/GitHub-Repositories)
Binary repository: Nexus

### Continuous Monitoring 
Implemented the following monitoring:

* Nagios
* Vanda Appliance

### Containerization 
The prototype wasn't deployed in a container (such as Docker) due to the limited amount of time to complete the vendor challenge.

## Miscellaneous
### Deployment Documentation 
[Deployment Docs](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Deployment-Documentation)

### Prototype / Underlying Platform Licensing 
The prototype and underlying platforms are open licensed and free of charge.

### Notes and Assumptions
[Notes and Assumptions](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Notes-and-Assumptions) 

### Report Bugs & Issues
If you find a bug/issue with the prototype or the documentation, please contact "Miquel (Mike) Stubbs" via email at (miquel.stubbs@unisys.com) or mobile at (614) 596-7140.

### Restoring a Git Bundle
[Restoring a Git Bundle](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Restoring-a-Git-Bundle)
