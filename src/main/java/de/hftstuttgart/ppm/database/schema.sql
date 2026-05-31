-- ==========================================
-- HYBRID AGILE PROJECT PORTFOLIO MANAGEMENT
-- DATABASE SCHEMA
-- ==========================================

-- ==========================================
-- ROLES
-- ==========================================

CREATE TABLE roles (

    role_id BIGSERIAL PRIMARY KEY,

    role_name VARCHAR(50) NOT NULL UNIQUE
);

-- ==========================================
-- USERS
-- ==========================================

CREATE TABLE users (

    user_id BIGSERIAL PRIMARY KEY,

    first_name VARCHAR(100) NOT NULL,

    last_name VARCHAR(100) NOT NULL,

    email VARCHAR(255) NOT NULL UNIQUE,

    password_hash VARCHAR(255) NOT NULL,

    role_id BIGINT NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_users_role
        FOREIGN KEY (role_id)
        REFERENCES roles(role_id)
);

-- ==========================================
-- PORTFOLIOS
-- ==========================================

CREATE TABLE portfolios (

    portfolio_id BIGSERIAL PRIMARY KEY,

    portfolio_name VARCHAR(255) NOT NULL,

    description TEXT,

    budget DECIMAL(15,2) NOT NULL,

    status VARCHAR(50) NOT NULL,

    created_by BIGINT NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_portfolio_user
        FOREIGN KEY (created_by)
        REFERENCES users(user_id)
);

-- ==========================================
-- PROJECTS
-- ==========================================

CREATE TABLE projects (

    project_id BIGSERIAL PRIMARY KEY,

    portfolio_id BIGINT NOT NULL,

    project_name VARCHAR(255) NOT NULL,

    description TEXT,

    project_type VARCHAR(50) NOT NULL,

    status VARCHAR(50) NOT NULL,

    requested_budget DECIMAL(15,2) NOT NULL,

    strategic_alignment_score INTEGER,

    roi_score INTEGER,

    risk_score INTEGER,

    innovation_score INTEGER,

    feasibility_score INTEGER,

    final_score DECIMAL(5,2),

    created_by BIGINT NOT NULL,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_project_portfolio
        FOREIGN KEY (portfolio_id)
        REFERENCES portfolios(portfolio_id),

    CONSTRAINT fk_project_user
        FOREIGN KEY (created_by)
        REFERENCES users(user_id)
);

-- ==========================================
-- APPROVALS
-- ==========================================

CREATE TABLE approvals (

    approval_id BIGSERIAL PRIMARY KEY,

    project_id BIGINT NOT NULL,

    approver_id BIGINT NOT NULL,

    status VARCHAR(50) NOT NULL,

    comments TEXT,

    approved_at TIMESTAMP,

    CONSTRAINT fk_approval_project
        FOREIGN KEY (project_id)
        REFERENCES projects(project_id),

    CONSTRAINT fk_approval_user
        FOREIGN KEY (approver_id)
        REFERENCES users(user_id)
);

-- ==========================================
-- AUDIT LOGS
-- ==========================================

CREATE TABLE audit_logs (

    audit_id BIGSERIAL PRIMARY KEY,

    user_id BIGINT NOT NULL,

    action_type VARCHAR(100) NOT NULL,

    entity_type VARCHAR(100) NOT NULL,

    entity_id BIGINT NOT NULL,

    description TEXT,

    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_audit_user
        FOREIGN KEY (user_id)
        REFERENCES users(user_id)
);