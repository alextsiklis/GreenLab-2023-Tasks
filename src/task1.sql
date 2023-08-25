drop table if EXISTS workers;

create table workers (
    id int primary key,
    surname varchar(200) unique,
    experience int,
    check (experience >= 0)
);

insert into workers values (1, 'Ivanov', 10), (4, 'Petr', 12), (2, 'Petrov', 12), (3, 'Sidorov', 14);

with workers_max as (
	select max(experience) as exper
	from workers
	where experience < (
        select max(experience)
        from workers
    )
) 
select surname
from workers 
join workers_max on workers.experience = workers_max.exper