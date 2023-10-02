/*
List the f_Name, l_Name, dept_Name of the employer who draws a salary greater than the average salary of employees working for the Finance department.
*/
select * from emptbl e left join depttbl d on e.dno=d.dno where salary < (select avg(salary) from emptbl where d.dname='Finance') ;



/*
List the name and department of the employer who is currently working on more than two project controlled by R&D department.
*/

/*
List all the ongoing projects controlled by all the departments.
*/

/*
Give the details of the supervisor who is supervising more than 3 employees who have completed at least one project.
*/

/*
List the name of the dependents employee who has completed a total_projects worth 10L.
*/

/*
List the department and employee details whose project is in more than one city.
*/
