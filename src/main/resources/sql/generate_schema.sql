create table user (
  id                        bigint auto_increment not null,
  name                      varchar(255),
  nickname                  varchar(255) not null unique,
  is_admin                  boolean default 'false',
  password                  varchar(255) not null,
  constraint pk_user primary key (id))
;

create table author (
  id                        bigint auto_increment not null,
  fullname                  varchar(255) not null,
  about                     varchar(2000),
  constraint pk_author primary key (id))
;

create table book (
  id                        bigint auto_increment not null,
  title                     varchar(255) not null,
  genre                     varchar(255) not null,
  description               varchar(3000),
  author_id                 bigint not null,
  constraint pk_book primary key (id))
;

alter table book add constraint fk_book_author foreign key (author_id) references author (id) on delete restrict on update restrict;