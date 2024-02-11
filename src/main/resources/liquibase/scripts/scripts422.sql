CREATE TABLE Cur
(
    id    SERIAL PRIMARY KEY,
    brand TEXT,
    model TEXT,
    cost  NUMERIC(11, 2)
);
CREATE TABLE Person
(
    id      SERIAL,
    name    TEXT PRIMARY KEY,
    age     INTEGER,
    license BOOLEAN,
    cur_id  INTEGER REFERENCES Cur (id)
);