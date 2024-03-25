use career_hub;
show tables;
describe jobapplication;
insert into applicant(applicant_id,first_name,last_name,email,phonenumber,resume)
values(1,"Aadhya","Parvin","abc@gmail.com","978678560","aadhyaresume.123.url.com");
insert into applicant(applicant_id,first_name,last_name,email,phonenumber,resume)
values(2,"Akriti","Pankaj","abc@gmail.com","978678560","akritiresume.256.url.com"),
(3,"Goyal",null,"abc@gmail.com","978678560","goyuresume.1256.url.com"),
(4,"Rachel","Sebastin","abc@gmail.com","978678560","rachelresume.506.url.com"),
(5,"Zoya","Singh","abc@gmail.com","978678560","zoyaresume.56.url.com"),
(6,"Kuldeep","Pandey","abc@gmail.com","978678560","kuldeepresume.906.url.com"),
(7,"Catherine","Fernandes","abc@gmail.com","978678560","cathyresume.1236.url.com"),
(8,"Rayan","Rajput","abc@gmail.com","978678560","rayanresume.6256.url.com");

select * from jobapplication;

insert into company(company_id,company_name,location)
values(1,"zoho","chennai"),
(2,"capgemini","banglore"),
(3,"hexaware","mumbai"),
(4,"accenture","kolkata"),
(5,"tcs","coimbatore"),
(6,"wipro","chennai");
insert into joblisting(job_id,job_title,job_description,job_location,salary,posted_date,Company_company_id)
values(1001,"software engineer","well versed in java","chennai",50000,"2024-02-01",1),
(1002,"data architect","networking knowledge","coimbatore",45000,"2024-01-13",5),
(1003,"cybersecurity engineer","network,cyber knowledge","kolkata",55000,"2024-02-16",4),
(1004,"web developer","frontend html,css knowledge","banglore",40000,"2024-01-20",2),
(1005,"project manager","proficiency in speaking,knowledge in java","kolkata",60000,"2024-03-01",4),
(1006,"software engineer","well versed in java","mumbai",50000,"2024-02-01",3),
(1007,"web developer","frontend html,css knowledge","chennai",40000,"2024-01-20",6),
(1008,"cloud engineer","frontend html,css knowledge,cloud","banglore",70000,"2024-03-15",2);
insert into jobapplication(application_id,application_date,cover_letter,Applicant_applicant_id,JobListing_job_id)
values(101,"2024-02-04","abc.url.com",1,1001),
(102,"2024-01-24","a132bc.url.com",2,1002),
(103,"2024-02-17","iobc.url.com",3,1003),
(104,"2024-01-25","arubc.url.com",4,1004),
(105,"2024-03-04","abidc.url.com",5,1005),
(106,"2024-02-04","abcstha.url.com",6,1006),
(107,"2024-02-01","abosc.url.com",7,1007),
(108,"2024-03-20","abcsskj.url.com",8,1008);
