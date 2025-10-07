CREATE TABLE job (
    id BIGINT NOT NULL AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description VARCHAR(1000),
    budget DOUBLE,
    client_id BIGINT,
    PRIMARY KEY (id),
    CONSTRAINT fk_job_user FOREIGN KEY (client_id)
        REFERENCES users(id)
        ON DELETE SET NULL
        ON UPDATE CASCADE
);
