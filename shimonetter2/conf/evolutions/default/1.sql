# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table shimoneta (
  id                        bigint not null,
  userId                    bigint,
  message                   varchar(255),
  postdate                  timestamp not null,
  constraint pk_shimoneta primary key (id))
;

create table shimoneta_model (
  id                        bigint not null,
  uid                       bigint,
  message                   varchar(255),
  postdate                  timestamp,
  constraint pk_shimoneta_model primary key (id))
;

create table user (
  user_id                   bigint not null,
  user_name                 varchar(255),
  sex                       varchar(255),
  birthday                  timestamp,
  constraint pk_user primary key (user_id))
;

create sequence shimoneta_seq;

create sequence shimoneta_model_seq;

create sequence user_seq;

alter table shimoneta add constraint fk_shimoneta_user_1 foreign key (userId) references user (user_id) on delete restrict on update restrict;
create index ix_shimoneta_user_1 on shimoneta (userId);



# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists shimoneta;

drop table if exists shimoneta_model;

drop table if exists user;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists shimoneta_seq;

drop sequence if exists shimoneta_model_seq;

drop sequence if exists user_seq;

