-- ==================================
-- ROLES
-- ==================================

INSERT INTO roles(role_name)
VALUES
('ADMIN'),
('PORTFOLIO_MANAGER'),
('PROJECT_MANAGER');

-- ==================================
-- USERS
-- ==================================

INSERT INTO users(
    first_name,
    last_name,
    email,
    password_hash,
    role_id
)
VALUES
(
    'Admin',
    'User',
    'admin@ppm.com',
    'admin123',
    1
),
(
    'John',
    'PortfolioManager',
    'portfolio@ppm.com',
    'portfolio123',
    2
),
(
    'Sarah',
    'ProjectManager',
    'project@ppm.com',
    'project123',
    3
);

-- ==================================
-- PORTFOLIOS
-- ==================================

INSERT INTO portfolios(
    portfolio_name,
    description,
    budget,
    status,
    created_by
)
VALUES
(
    'Digital Transformation Portfolio',
    'Strategic transformation initiatives',
    1000000,
    'ACTIVE',
    2
);

-- ==================================
-- PROJECTS
-- ==================================

INSERT INTO projects(
    portfolio_id,
    project_name,
    description,
    project_type,
    status,
    requested_budget,

    strategic_alignment_score,
    roi_score,
    risk_score,
    innovation_score,
    feasibility_score,

    final_score,

    created_by
)
VALUES
(
    1,
    'ERP Migration',
    'Migration of legacy ERP system',
    'TRANSFORM',
    'DRAFT',
    250000,

    8,
    7,
    5,
    9,
    8,

    7.4,

    3
);