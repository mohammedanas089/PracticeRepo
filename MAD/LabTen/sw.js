// sw.js

self.addEventListener('install', event => {
    console.log('Service worker installing');
    self.skipWaiting();
});

self.addEventListener('activate', event => {
    console.log('Service worker activating...');
});

self.addEventListener('fetch', event => {
    console.log('Fetching', event.request.url);
    // Add caching or other fetch handling logic here if needed
});
