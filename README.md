# PROJECT TITLE: Location.asia
(VN real-estate News Hub)
## STATEMENT OF WORK
Organizing real estate news of Vietnam.
## SCOPE OF WORK
The scope of this project Location.asia is to design and develop web services and chrome extensions.  
Core development:
* Group slider by: Property in your area (location-based), Most view property, Most active agents, Related news.
* Interaction: check mark (agent wants more viewers to this property), question mark (request direct contact info).
* User profile: wish list (buy | sell).
* Browser device location  
  
Location.asia should minimally provide the following functions:
* Authentication (login/sign up)  
* User profile  
* Last view  
* Manage client journey (contact info, buy | sell | wish)  
* Discover  
* Search  
* Filter results: Keywords | Dimension  
* Sort results: Ascending | Descending  
* Files view: List | Column | Thumbnail  
* Most Views (Scrape 22 property details and listing grid layout with pagination)  
* Manage  
* My Bookmarks: Listing of targeted property with tags.  
* Reading history: tracking viewed topics.  
* Comment: Taking notes  
* Calendar reminder: reservation  
* Chatbox: FB | Zalo  
* Share: Property (one or bulk selection)
## System Interfaces:
Location.asia interacts with various interfaces, including but not limited to a web interface. The web service interface will act as the hub to provide external APIs to mobile and desktop connections. Admin Panel exposes features to Business Operator users - developer, real-estate agents (sales team), and monitoring traffic and transactions.  
## User Interface:
Location.asia will have user interfaces that must look the same on iOS, Android, Windows or the Web. Thymeleaf is used for Spring Web interface. Materials UI developed by Google would be adopted in the future.
## UI/UX Design:
Location.asia is an easy to use application. Usability, user-friendly GUI should be the design focus.
## Basic instruction:
* Make sure you have maven installed.
  
To compile: (using Maven)
* mvn install // to build  
* java -jar target/demo-0.0.1-SNAPSHOT.jar // to run
  
The other way to compile and run:
* mvn install  && java -jar target/demo-0.0.1-SNAPSHOT.jar
* mvn clean install && java -jar target/demo-0.0.1-SNAPSHOT.jar
* mvn spring-boot:run <br /> <br />
To compile: (using Gradle) <br /> 
* gradle bootRun <br />
