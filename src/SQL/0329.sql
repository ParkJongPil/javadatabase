show tables;

desc aaa;

drop table aaa;
create table aaa (
	name varchar(20) not null,
	age int default 20,
	gender char(2) default 'm',
	joinday datetime default now()
);
	
	insert into aaa values('홍길서',25,default, default);
	insert into aaa values('홍길순',25,"f", default);
	insert into aaa values('김말숙',35,"f", '2020-1-5');
	insert into aaa values('이기자',35,"f", '2020-1-5');
	
	select * from aaa;
	
	
	delete from aaa;