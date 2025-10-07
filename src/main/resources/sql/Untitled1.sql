CREATE TABLE skill (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    category VARCHAR(255),
    description VARCHAR(1000),
    user_id BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT fk_skill_user FOREIGN KEY (user_id)
        REFERENCES users(id)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);
