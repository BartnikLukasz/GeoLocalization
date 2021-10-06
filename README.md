# GeoLocalization
Application for storing localization information

**Description:**\
This application allows storing information about localization of given device using device id and longitude and latitude.

**Usage**\
To test this applicaton I used Postman for making API calls. Saving information is done by making POST request at\
  URL: "localhost:8080/api"\
  Body: json:\
  {\
    "deviceId": String with size 8-16 characters,\
    "longitude": BigDecimal(9,6),\
    "latitude": BigDecimal(9,6)\
  }\
  Example: \
    {\
    "deviceId": "deviceId10"\
    "longitude": "50.975",\
    "latitude": "49.2123"\
}

**Stack tech**
  * Java 11
  * Spring boot 2.5.5
  * Hibernate 5.4.32.Final
  * Apache Maven 3.8.2
  * Apache Tomcat 9.0.53
  * H2 Database 1.4.200
  * Hibernate Validator 6.1.0.Final
  * MapStruct 1.4.2.Final
  * Lombok
