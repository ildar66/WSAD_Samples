

-- Generated by Relational Schema Center on Sun Jun 08 00:23:24 EDT 2003


CREATE SCHEMA TEST;

CREATE TABLE TEST.EMPLOYEE
  (SSN VARCHAR(250) NOT NULL,
   NAME VARCHAR(250));

ALTER TABLE TEST.EMPLOYEE
  ADD CONSTRAINT PK_EMPLOYEE PRIMARY KEY (SSN);

CREATE TABLE TEST.ADDRESS
  (STREET VARCHAR(250),
   CITY VARCHAR(250),
   STATE1 VARCHAR(250),
   ZIP INTEGER NOT NULL,
   EMPLOYEE_SSN VARCHAR(250) NOT NULL);

ALTER TABLE TEST.ADDRESS
  ADD CONSTRAINT PK_ADDRESS PRIMARY KEY (EMPLOYEE_SSN);

CREATE TABLE TEST.STUDENT
  (SSN VARCHAR(250) NOT NULL,
   NAME VARCHAR(250),
   AGE INTEGER NOT NULL,
   GPA DOUBLE);

ALTER TABLE TEST.STUDENT
  ADD CONSTRAINT PK_STUDENT PRIMARY KEY (SSN);

CREATE TABLE TEST.Students_Courses
  (COURSES_NUMBER INTEGER NOT NULL,
   STUDENTS_SSN VARCHAR(250) NOT NULL);

ALTER TABLE TEST.Students_Courses
  ADD CONSTRAINT PK_Students_Cours2 PRIMARY KEY (COURSES_NUMBER, STUDENTS_SSN);

CREATE TABLE TEST.COURSE
  (NUMBER1 INTEGER NOT NULL,
   NAME VARCHAR(250),
   DESCRIPTION VARCHAR(250));

ALTER TABLE TEST.COURSE
  ADD CONSTRAINT PK_COURSE PRIMARY KEY (NUMBER1);