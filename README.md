# GN Solution Portal

A professional, enterprise-grade web application and backend API structure featuring modern developer showcases, a software directory, and security-hardened Java entities.

## 🚀 Features

- **Responsive Frontend:** Clean design using HTML5, CSS3, and modern UI practices.
- **Developer Showcase:** Showcase software projects, repositories, and technical stacks.
- **Software Directory:** Managed repository for verified desktop software and executables.
- **Product Blog:** Technical articles and system architecture deep-dives.
- **Hardened Security:** Embedded CORS filters, Content Security Policy (CSP), and HTTP security headers (`SecurityHeaderFilter.java`).
- **Domain Data Entities:** Java entities for `Developer`, `Project`, `Software`, and `Article`.

## 📁 Repository Structure

```text
gn-solution/
├── .github/
│   └── workflows/
│       └── deploy.yml
├── backend/
│   └── src/
│       └── main/
│           └── java/
│               └── com/
│                   └── gnsolution/
│                       ├── config/
│                       │   ├── CorsConfig.java
│                       │   └── SecurityHeaderFilter.java
│                       └── model/
│                           ├── Article.java
│                           ├── Developer.java
│                           ├── Project.java
│                           └── Software.java
├── frontend/
│   ├── css/
│   │   └── style.css
│   ├── js/
│   │   └── main.js
│   ├── index.html
│   ├── projects.html
│   ├── software.html
│   └── blog.html
├── .gitignore
└── README.md
