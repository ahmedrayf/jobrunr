
CREATE TABLE IF Not exists job_info
(
    id                  BIGINT AUTO_INCREMENT PRIMARY KEY,
    job_name            VARCHAR(255),
    cron_expression     VARCHAR(255),
    url                 VARCHAR(255),
    grpc_server_address VARCHAR(255),
    grpc_server_port    INT,
    job_type       VARCHAR(50),
    internal_method     VARCHAR(255)
);


INSERT INTO job_info (job_name, cron_expression, url, grpc_server_address, grpc_server_port, job_type, internal_method)
VALUES
('internal-daily-report', '*/10 * * * * *', NULL, NULL, NULL, 'INTERNAL', 'dailyReportJobHandler'),
('internal-validator', '*/15 * * * * *', NULL, NULL, NULL, 'INTERNAL', 'validatorJobHandler'),
('rest-api-call', '*/30 * * * * *', 'https://example.com/api/endpoint', NULL, NULL, 'REST', NULL),
('grpc-server-job', '0 0/1 * * * *', NULL, 'localhost', 8080, 'GRPC', NULL);