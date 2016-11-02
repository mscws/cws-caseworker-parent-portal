# Documentation
## Brief Description of the Project



The Mississippi Child Care Provider Search prototype will provide an online search tool for parents and case workers to locate child
care providers.  While developing this prototype, we used the U.S. Digital Services Playbook to guide us; we documented how [here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Adherence-to-U.S.-Digital-Services-Playbook).

We developed the prototype using an agile process.  First, we completed Research and Discovery. We participated in the Case Worker Web Conference, and worked with Mississippi parents using our Human Centered Design framework to determine what was most important to them. Next, we conducted the Design. We developed our Design Style Guide and initial wireframes. These were used as the basis for early versions of the prototype. We vetted these products with our research participants and incorporated their feedback in five two day sprints. Finally, we published our Minimum Viable Product that is available [here] (http://52.24.122.11:8080/mscws-portal-api/resources/index.html#/). 

The prototype and all underlying platforms are open licensed and free of charge.

## Restoring a Git Bundle
The following document provides instructions how to [restore a Git bundle](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Restoring-a-Git-Bundle).

## Artifacts Used to Create the Prototype
During the implementation of the Mississippi Vendor Challenge, the Unisys team created many artifacts. These include research findings, user stories, frameworks or libraries, and functional descriptions for all components of the prototype; they are provided below.

1. [Research Findings](https://github.com/mscws/cws-caseworker-parent-portal/blob/master/Assets/Survey_Data.pdf)
2. [Developed User Stories](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/stories)
3. [Additional User Stories Not Implemented](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Additional-Identified-User-Stories-Not-Implemented)
3. [Frameworks](#Frameworks)
4. [Functional Description](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Caseworker-Parent-Portal-Prototype-User-Guide)
5. [Human Center Design](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process)
6. [Design Style Guide (DSG)](http://htmlpreview.github.io/?https://github.com/mscws/cws-caseworker-parent-portal/blob/master/designs/DesignStyleGuide.htm)
7. [Infrastructure Architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Infrastructure-Architecture)
8. [Application Architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Application-Architecture)
9. [Continuous Integration] (https://github.com/mscws/cws-caseworker-parent-portal/wiki/Continuous-Integration)
10. [Suggested Testing Workflow](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Suggested-Testing-Workflow)
11. [Definition of Done](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Definition-of-%22Done%22)
12. [Deployment Documentation](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Deployment-Documentation)
13. [Notes and Assumptions](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Notes-and-Assumptions)


## Unisys Team Structure
The Unisys multi-disciplinary and collaborative team includes eight (8) labor categories for the Mississippi Vendor Challenge. Please find below the role, name, responsibilities, hours worked and hourly rate for each team member.

**Role** |**Name** | **Responsibilities** | **Hours Worked** | **Hourly Rate**
:------------- |:------------- |:------------- |:------------- |:-------------
| Product Owner | Rob Plummer | Responsible for ensuring the success of the Mississippi Vendor Challenge Project | 68 | $328.45
| Technical Architect / Back End Web Developer | Kirtish Kulkarni | Responsible for defining the application architecture and coding the back end functionality | 86 | $168.95
| Front End Web Developer | Ankit Kumar | Responsible for coding the front end look which demonstrates the look and feel of the application | 72 | $133.75
| Interaction Designer / User Researcher / Usability Tester | Mike Stubbs | Responsible for conducting research, writing/ reviewing user stories, and prioritizing user story development based on expressed user needs | 64 | $152.50
| DevOps Team | <ul> <li> Gopal Krishna Dash </li> <li> Kangkan Goswami </li> </ul> | Responsible for developing and executing the build and deployment strategy | 120 | $168.95
| Writer / Content Designer / Content Strategist | Martha Koffman | Responsible for developing the documentation structure and authoring the User Guide | 40 | $152.50
| Visual Designer | Arun Purohit | Responsible for creating the Design Style Guide, coaching the team on our Human Centered Design approach, and developing the low and high fidelity prototypes for the application | 60 | $133.75
| Agile Coach / Delivery Manager | Altony Rice | Responsible for the overall Agile process, managing the user story backlog, facilitating communication among the team members, and developing technical documentation | 90 | $328.45

##User Guide
We developed a user guide as a companion to the Mississippi Vendor Challenge prototype. It serves as the foundation for what could be a more robust on-line help and training module. Please review it [here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Caseworker-Parent-Portal-Prototype-User-Guide).

## Report Bugs & Issues
If you find a bug/issue with the prototype or the documentation, please contact "Miquel (Mike) Stubbs" via email at (miquel.stubbs@unisys.com) or mobile at (614) 596-7140.

# Research and Discovery
The Unisys Team worked with prospective parents in Mississippi to understand how a web search portal could help them find child care providers for their children more effectively and efficiently. We identified the prospective end users by soliciting volunteers through several charitable organizations that serve parents likely to be eligible for subsidized child care.  Additionally, we participated in the Q&A session organized by the procurement committee to better understand the needs of caseworkers who use the search portal to find child care for children in the custody of the State.  Our research findings are documented [here](https://github.com/mscws/cws-caseworker-parent-portal/blob/master/Assets/Survey_Data.pdf). 

### Understanding of User Needs
We employed our Human-Centered Design (HCD), 'Interfaces' to elicit user requirements to form the Product Backlog. The section below summarizes our HCD process for the prototype. [Our HCD process](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Human-Centered-Design-Process) leveraged the following techniques:

<a Name="Inspiration">

#### Inspiration

</a>
* Developed **Design Challenge**: "*As a caseworker or parent, I would like to search for child care providers in my vicinity so that I can choose the best provider for a child*"
* Conducted group and one on one interviews with real case workers (Case Worker Web Conference) and several Mississippi residents.
* Conducted user research [(see here)](https://github.com/mscws/cws-caseworker-parent-portal/blob/master/Assets/Survey_Data.pdf) to identify target audiences
* Developed personas
* Brainstormed, starting with the "Diverge" step to get all ideas (no concern for viability/feasibility), then executed the "Converged" step to reduce ideas list to only viable/feasible.

#### Ideation
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

# Design
As a result of the research and discovery phase of the project, the Unisys Team created a number of artifacts that were used to facilitate further conversations with the end users. We designed and developed the prototype using an iterative and agile approach. Our design artifacts are listed below.

* Developed [Balsamiq low-fi interactive prototypes](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/Low%20Fidelity%20mockups) - feedback from internal / user testing
* Met with end users multiple times during development to test prototypes and gather their feedback both in person and electronically
* Developed [JustInMind high-fi interactive and responsive web mockup prototype](https://github.com/mscws/cws-caseworker-parent-portal/tree/master/hi-fi%20mockups) - To get early feedback on styling, placement of interaction elements and readability. 
* Conducted mockup prototype user tests; gathered feedback
* Developed live [Design Style Guide (DSG)](http://htmlpreview.github.io/?https://github.com/mscws/cws-caseworker-parent-portal/blob/master/designs/DesignStyleGuide.htm) using bootstrap/CSS/HTML. DSG elements leveraged HTML mockup / user testing feedback
* Conducted responsive design testing on desktop (Mac, PC) and mobile devices (iOS, Android)
* Updated DSG Design elements as prototype was elaborated – keeping DSG and prototype pages consistent and synchronized
* Developed prototype HTML using HTML mockup, user testing feedback, and DSG
* Iterated on pages, incorporating user testing feedback during iteration, finally reaching minimal viable product (MVP) 

# Prototype Development
During the development of the Mississippi Vendor Challenge, the Unisys team leveraged the Agile development process to facilitate collaboration among the team and to incorporate end user feedback on a frequent basis. We created our prototype to work on multiple devices (e.g. desktops, tablets, smart phones) using a responsive design. Our [architecture](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Application-Architecture)  is based on HTML5, JavaScript (Angular.js) with a Java API (Spring 4 MVC REST Service), Apache Tomcat 8.0 and mySQL database. We leveraged modern open source technologies everywhere; please see below for additional detail.

During our development effort, we took the following [notes and assumptions](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Notes-and-Assumptions) into consideration.

## Modern Open Source Technologies
We architected the Mississippi Vendor Challenge using the technologies shown in the table below. We selected these tools for three reasons:

1. Our team was familiar with these frameworks, libraries and components from work on previous engagements
2. We prioritized the selection of open source tools over commercial products
3. They provided the functions we needed in order to complete the challenge; For example, we leverage bootstrap for front-end development to complete a fully responsive design

<a Name="Frameworks">

### All Open Source Solution Frameworks and Components with Version Number and Licenses
</a>

**Tier** |**Framework / Component** | **Version Number** | **Licenses**
:------------- |:------------- |:------------- |:-------------
| Front end | Bootstrap | v3.3.7 | MIT
| Front end | Angular.js | v1.5.8 | MIT
| Front end | jQuery | v3.1.1 | MIT
| Front end | NgMap | v1.17.3 | MIT
| Front end | angular-input-stars-directive | v1.5.5 | MIT
| Front end | eonasdan-bootstrap-datetimepicker | v4.17.42 | Apache License, Version 2.0
| Middleware | Web Server – Tomcat | 8.5.5 | Apache License, Version 2.0
| Back end | Java | 8.0 | Oracle Binary Code License Agreement for the Java SE Platform
| Back end | spring-data-rest-webmvc | v2.5.2 | Apache License, Version 2.0
| Back end | Hibernate ORM | v4.2.4.FINAL | GNU Lesser General Public License
| Database | mySQL | Version 5.5.52 | GNU General Public License ,version 2

## Deployment Documentation
We deployed our prototype on a public Amazon Web Services (AWS) Cloud. AWS is a FedRAMP-certified Infrastructure as a Service (IaaS)  hosting provider. It provides us the ability to easily manage the configuration of the prototype and monitor the deployment in real-time. Additionally, it will automatically alert us of any issues. Please see the [Deployment Documentation](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Deployment-Documentation) for additonal details.

## Automated Unit Testing
The Unisys team leveraged tools to create automated unit and functional testing. The Unit Testing code coverage was nearly 100% and the evidence can be found in our codebase. Please refer to the GitHub Repositories Page [here](https://github.com/mscws/cws-caseworker-parent-portal/wiki/GitHub-Repositories) for further details. For front-end and back-end automated unit testing, we use JUnit 4 (License: Eclipse Public License 1.0).

We used SonarQube Version 6.0 - LGPL v3 to perform a static code analysis and identify code quality and security issues. This tool was incorporated into our continuous integration build process.

In addition automated unit testing, we also automated functional testing. Our functional testing coverage is documented in the [Suggested Testing Workflow](https://github.com/mscws/cws-caseworker-parent-portal/wiki/Suggested-Testing-Workflow). We leveraged Selenium v2.53 (License: The Apache Software License, Version 2.0) for front-end testing and JUnit 4 (License : Eclipse Public License 1.0) for back-end testing.

Finally, the team conducted guerilla testing to identify defects not found by automated testing.

## Continuous Integration & Deployment
The Unisys team implemented Jenkins v.2.7.4 (MIT license) inside VMWare for automated build, unit testing, code quality check, functional testing and deployment to both our internal QA environments and the AWS production environment. The builds are executed as code is checked into GitHub. We leveraged the following tools as part of our continuous integration process:
 
* Build
	* Front end – Maven 3.1.1 (License : Apache License Version 2.0)
	* Back end – Maven 3.1.1 (License : Apache License Version 2.0)
* Deploy
  - Server – AWS EC2 
  - Developer/QA – VMWare 

Please refer to the following [Continuous Integration] (https://github.com/mscws/cws-caseworker-parent-portal/wiki/Continuous-Integration) document for additional details of our process.

### Configuration Management 
We use GitHub for configuration management. The GitHub Repository is organized as shown in the page below.

* [MSCWS](https://github.com/mscws/cws-caseworker-parent-portal)

The following repository was utilized to support CI pipelines and are available below:

Source Code repository: [GitHub Repositories](https://github.com/mscws/cws-caseworker-parent-portal/wiki/GitHub-Repositories)
Binary repository: Nexus 2.14.0-01 - Eclipse Public License 

### Continuous Monitoring 
We used the following monitoring tools to provide enterprise-class Open Source IT monitoring, network monitoring, server and applications monitoring:

* Nagios® Core™ - Version 3.5.1 - GNU General Public License

## Prototype Installation Guide
Please refer to the [Installation Guide for Mississippi Vendor Challenge Prototype](https://github.com/mscws/cws-caseworker-parent-portal/blob/master/Assets/Installation%20Guide%20for%20Mississippi%20Vendor%20Challenge%20Prototype.pdf) for instructions on how to install and run the prototype on another target.








