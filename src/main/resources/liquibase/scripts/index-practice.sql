-- liquibase formatted sql

-- changeset kulakov:1
CREATE INDEX student_name_index ON student (name);
-- changeset kulakov:2
CREATE INDEX faculty_name-color_index ON users (name, color);