document.addEventListener('DOMContentLoaded', () => {
    // Dynamically highlight active navigation link based on current path
    const currentPath = window.location.pathname.split('/').pop() || 'index.html';
    const navLinks = document.querySelectorAll('.nav-menu a');

    navLinks.forEach(link => {
        const linkPath = link.getAttribute('href');
        if (linkPath === currentPath) {
            link.classList.add('active');
        } else {
            link.classList.remove('active');
        }
    });

    // Console security banner
    console.log(
        '%c GN Solution ',
        'background: #0ea5e9; color: #fff; font-size: 14px; font-weight: bold; padding: 4px 8px; border-radius: 4px;'
    );
    console.log('Secure portal initialised.');
});