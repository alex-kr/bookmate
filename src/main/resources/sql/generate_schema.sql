create table user (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  nickname                  varchar(255),
  is_admin                  boolean,
  password                  varchar(255),
  constraint pk_user primary key (id))
;

create table author (
  id                        bigint auto_increment not null,
  fullname                  varchar(255),
  about                     varchar(2000),
  constraint pk_author primary key (id))
;

create table book (
  id                        bigint auto_increment not null,
  title                     varchar(255),
  genre                     varchar(255),
  description               varchar(3000),
  author_id                 bigint,
  constraint pk_book primary key (id))
;

alter table book add constraint fk_book_author foreign key (author_id) references author (id) on delete restrict on update restrict;