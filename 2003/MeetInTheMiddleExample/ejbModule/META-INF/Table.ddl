

-- Generated by Relational Schema Center on Thu Jul 03 21:47:01 EDT 2003


CREATE SCHEMA BOTTOMUP;

CREATE TABLE BOTTOMUP.EMPLOYEE
  (EMP_NO INTEGER NOT NULL,
   FIRSTNME VARCHAR(50),
   MIDINIT CHARACTER(1),
   LASTNME VARCHAR(50),
   PHONE VARCHAR(25),
   HIREDATE DATE);

ALTER TABLE BOTTOMUP.EMPLOYEE
  ADD CONSTRAINT EMPLOYEE_PK PRIMARY KEY (EMP_NO);