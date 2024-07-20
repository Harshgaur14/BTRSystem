Overview

The Bus Ticket Reservation System is a web application designed to manage bus reservations. It includes functionality for user and admin registration, authentication, and authorization using JWT tokens.

API Endpoints

User Registration

Endpoint: POST /user/signup

Description: Registers a new user.

URL: http://localhost:8080/user/signup

Admin Registration

Endpoint: POST /admin/signup

Description: Registers a new admin.

URL: http://localhost:8080/admin/signup

Authentication

Endpoint: POST /login

Description: Authenticates users and admins. Returns a JWT token for authorized access.

Roles ROLE_USER: Assigned to users who can book bus tickets and manage their reservations. ROLE_ADMIN: Assigned to admins who can add and manage bus details.

Authorization JWT (JSON Web Token) is used for both authentication and authorization across the system. Ensure you include the JWT token in the Authorization header for protected endpoints.
