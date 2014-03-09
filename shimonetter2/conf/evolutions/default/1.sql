# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table shimoneta_model (
  id                        bigint not null,
  uid                       bigint,
  message                   varchar(255),
  postdate                  timestamp,
  constraint pk_shimoneta_model primary key (id))
;

create sequence shimoneta_model_seq;




# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;

drop table if exists shimoneta_model;

SET REFERENTIAL_INTEGRITY TRUE;

drop sequence if exists shimoneta_model_seq;

