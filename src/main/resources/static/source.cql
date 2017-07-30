CREATE KEYSPACE IF NOT EXISTS questionnaire WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};

CREATE TYPE IF NOT EXISTS questionnaire.answerModelType (
  possible_answer text,
  correct boolean
);


CREATE TYPE IF NOT EXISTS questionnaire.questionModelType (
body text,
answers list<frozen <answerModelType>>
);


CREATE TABLE IF NOT EXISTS questionnaire.questionnaires_detailed (
questionnaire_id uuid,
creation_date timestamp,
questions list<frozen <questionModelType>>,
title text,
author text ,
PRIMARY KEY(questionnaire_id, creation_date)) WITH CLUSTERING ORDER BY(creation_date DESC);

CREATE TABLE IF NOT EXISTS questionnaire.questionnaires_list(
  questionnaire_id uuid,
  creation_date timestamp,
  title TEXT,
  PRIMARY KEY(questionnaire_id,creation_date)) WITH CLUSTERING ORDER BY(creation_date DESC);

CREATE TABLE IF NOT EXISTS questionnaire.users_by_email(
  email TEXT,
  creation_date timestamp,
  password TEXT,
  nickname TEXT,
  first_name TEXT,
  last_name TEXT,
  roles SET<TEXT>,
  phone_number TEXT,
  is_account_expired boolean,
  is_accont_locked boolean,
  is_credentials_expired boolean,
  is_enabled boolean,
  PRIMARY KEY(email, creation_date)) WITH CLUSTERING ORDER BY(creation_date DESC);