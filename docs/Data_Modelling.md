# Data modeling

## Requirements:

### 1. Basic requirements:
As a user:
- I want to login 
- Once logged in, I am redirected to a page containing a list with existent questionnaires 
- I am able to take a questionnaire and submit my responses
- Once my responses have been submitted I will receive feedback if my answers where right or wrong.
- Once logged in, I always have an option of creating new questionnaires 
- If I create a questionnaire this will be automatically displayed on a page containing the entire list with other questionnaires. 

### 2. Additional requirements
As a user:
- I must be able to navigate to my-account page
- On my account-page I can see a list of all questionnaire I have created
- I am able to leave comments and rate any questionnaire I took

## Tables:

### For authentication

user_by_email:

Column name              | Type
------------             | -------------
email       K            | TEXT
password    C            | TEXT
nickname                 | TEXT
first_name               | TEXT
last_name                | TEXT
roles                    | SET
phone_number             | TEXT
is_account_expired       | boolean
is_account_locket        | boolean
is_credentials_expired   | boolean
is_enabled               | boolean

### Questionnaires:

questionnaire_list:

Column name              | Type
------------             | -------------
questionnaire_id    K     | UUID 
creation_time       C    | timestamp 
title                    | TEXT



questionnaire_detailed:

Column name              | Type
------------             | -------------
questionnaire_id     K   | UUID
creation_time            | timestamp
title                    | TEXT
creator_nickname         | TEXT
questions                | frozen question
answer                   | list custom type answer


type question:

Column name              | Type
------------             | -------------
body                     | TEXT
answers                  | frozen answer

type answer:

Column name              | Type
------------             | -------------
possible_answer          | TEXT
correct                  | boolean
