ALTER TABLE Student
ALTER
COLUMN age CHECK (age>15);
ALTER TABLE Student
    ALTER COLUMN name SET NOT NULL;
ALTER TABLE Student
    ADD CONSTRAINT name_unique UNIQUE (name);
ALTER TABLE Faculty
    ADD CONSTRAINT name_color_unique UNIQUE (name, color);
ALTER TABLE Student
    ADD CONSTRAINT age_default DEFAULT 20 FOR age;