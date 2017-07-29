CREATE TYPE answer(
	possible_answer TEXT,
	correct 	boolean
);

CREATE TYPE question(
 body TEXT,
 answers list <frozen <answer>>
);

