create table tblMem(
  num number primary key, -- 일련번호
  bun number not null,
  name varchar2(20) not null,
  tel varchar2(20) not null,
  email varchar2(30),
  addr varchar2(100)
)

drop table tblMem;
create sequence seq_num; -- seq_num.nextval
insert into tblMem
values(seq_num.nextval,1005,
'이동건','010-1111-1111','9553541@naver.com',
'광주')

select * from TBLMEM;