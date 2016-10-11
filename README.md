Prototype URL: [http://52.24.122.11:8080/mscws-portal-api/resources/index.html#/](http://52.24.122.11:8080/mscws-portal-api/resources/index.html#/)

[User Guide](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Caseworker-Parent-Portal-Prototype-User-Guide)

## Unisys - MIssissippi Child Care Provider Search Prototype
# Project Overview

The purpose of the Mississippi Child Care Provider Search project is to provide an online search tool for case workers and parents to easily locate child care providers throughout the state.  In addition to our participation in the Case Worker Web Conference, the project team utilized the Unisys 'Interfaces' design framework for this prototype. At a high level, our design approach incorporated the following steps:


* Conducted qualitative research via focus groups, individual interviews and observations comprised of Mississippi residents in an effort to understand needs gather a wide-ranging span of ideas. 
* Conducted quantitative research using surveys and telephone interviews to quantify attitudes and opinions in effort to formulate features to be considered in the design of the search page.
* Created an initial user interface documented as wireframes.  
* Identified user stories to form the initial product backlog. 
* Developed the fully interactive prototype of the web/mobile application.  


## Architecture

Our architecture is based on HTML5, JavaScript (Angular.js) with a Java API (Dropwizard), Apache Tomcat 8.0 and mySQL database.

[Application Architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Application-Architecture)

# Adherence to U.S. Digital Services Playbook
 
We followed applicable plays from the U.S. Digital Services Playbook. [Details here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Adherence-to-U.S.-Digital-Services-Playbook).

# Unisys Prototype Team
## Team Leader 
Unisys assigned Rob Plummer as the one leader with authority, responsibility, and accountability for prototype quality.


## Product Development Team 
Multi-disciplinary and collaborative team includes nine (9) labor categories:

1. Product Owner – Rob Plummer
2. Technical Architect / Back End Web Developer – Kirtish Kulkarni
3. Front End Web Developer – Ankit Kumar
4. Interaction Designer/User Researcher/Usability Tester – Mike Stubbs
5. DevOps Team - Gopal Krishna Dash, Kangkan Goswami
6. Tech Writer – Martha Koffman
7. Visual Designer - Arun Purohit
8. Agile Coach / Scrum Master – Altony Rice

# Understanding of User Needs
We employed our Human-Centered Design (HCD), 'Interfaces' to elicit user requirements to form the Product Backlog. The section below summarizes our HCD process for the prototype. [Details here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process)

## Human-Centered Design

[Our HCD process](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process) leveraged the following techniques:

### Inspiration

* Developed **Design Challenge**: "*As a caseworker or parent, I would like to search for child care providers in my vicinity so that I can choose the best provider for a child*"
* Conducted group and one on one interviews with real case workers (Case Worker Web Conference) and several Mississippi residents.
* Conducted user research to identify target audiences
* Developed personas
* Brainstormed, starting with the "Diverge" step to get all ideas (no concern for viability/feasibility), then executed the "Converged" step to reduce ideas list to only viable/feasible.

### Ideation
* Synthesized insights from users (wants):
	* Simple / Intuitive
	* Trustworthy
	* Case worker / children photos
	* Print time-stamped case worker conversations  
* Created [user stories](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/stories)
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

### Implementation
* Developed [Balsamiq low-fi interactive prototypes](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/Low%20FIdelity%20mockups) - feedback from internal / user testing
* Conducted user tests and gathered feedback
* Developed [JustInMind high-fi interactive and responsive web mockup prototype](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/hi-fi%20mockups) - To get early feedback on styling, placement of interaction elements and readability. 
* Conducted mockup prototype user tests; gathered feedback
* Developed live [Design Style Guide (DSG)](https://parentportal.tabordasolutions.net/guidelines.html) using bootstrap/CSS/HTML5. DSG elements leveraged HTML mockup / user testing feedback.
* Conducted responsive design testing on desktop (Mac, PC) and mobile devices (iOS, Android)
* Updated DSG Design elements as prototype was elaborated – keeping DSG and prototype pages consistent and synchronized
* Developed prototype HTML using HTML mockup, user testing feedback, and DSG
* Iterated on pages, incorporating user testing feedback between iterations, finally reaching minimal viable product (MVP) 

## Prototype Development
### Modern Open Source Technologies
#### All Open Source Solution Components with Version #
* Front end
	* Bootstrap v3.3.7
	* Javascript
	* Angular.js v1.5.8
	* jQuery v3.1.1
	* NgMap v1.17.3
	* angular-input-stars-directive v1.5.5
	* eonasdan-bootstrap-datetimepicker v4.17.42
* Middleware
	* Web Server – Tomcat 8.5.5
* Back end
	* Java 8.0 
	* spring-data-rest-webmvc v2.5.2
	* Hibernate ORM v4.2.4.FINAL
* Database – mySQL
	* Version 5.5.52 
	
#### Automated Unit Testing
* Front end
	* Junit 4 
* Back end
	* Junit 4 

### Automated Functional Testing
* Front end 
	* Selenium v2.53
* Back end
	* JUnit 4

#### Continuous Integration
Implemented Jenkins inside VMWare for automated build, unit testing, code quality check, functional testing and deployment as code is checked in to GitHub.

* Configuration Management - GitHub
* Continuous Integration Automation - Jenkins [CI Screenshots] (https://github.com/mscws/cws-caseworker-parent-portal/wiki/Continuous-Integration) 
* Build
	* Front end – Maven 3.1.1
	* Back end – Maven 3.1.1
* Deploy
  - Server – AWS EC2 
  - Developer/QA – VMWare 

#### Prototype Deployment Environment
The prototype deployed to AWS (FedRAMP-certified IaaS). 

[Infrastructure Architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Infrastructure-Architecture)


#### Configuration Management 
The GitHub Repository is organized as:

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

### Deployment Documentation 
[Deployment Docs](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Deployment-Documentation)

### Prototype / Underlying Platform Licensing 
The prototype and underlying platforms are open licensed and free of charge.

### [Notes and Assumptions](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Notes-and-Assumptions) 

### Report Bugs & Issues
If you find a bug/issue with the prototype or the documentation, please contact "Miquel (Mike) Stubbs" via email (miquel.stubbs@unisys.com) or mobile at (614) 596-7140.

